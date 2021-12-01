package or.crawling;

import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.imageio.ImageIO;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.sql.*;
import java.util.*;


public class WebtoonDB {

	public static void main(String[] args) throws SQLException {
		
		String URL = "https://comic.naver.com/webtoon/detail?titleId=776601&no=18&weekday=fri";//광마회귀
		Connection conndb = null; //커넥션 초기화
		Statement stmt = null; // 스테이트먼트 초기화 => sql문장으로 수행하겠다 // try바깥 쪽에 있어서 메인함수에 SQLException 줌
		
		try {
			
			try {
			
		
				Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이브 생성, cj를 버전에 맞춰 빼거나 넣을 수 있다.
			    
				//데이터베이스 연결
				conndb = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","gangseofrontend@21");			
				// mySQL 접속해서 연결, localhost:3306/~~ : db명, "0000" : mysql 비밀번호 
				stmt = conndb.createStatement();// =>sql 문장을 만들어서 쓰겠다, stmt는  sql문 가리키는 객체가 됨
		
				Document webtoon = Jsoup.connect(URL).get();
//        		System.out.println(webtoon.select(".wt_viewer > img"));//img 태그 전체 소스 불러오기

				Elements imgUrl = webtoon.select(".wt_viewer > img");//Arraylist<Elements>
				System.out.println(imgUrl);
//      		String frontURL = "https://www.knps.or.kr"; //지리산 예제 시간복잡도 줄인 것.
        
				for (int i = 0; i < imgUrl.size(); i++) {
//            	System.out.println(imgUrl.get(i).attr("src"));
				String src = imgUrl.get(i).attr("src");
            
				String sql="insert into webtoon(contents) values('"+src+"')";
				stmt.executeUpdate(sql);//sql 문 실행
            
				URL wturl = new URL(src);
				HttpURLConnection conn = (HttpURLConnection)wturl.openConnection();

				conn.setRequestProperty("Referer", src);
				BufferedImage img = ImageIO.read(conn.getInputStream());

//          	C드라이브 javadata 안에 webtoon1폴더 미리 만들어줘야 함.
				FileOutputStream out = new FileOutputStream("C:\\javadata\\webtoonDB\\IMAG01_" + (i + 1) + ".jpg");
				ImageIO.write(img, "jpg", out);
        }
        
        String sql2 = "select * from webtoon"; //webtoon 테이블 모든 내용 출력 쿼리문
        ResultSet rs = stmt.executeQuery(sql2);//출력한 쿼리문 rs에 저장.
        
        while(rs.next()) { //값 콘솔에 출력.
        	System.out.println(rs.getString("title") + "," + rs.getString("contents"));
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
