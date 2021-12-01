package project01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MkNews20Crawling {
	public static void main(String[] args) throws IOException{
		
		//1.크롤링 대상 URL 주소 가져오기.
		String MK = "https://find.mk.co.kr/new/search.php?pageNum=1&cat=&cat1=&media_eco=&pageSize=20&sub=news&dispFlag=OFF&page=news&s_kwd=%BF%E4%BC%D2%BC%F6&s_page=news&go_page=&ord=1&ord1=1&ord2=0&s_keyword=%BF%E4%BC%D2%BC%F6&s_i_keyword=%BF%E4%BC%D2%BC%F6&s_author=&y1=2018&m1=11&d1=18&y2=2021&m2=11&d2=18&ord=1&area=ttbd";
		
		//URL에서 전체 구조 받는다.
		Document doc = Jsoup.connect(MK).get();
		
		
		// MkNewsCrawling폴더에 Mk파일 저장
		Writer writer = new FileWriter("C:/javadata/MkNewsCrawling/Mk.txt");
		
		
		writer.write("[매일경제 요소수 검색 헤드라인]--------------------------------------"+"\n");
		
		
		final int	SIZE = 20;
		
    	String	yososu[] = new String[SIZE];
    	
    	for(int i=1; i<=yososu.length; i++) {
    		yososu[i-1] = doc.select("body td:nth-child(1) > div:nth-child("+(5+i)+") > span.art_tit > a"+"\n").text();
    		writer.write(yososu[i-1]+"\n");
    	}
    	
    	
    	writer.write("------------------------------------------------------------"+"\n");
    	writer.write("Maker: Choe Seung Hee");
    	
		
		
    	writer.flush();
    	
		Reader reader = new FileReader("C:/javadata/MkNewsCrawling/Mk.txt");
		while(true) {
			int data = reader.read();
			if(data == -1)
				break;
			System.out.print((char)data);
		}
		
		reader.close();
		writer.close();


		

	}

}
