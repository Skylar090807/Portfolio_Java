package csh01.exam01;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

import javax.imageio.ImageIO;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Celine {
	public static void main(String[] args) throws IOException {
		
		try {
		
		//Google에서 CELIENE 검색 결과 Web Crawling
		String URL = "https://www.google.com/search?q=celine&rlz=1C1CHZL_koKR730KR730&source=lnms&tbm=isch&sa=X&ved=2ahUKEwia_7i45J_0AhV0sVYBHRwpAkUQ_AUoAXoECAIQAw&biw=1536&bih=750&dpr=1.25";
		
//		Jsoup Parser 이용하여 Celine 변수에 URL 값 연결.
		Document Celine = Jsoup.connect(URL).get();
		
		//google에서 CELINE 검색 결과 URL 출력.
        System.out.println(Celine.select(".bRMDJf.islir > img"));
        
        Elements imgUrl = Celine.select(".bRMDJf.islir > img");
        System.out.println(imgUrl);
        
        
        for (int i = 0; i < imgUrl.size(); i++) {
            System.out.println(imgUrl.get(i).attr("src"));
            String src = imgUrl.get(i).attr("src");
//            String src2 = imgUrl.get(i).attr("gif");
//            String src3 = imgUrl.get(i).attr("png");
//            String src4 = imgUrl.get(i).attr("JPEG");
            
            URL wturl = new URL(src);
            HttpURLConnection conn = (HttpURLConnection)wturl.openConnection();

            conn.setRequestProperty("Referer", src);
            BufferedImage img = ImageIO.read(conn.getInputStream());

            // 검색 결과 파일 저장.           
//          C드라이브 javadata 안에 CELINE폴더 미리 만들어줘야 한다.
            FileOutputStream out = new FileOutputStream("file:\\C:\\javadata\\CELINE\\IMAG01_" + (i + 1) + ".jpg");
            ImageIO.write(img, "jpg", out);
      
            out.flush();
            out.close();
        }   

		System.out.println(imgUrl.size()+"개 크롤링 완료했습니다.");
		
		}
		catch(Exception e) {
			
			System.out.println("지원되는 형식 크롤링 완료~!!!");
		}
		
	
	}

}
