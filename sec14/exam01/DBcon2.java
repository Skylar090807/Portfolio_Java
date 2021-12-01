package csh01.exam01;
// https://dev.mysql.com/downloads/connector/j/

import java.io.IOException;
import java.sql.*;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class DBcon2 {

	public static void main(String[] args) throws SQLException { 
		
		Connection conn = null; //커넥션 초기화
		Statement stmt = null; // 스테이트먼트 초기화 => sql문장으로 수행하겠다 // try바깥 쪽에 있어서 메인함수에 SQLException 줌
		
		try { 	 
				Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이브 생성, cj를 버전에 맞춰 빼거나 넣을 수 있다.
			
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","gangseofrontend@21");			
				// mySQL 접속해서 연결, localhost:3306/~~ : db명, "0000" : mysql 비밀번호 
				stmt = conn.createStatement();// =>sql 문장을 만들어서 쓰겠다, stmt는  sql문 가리키는 객체가 됨
				
				//뉴스 크롤링하기				
				String URL = "https://news.naver.com/"; 

			    try {
			     	Document  doc = Jsoup.connect(URL).get(); //https://news.naver.com/ 주소의 html소스코드  크롤링
			     	
			    	Elements Category  = doc.select("#section_politics > div.com_header > h4 > a"); //제목추출			    	
			    	Elements Title  = doc.select("#section_politics > div.com_list > div   strong"); //제목추출
			    	System.out.println(Title);
			    	System.out.println(Title.size());
			     	String  p=Category.get(0).text();; // 카테고리 저장
			     	
			    	int size1 = Title.size();	//5		    	
			     	String [] p2 = new String [size1];   //뉴스 타이틀 저장 사이즈만큼 배열 선언, 공간 REM에 잡는다
			     	String sql=null;

			     	try {
		            for (int i = 0; i < size1; i++) {
		            	p2[i] = Title.get(i).text().replace("\'", " ");		// \'을 스페이스로 바꿔라.sql 이 \' 인식 못 하도록 처리한 것.
						sql = "insert into news(Category,title) values('" + p + "','" + p2[i] +"')"; 
						stmt.executeUpdate(sql);//DB에 저장
		            }}
			     	catch(ArrayIndexOutOfBoundsException e) {// catch문은 상위레벨 먼저 쓴다.
			     		e.printStackTrace();
			     	}
		
				String sql2 = "select * from news";
				ResultSet rs= stmt.executeQuery(sql2); // ResultSet사용하여 테이블 정보 저장
				
				while (rs.next()) { //rs에 자료가 있는지 확인, 자료가 있다면
					System.out.println(rs.getString("category") + "," + rs.getString("title"));
				}
				
	            rs.close();
	            stmt.close();
	            conn.close();			
			}
			    catch (IOException e) { 
					System.out.println(e);
		} 
	}
	catch(ClassNotFoundException e){ 
		System.out.println(e);
		} 
	}
}