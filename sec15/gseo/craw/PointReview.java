package kr.gseo.craw;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class PointReview {

	public static void main(String[] args) throws IOException {
		
		//1.크롤링 대상 URL 주소 가져오기.
		String URL = "https://movie.naver.com/movie/bi/mi/point.naver?code=184311";
		
		//2. url에서 전체 구조를 받아온다
		Document  doc = Jsoup.connect(URL).get();
//		System.out.println(doc);//불러 온 HTML 출력
		
        
		FileWriter writer = new FileWriter("C:/javadata/review.txt");
		
        //영화 댓글 iframe 태그의 src 속성의 값을 추출한다.
        String reviewPageUrl = doc.select("#pointAfterListIframe").attr("src"); 
        
        //movie.naver.com 도메인을 연결하여 완전한 URL 을 생성하여 jsoup과 연결한다.
        Document reviewPage = Jsoup.connect("http://movie.naver.com" + reviewPageUrl).get(); 

        //총 페이지수 추출
        int totalPage = Integer.parseInt(reviewPage.select(".total em").text().replace(",", "")) / 10;
        if(Integer.parseInt(reviewPage.select(".total em").text().replace(",", "")) % 10 != 0) {
            totalPage++;
        }
  
        
        //리뷰 페이지 페이지 순서대로(1페이지 ~ 총 페이지 수)접근 (중첩 for문)
        for (int j = 1; j <= totalPage; j++) {
            reviewPage = Jsoup.connect("http://movie.naver.com" + reviewPageUrl + "&page="+j).get();
        //영화 리뷰 수집
        Elements reple = reviewPage.select(".score_reple > p");
        for (int i = 0; i < reple.size(); i++) {
            System.out.println(i+j);
            writer.write(reple.get(i).text().replace("BEST", "").replace("관람객", "") + "\r\n");
            }
        }
        
        writer.flush();
        writer.close();



		
		
		
		
		
		
		
		
		
		
	}

}
