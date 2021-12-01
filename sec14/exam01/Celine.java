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
		
		//Google���� CELIENE �˻� ��� Web Crawling
		String URL = "https://www.google.com/search?q=celine&rlz=1C1CHZL_koKR730KR730&source=lnms&tbm=isch&sa=X&ved=2ahUKEwia_7i45J_0AhV0sVYBHRwpAkUQ_AUoAXoECAIQAw&biw=1536&bih=750&dpr=1.25";
		
//		Jsoup Parser �̿��Ͽ� Celine ������ URL �� ����.
		Document Celine = Jsoup.connect(URL).get();
		
		//google���� CELINE �˻� ��� URL ���.
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

            // �˻� ��� ���� ����.           
//          C����̺� javadata �ȿ� CELINE���� �̸� �������� �Ѵ�.
            FileOutputStream out = new FileOutputStream("file:\\C:\\javadata\\CELINE\\IMAG01_" + (i + 1) + ".jpg");
            ImageIO.write(img, "jpg", out);
      
            out.flush();
            out.close();
        }   

		System.out.println(imgUrl.size()+"�� ũ�Ѹ� �Ϸ��߽��ϴ�.");
		
		}
		catch(Exception e) {
			
			System.out.println("�����Ǵ� ���� ũ�Ѹ� �Ϸ�~!!!");
		}
		
	
	}

}
