package kr.gseo.craw;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class stockData {

	public static void main(String[] args) {
		
		// 1. 원하는 url 주소 지정
		String URL = "https://finance.naver.com/ "; 


	    try {
	   // 2. url에서 전체 구조를 받아온다
	    	Document  doc = Jsoup.connect(URL).get(); 
	    	
//	    3,4,5번을 for문 이용하여 처리.
//	    	element 추출 -> 저장 -> 출력
	    	String	str[] = new String[6];
	    	Elements elem;
	    	for(int i=1; i<=str.length; i++) {
	    		elem = doc.select("#content ul > li:nth-child("+i+") > span > a");
	    		str[i-1] = elem.text();
	    	}
//          출력
	    	for(int i=0; i<str.length; i++)
	    		System.out.println(str[i]);
	    	
	    	System.out.println("--------------------------------------------------");



	    	
	    	
	    	
	    	
	    	
	   // 3. 원하는 요소만 추출한다.
	    	Elements elem1 = doc.select("#content ul > li:nth-child(1) > span > a");
	    	Elements elem2 = doc.select("#content ul > li:nth-child(2) > span > a");
	    	Elements elem3 = doc.select("#content ul > li:nth-child(3) > span > a");
	    	Elements elem4 = doc.select("#content ul > li:nth-child(4) > span > a");
	    	Elements elem5 = doc.select("#content ul > li:nth-child(5) > span > a");
	    	Elements elem6 = doc.select("#content ul > li:nth-child(6) > span > a");

	   // 4. 추출한 요소를 변수에 저장하거나 출력한다.  
	    	System.out.println(elem1.text());   
	    	System.out.println(elem2.text());   
	    	System.out.println(elem3.text());   
	    	System.out.println(elem4.text());   
	    	System.out.println(elem5.text());   
	    	System.out.println(elem6.text());
	    	
	  	  //  5. 요소의 값을 변수에 저장 //후 화면 출력하기 
	    	String elem1_str = elem1.text();
	    	String elem2_str = elem2.text();
	    	String elem3_str = elem3.text();
	    	String elem4_str = elem4.text();
	    	String elem5_str = elem5.text();
	    	String elem6_str = elem6.text();
		
//	    	거래상위 종목 - 회사, 주가, 변동률

	    	
	  } catch (IOException e) {
			e.printStackTrace();
			}


	}

}
