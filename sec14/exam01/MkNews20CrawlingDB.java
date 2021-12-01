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
		
		//1.ũ�Ѹ� ��� URL �ּ� ��������.
		String MK = "https://find.mk.co.kr/new/search.php?pageNum=1&cat=&cat1=&media_eco=&pageSize=20&sub=news&dispFlag=OFF&page=news&s_kwd=%BF%E4%BC%D2%BC%F6&s_page=news&go_page=&ord=1&ord1=1&ord2=0&s_keyword=%BF%E4%BC%D2%BC%F6&s_i_keyword=%BF%E4%BC%D2%BC%F6&s_author=&y1=2018&m1=11&d1=18&y2=2021&m2=11&d2=18&ord=1&area=ttbd";
		Connection conndb = null; //Ŀ�ؼ� �ʱ�ȭ
		Statement stmt = null; // ������Ʈ��Ʈ �ʱ�ȭ => sql�������� �����ϰڴ� // try�ٱ� �ʿ� �־ �����Լ��� SQLException ��
		
        try {
			
			try {
			
		
				Class.forName("com.mysql.cj.jdbc.Driver"); // ����̺� ����, cj�� ������ ���� ���ų� ���� �� �ִ�.
			    
				//�����ͺ��̽� ����
				conndb = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","gangseofrontend@21");			
				// mySQL �����ؼ� ����, localhost:3306/~~ : db��, "0000" : mysql ��й�ȣ 
				stmt = conndb.createStatement();// =>sql ������ ���� ���ڴ�, stmt��  sql�� ����Ű�� ��ü�� ��
		
		//URL���� ��ü ���� �޴´�.
		Document doc = Jsoup.connect(MK).get();
		
		
		// MkNewsCrawling������ Mk���� ����
		Writer writer = new FileWriter("C:/javadata/MkNewsCrawling/Mk.txt");
		
		
		writer.write("[���ϰ��� ��Ҽ� �˻� ������]--------------------------------------"+"\n");
		
		
		final int	SIZE = 20;
		
    	String	yososu[] = new String[SIZE];
    	
    	for(int i=1; i<=yososu.length; i++) {
    		yososu[i-1] = doc.select("body td:nth-child(1) > div:nth-child("+(5+i)+") > span.art_tit > a"+"\n").text();
    		writer.write(yososu[i-1]+"\n");
    		
    		String sql="insert into mk(title) values('"+yososu[i-1]+"')";
			stmt.executeUpdate(sql);//sql �� ����
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
		
		String sql2 = "select * from mk"; //webtoon ���̺� ��� ���� ��� ������
        ResultSet rs = stmt.executeQuery(sql2);//����� ������ rs�� ����.
        
        while(rs.next()) { //�� �ֿܼ� ���.
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
