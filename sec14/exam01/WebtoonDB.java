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
		
		String URL = "https://comic.naver.com/webtoon/detail?titleId=776601&no=18&weekday=fri";//����ȸ��
		Connection conndb = null; //Ŀ�ؼ� �ʱ�ȭ
		Statement stmt = null; // ������Ʈ��Ʈ �ʱ�ȭ => sql�������� �����ϰڴ� // try�ٱ� �ʿ� �־ �����Լ��� SQLException ��
		
		try {
			
			try {
			
		
				Class.forName("com.mysql.cj.jdbc.Driver"); // ����̺� ����, cj�� ������ ���� ���ų� ���� �� �ִ�.
			    
				//�����ͺ��̽� ����
				conndb = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","gangseofrontend@21");			
				// mySQL �����ؼ� ����, localhost:3306/~~ : db��, "0000" : mysql ��й�ȣ 
				stmt = conndb.createStatement();// =>sql ������ ���� ���ڴ�, stmt��  sql�� ����Ű�� ��ü�� ��
		
				Document webtoon = Jsoup.connect(URL).get();
//        		System.out.println(webtoon.select(".wt_viewer > img"));//img �±� ��ü �ҽ� �ҷ�����

				Elements imgUrl = webtoon.select(".wt_viewer > img");//Arraylist<Elements>
				System.out.println(imgUrl);
//      		String frontURL = "https://www.knps.or.kr"; //������ ���� �ð����⵵ ���� ��.
        
				for (int i = 0; i < imgUrl.size(); i++) {
//            	System.out.println(imgUrl.get(i).attr("src"));
				String src = imgUrl.get(i).attr("src");
            
				String sql="insert into webtoon(contents) values('"+src+"')";
				stmt.executeUpdate(sql);//sql �� ����
            
				URL wturl = new URL(src);
				HttpURLConnection conn = (HttpURLConnection)wturl.openConnection();

				conn.setRequestProperty("Referer", src);
				BufferedImage img = ImageIO.read(conn.getInputStream());

//          	C����̺� javadata �ȿ� webtoon1���� �̸� �������� ��.
				FileOutputStream out = new FileOutputStream("C:\\javadata\\webtoonDB\\IMAG01_" + (i + 1) + ".jpg");
				ImageIO.write(img, "jpg", out);
        }
        
        String sql2 = "select * from webtoon"; //webtoon ���̺� ��� ���� ��� ������
        ResultSet rs = stmt.executeQuery(sql2);//����� ������ rs�� ����.
        
        while(rs.next()) { //�� �ֿܼ� ���.
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
