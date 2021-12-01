package kr.gseo.craw;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class Crawler {
	public static void main(String[] args) {
		
		// 1. ���ϴ� url �ּ� ����
		String URL = "https://bit.ly/3kmzjWp"; 

		
	    try {
	   // 2. url���� ��ü ������ �޾ƿ´�
	    	Document  doc = Jsoup.connect(URL).get(); 
	   
	   // 3. ���ϴ� ��Ҹ� �����Ѵ�.
	    	Elements Title = doc.select("#articleTitle");
	    	Elements BodyContents = doc.select("#articleBodyContents");
	    	Elements actor = doc.select("#articleBody > div.byline > p");
	    	//#articleBody > div.byline > p

	   // 4. ������ ��Ҹ� ������ �����ϰų� ����Ѵ�.  
	    	System.out.println(Title.text());   
	    	System.out.println(BodyContents.text());   
	    	System.out.println(actor.text());
	    	
	  //  5. ����� ���� ������ ���� �� ȭ�� ����ϱ� 
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
            
            //news.txt ���Ͽ� ���� ���� ���
            Writer writer = new FileWriter("C:/javadata/new.txt");
            //���� ��� ���� ���.
            writer.write(Title.text()+"\n");
            
            //���� ����(���� ������ ���
            for(int i=0; i<p.length; i++) {
            	writer.write(p[i]+".\n");
            }
            //���ڸ�
            writer.write(actor.text()+"\n");
            
            writer.flush();
            writer.close();

	    	
	    	
		
	  } catch (IOException e) {
			e.printStackTrace();
			}

	
		
	
		
		
		
	}
}
