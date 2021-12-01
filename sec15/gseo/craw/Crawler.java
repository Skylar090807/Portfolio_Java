package kr.gseo.craw;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class Crawler {
	public static void main(String[] args) {
		
		// 1. 원하는 url 주소 지정
		String URL = "https://bit.ly/3kmzjWp"; 

		
	    try {
	   // 2. url에서 전체 구조를 받아온다
	    	Document  doc = Jsoup.connect(URL).get(); 
	   
	   // 3. 원하는 요소만 추출한다.
	    	Elements Title = doc.select("#articleTitle");
	    	Elements BodyContents = doc.select("#articleBodyContents");
	    	Elements actor = doc.select("#articleBody > div.byline > p");
	    	//#articleBody > div.byline > p

	   // 4. 추출한 요소를 변수에 저장하거나 출력한다.  
	    	System.out.println(Title.text());   
	    	System.out.println(BodyContents.text());   
	    	System.out.println(actor.text());
	    	
	  //  5. 요소의 값을 변수에 저장 후 화면 출력하기 
	    	String title_str = Title.text();
	    	String BodyContents_str = BodyContents.text();
	    	String actor_str = actor.text();
	    	System.out.println("--------------------------------------------");
	    	System.out.println(title_str);
	    	System.out.println(BodyContents_str);
	    	System.out.println(actor_str);
	    	
	    	System.out.println("-------------------------------------");			  
	    	System.out.println(Title.text()); 
	    	
	    	String[] p = BodyContents.get(0).text().split("\\. ");
//	    	System.out.println(p.length);

            for (int i = 0; i < p.length; i++) {
                System.out.println(p[i]+".");
            }
            
            //news.txt 파일에 뉴스 내용 출력
            Writer writer = new FileWriter("C:/javadata/new.txt");
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

	    	
	    	
		
	  } catch (IOException e) {
			e.printStackTrace();
			}

	
		
	
		
		
		
	}
}
