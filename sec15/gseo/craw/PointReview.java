package kr.gseo.craw;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class PointReview {

	public static void main(String[] args) throws IOException {
		
		//1.ũ�Ѹ� ��� URL �ּ� ��������.
		String URL = "https://movie.naver.com/movie/bi/mi/point.naver?code=184311";
		
		//2. url���� ��ü ������ �޾ƿ´�
		Document  doc = Jsoup.connect(URL).get();
//		System.out.println(doc);//�ҷ� �� HTML ���
		
        
		FileWriter writer = new FileWriter("C:/javadata/review.txt");
		
        //��ȭ ��� iframe �±��� src �Ӽ��� ���� �����Ѵ�.
        String reviewPageUrl = doc.select("#pointAfterListIframe").attr("src"); 
        
        //movie.naver.com �������� �����Ͽ� ������ URL �� �����Ͽ� jsoup�� �����Ѵ�.
        Document reviewPage = Jsoup.connect("http://movie.naver.com" + reviewPageUrl).get(); 

        //�� �������� ����
        int totalPage = Integer.parseInt(reviewPage.select(".total em").text().replace(",", "")) / 10;
        if(Integer.parseInt(reviewPage.select(".total em").text().replace(",", "")) % 10 != 0) {
            totalPage++;
        }
  
        
        //���� ������ ������ �������(1������ ~ �� ������ ��)���� (��ø for��)
        for (int j = 1; j <= totalPage; j++) {
            reviewPage = Jsoup.connect("http://movie.naver.com" + reviewPageUrl + "&page="+j).get();
        //��ȭ ���� ����
        Elements reple = reviewPage.select(".score_reple > p");
        for (int i = 0; i < reple.size(); i++) {
            System.out.println(i+j);
            writer.write(reple.get(i).text().replace("BEST", "").replace("������", "") + "\r\n");
            }
        }
        
        writer.flush();
        writer.close();



		
		
		
		
		
		
		
		
		
		
	}

}
