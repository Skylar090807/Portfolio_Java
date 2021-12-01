package kr.gseo.craw;

import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.imageio.ImageIO;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class DisneyNews {

	public static void main(String[] args) throws IOException{
		// 1. 원하는 url 주소 지정
		String URL = "https://news.naver.com/main/read.naver?mode=LSD&mid=shm&sid1=105&oid=005&aid=0001483924";

	   // 2. url에서 전체 구조를 받아온다
	    	Document  doc = Jsoup.connect(URL).get(); 
	   
	   // 3. 원하는 요소만 추출한다.
	    	Elements Title = doc.select("#articleTitle");//제목 추출
	    	Elements BodyContents = doc.select("#articleBodyContents");//내용 추출
	    	Elements actor = doc.select("#articleBody  div.journalistcard_summary_name");//기자 추출
            Elements imgUrl = doc.select("#articleBodyContents img");//이미지 추출
            
	  //  4. 요소의 값을 변수에 저장 후 화면 출력하기 
	    	String title_str = Title.text();
	    	String BodyContents_str = BodyContents.text();
	    	String actor_str = actor.text();

	    	
	    	System.out.println("-------------------------------------");			  
	    	System.out.println(Title.text()); 
	    	
	    	String[] p = BodyContents.get(0).text().split("\\. ");
//	    	System.out.println(p.length);

            for (int i = 0; i < p.length; i++) {
                System.out.println(p[i]+".");
            }
            
            //javadata폴더 하위 nnews폴더 Disneyarticle.txt파일에 뉴스 내용 출력
            Writer writer = new FileWriter("C:/javadata/nnews/Disneyarticle.txt");
            //뉴스 기사 제목 출력.
            writer.write(Title.text()+"\n");
            
            //뉴스 내용(문단 단위로 출력
            for(int i=0; i<p.length; i++) {
            	writer.write(p[i]+".\n");
            }
            //기자명
            writer.write(actor.text()+"\n");
            
            writer.flush();
            writer.close();
            
            
            
            
            //javadata폴더 하위 nnews폴더 DisneyImg 이미지 파일 저장.
            
            System.out.println(imgUrl);
            
            for (int i = 0; i < imgUrl.size(); i++) {
            
              String tagsrc = imgUrl.get(i).attr("src");
              
              URL wturl = new URL(tagsrc);
              HttpURLConnection conn = (HttpURLConnection)wturl.openConnection();

              conn.setRequestProperty("Referer", tagsrc);
              BufferedImage img = ImageIO.read(conn.getInputStream());

              FileOutputStream out = new FileOutputStream("C:\\javadata\\nnews\\DisneyImg" + (i + 1) +".jpg");
              ImageIO.write(img, "jpg", out);
              
              System.out.println("C:\\javadata\\nnews\\DisneyImg" + (i + 1) +".jpg"+"크롤링 완료");
              
              out.close();
          }  


	    	
	    	
		
	 

	}

}
