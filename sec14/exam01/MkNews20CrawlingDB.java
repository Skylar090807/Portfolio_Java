package csh01.exam01;

import java.io.FileReader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.sql.*;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MkNews20CrawlingDB {
	public static void main(String[] args) throws SQLException{
		
		//1.크롤링 대상 URL 주소 가져오기.
		String MK = "https://find.mk.co.kr/new/search.php?pageNum=1&cat=&cat1=&media_eco=&pageSize=20&sub=news&dispFlag=OFF&page=news&s_kwd=%BF%E4%BC%D2%BC%F6&s_page=news&go_page=&ord=1&ord1=1&ord2=0&s_keyword=%BF%E4%BC%D2%BC%F6&s_i_keyword=%BF%E4%BC%D2%BC%F6&s_author=&y1=2018&m1=11&d1=18&y2=2021&m2=11&d2=18&ord=1&area=ttbd";
		Connection conndb = null; //커넥션 초기화
		Statement stmt = null; // 스테이트먼트 초기화 => sql문장으로 수행하겠다 // try바깥 쪽에 있어서 메인함수에 SQLException 줌
		
        try {
			
			try {
			
		
				Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이브 생성, cj를 버전에 맞춰 빼거나 넣을 수 있다.
			    
				//데이터베이스 연결
				conndb = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","gangseofrontend@21");			
				// mySQL 접속해서 연결, localhost:3306/~~ : db명, "0000" : mysql 비밀번호 
				stmt = conndb.createStatement();// =>sql 문장을 만들어서 쓰겠다, stmt는  sql문 가리키는 객체가 됨
		
		//URL에서 전체 구조 받는다.
		Document doc = Jsoup.connect(MK).get();
		
		
		// MkNewsCrawling폴더에 Mk파일 저장
		Writer writer = new FileWriter("C:/javadata/MkNewsCrawling/Mk.txt");
		
		
		writer.write("[매일경제 요소수 검색 헤드라인]--------------------------------------"+"\n");
		
		
		final int	SIZE = 20;
		
    	String	yososu[] = new String[SIZE];
    	
    	for(int i=1; i<=yososu.length; i++) {
    		yososu[i-1] = doc.select("body td:nth-child(1) > div:nth-child("+(5+i)+") > span.art_tit > a"+"\n").text();
    		writer.write(yososu[i-1]+"\n");
    		
    		String sql="insert into mk(title) values('"+yososu[i-1]+"')";
			stmt.executeUpdate(sql);//sql 문 실행
    	}
    	
//    	for(int i=1; i<yososu.length; i++) {
//    		System.out.println(yososu[i]);
//    	}
    	
    	writer.write("------------------------------------------------------------"+"\n");
    	writer.write("Maker: Choe Seung Hee");
    	
		
		
    	writer.flush();
    	
		Reader reader = new FileReader("C:/javadata/MkNewsCrawling/Mk.txt");
		while(true) {
			int data = reader.read();
			if(data == -1)
				break;
			System.out.print((char)data);
		}
		
		reader.close();
		writer.close();
		
		String sql2 = "select * from mk"; //webtoon 테이블 모든 내용 출력 쿼리문
        ResultSet rs = stmt.executeQuery(sql2);//출력한 쿼리문 rs에 저장.
        
        while(rs.next()) { //값 콘솔에 출력.
        	System.out.println(rs.getString("title"));
        }
		
		
		
			}
	        catch (IOException   e) { 
				System.out.println(e);
	        

			
			}
			
			
		}
			catch(ClassNotFoundException e){ 
				System.out.println(e);
				}


		

	}

}
