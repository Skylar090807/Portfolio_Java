package kr.gseo.craw;

import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.imageio.ImageIO;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Webtoon {

	public static void main(String[] args) throws IOException {
		String URL = "https://comic.naver.com/webtoon/detail?titleId=654774&no=292&weekday=mon";
		Document webtoon = Jsoup.connect(URL).get();
        System.out.println(webtoon.select(".wt_viewer > img"));//img 태그 전체 소스 불러오기

        Elements imgUrl = webtoon.select(".wt_viewer > img");//Arraylist<Elements>
        System.out.println(imgUrl);
//      String frontURL = "https://www.knps.or.kr"; //지리산 예제 시간복잡도 줄인 것.
        
        for (int i = 0; i < imgUrl.size(); i++) {
//            System.out.println(imgUrl.get(i).attr("src"));
            String src = imgUrl.get(i).attr("src");
//          지리산 예제  
//          String src ="https://www.knps.or.kr"+ imgUrl.get(i).attr("src");
//                                                  "/upload/ssphoto/2021/20211107070908374.jpg"                    
            
            URL wturl = new URL(src);
            HttpURLConnection conn = (HttpURLConnection)wturl.openConnection();

            conn.setRequestProperty("Referer", src);
            BufferedImage img = ImageIO.read(conn.getInputStream());

//          C드라이브 javadata 안에 webtoon1폴더 미리 만들어줘야 함.
            FileOutputStream out = new FileOutputStream("C:\\javadata\\webtoon1\\IMAG01_" + (i + 1) + ".jpg");
            ImageIO.write(img, "jpg", out);
        }   

		System.out.println(imgUrl.size()+"개 크롤링 완료했습니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
