package csh01.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class DBConBase {

	public static void main(String[] args) {
		Connection conn = null; 

	      Statement stmt = null; //=> sql�������� �����ϰڴ�

	         try { 

	            Class.forName("com.mysql.cj.jdbc.Driver"); // ����̺� ����

	            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb","root","");// localhost:3306/~~ : db��, "0000" : mysql ��й�ȣ 

	            stmt = conn.createStatement();// =>sql ������ ���� ���ڴ�

	            

	            

	            

//	            String sql = "insert into usertbl values('k1cs','s336')"; //mysql ������ ""ū����ǥ �ȿ� ��� ����

//	            stmt.executeUpdate(sql);

	            

	            String sql2 = "select * from usertbl";

	            ResultSet rs= stmt.executeQuery(sql2); // ResultSet����Ͽ� ���̺� ���� ����

	            

	            while (rs.next()) { //rs�� �ڷᰡ �ִ��� Ȯ��, �ڷᰡ �ִٸ�

	               System.out.println(rs.getString("userid"));

	            }

	            

	               rs.close();

	               stmt.close();

	               conn.close();

	         

	         } catch (ClassNotFoundException e) { 

	            System.out.println(e);

	         } catch (SQLException e) { 

	            System.out.println(e);

	         }

	}

}
