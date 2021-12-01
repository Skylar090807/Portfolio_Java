package csh01.exam01;
// https://dev.mysql.com/downloads/connector/j/

import java.io.IOException;
import java.sql.*;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class DBcon3 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null; 
		Statement stmt = null; //=> sql�������� �����ϰڴ�
		try {	 
				Class.forName("com.mysql.cj.jdbc.Driver"); // ����̺� ����
			
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","gangseofrontend@21");			
				// localhost:3306/~~ : db��, "0000" : mysql ��й�ȣ 
				stmt = conn.createStatement();// =>sql ������ ���� ���ڴ�
				
				//���� ũ�Ѹ��ϱ�				
				String URL = "https://news.naver.com/"; 

			    try {
			     	Document  doc = Jsoup.connect(URL).get();//https://news.naver.com �ּ��� html�ҽ��ڵ� ũ�Ѹ�
			     	
			    	Elements Category  = doc.select("#section_politics > div.com_header > h4 > a"); //��������			    	
			    	Elements Title  = doc.select("#section_politics > div.com_list   strong"); //��������
			    	
			    	System.out.println(Title);
			    	System.out.println(Title.size());
			     	String  p = Category.get(0).text();; // ī�װ� ����
			     	
			    	int size1 = Title.size();	//5		    	
			     	String [] p2 = new String [size1];   //���� Ÿ��Ʋ ����
			     	String sql=null;

			     	try {
		                for (int i = 0; i < size1; i++) {
		            	p2[i] = Title.get(i).text().replace("\'", " ");		            	
						sql = "insert into news(Category,title) values('" + p + "','" + p2[i] +"')"; 
						stmt.executeUpdate(sql);
		                  }
		                }
			     	catch(ArrayIndexOutOfBoundsException e) {
			     		e.printStackTrace();
			     	}
		
				String sql2 = "select * from news";
				ResultSet rs= stmt.executeQuery(sql2); // ResultSet����Ͽ� ���̺� ���� ����
				
				while (rs.next()) { //rs�� �ڷᰡ �ִ��� Ȯ��, �ڷᰡ �ִٸ�
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


	