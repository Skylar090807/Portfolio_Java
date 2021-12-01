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
		// 1. ���ϴ� url �ּ� ����
		String URL = "https://news.naver.com/main/read.naver?mode=LSD&mid=shm&sid1=105&oid=005&aid=0001483924";

	   // 2. url���� ��ü ������ �޾ƿ´�
	    	Document  doc = Jsoup.connect(URL).get(); 
	   
	   // 3. ���ϴ� ��Ҹ� �����Ѵ�.
	    	Elements Title = doc.select("#articleTitle");//���� ����
	    	Elements BodyContents = doc.select("#articleBodyContents");//���� ����
	    	Elements actor = doc.select("#articleBody  div.journalistcard_summary_name");//���� ����
            Elements imgUrl = doc.select("#articleBodyContents img");//�̹��� ����
            
	  //  4. ����� ���� ������ ���� �� ȭ�� ����ϱ� 
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
            
            //javadata���� ���� nnews���� Disneyarticle.txt���Ͽ� ���� ���� ���
            Writer writer = new FileWriter("C:/javadata/nnews/Disneyarticle.txt");
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
            
            
            
            
            //javadata���� ���� nnews���� DisneyImg �̹��� ���� ����.
            
            System.out.println(imgUrl);
            
            for (int i = 0; i < imgUrl.size(); i++) {
            
              String tagsrc = imgUrl.get(i).attr("src");
              
              URL wturl = new URL(tagsrc);
              HttpURLConnection conn = (HttpURLConnection)wturl.openConnection();

              conn.setRequestProperty("Referer", tagsrc);
              BufferedImage img = ImageIO.read(conn.getInputStream());

              FileOutputStream out = new FileOutputStream("C:\\javadata\\nnews\\DisneyImg" + (i + 1) +".jpg");
              ImageIO.write(img, "jpg", out);
              
              System.out.println("C:\\javadata\\nnews\\DisneyImg" + (i + 1) +".jpg"+"ũ�Ѹ� �Ϸ�");
              
              out.close();
          }  


	    	
	    	
		
	 

	}

}
