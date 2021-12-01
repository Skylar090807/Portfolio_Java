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

	      Statement stmt = null; //=> sql문장으로 수행하겠다

	         try { 

	            Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이브 생성

	            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb","root","");// localhost:3306/~~ : db명, "0000" : mysql 비밀번호 

	            stmt = conn.createStatement();// =>sql 문장을 만들어서 쓰겠다

	            

	            

	            

//	            String sql = "insert into usertbl values('k1cs','s336')"; //mysql 문장을 ""큰따옴표 안에 적어서 수행

//	            stmt.executeUpdate(sql);

	            

	            String sql2 = "select * from usertbl";

	            ResultSet rs= stmt.executeQuery(sql2); // ResultSet사용하여 테이블 정보 저장

	            

	            while (rs.next()) { //rs에 자료가 있는지 확인, 자료가 있다면

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
