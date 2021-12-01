package kr.gseo.craw;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class stockData {

	public static void main(String[] args) {
		
		// 1. ���ϴ� url �ּ� ����
		String URL = "https://finance.naver.com/ "; 


	    try {
	   // 2. url���� ��ü ������ �޾ƿ´�
	    	Document  doc = Jsoup.connect(URL).get(); 
	    	
//	    3,4,5���� for�� �̿��Ͽ� ó��.
//	    	element ���� -> ���� -> ���
	    	String	str[] = new String[6];
	    	Elements elem;
	    	for(int i=1; i<=str.length; i++) {
	    		elem = doc.select("#content ul > li:nth-child("+i+") > span > a");
	    		str[i-1] = elem.text();
	    	}
//          ���
	    	for(int i=0; i<str.length; i++)
	    		System.out.println(str[i]);
	    	
	    	System.out.println("--------------------------------------------------");



	    	
	    	
	    	
	    	
	    	
	   // 3. ���ϴ� ��Ҹ� �����Ѵ�.
	    	Elements elem1 = doc.select("#content ul > li:nth-child(1) > span > a");
	    	Elements elem2 = doc.select("#content ul > li:nth-child(2) > span > a");
	    	Elements elem3 = doc.select("#content ul > li:nth-child(3) > span > a");
	    	Elements elem4 = doc.select("#content ul > li:nth-child(4) > span > a");
	    	Elements elem5 = doc.select("#content ul > li:nth-child(5) > span > a");
	    	Elements elem6 = doc.select("#content ul > li:nth-child(6) > span > a");

	   // 4. ������ ��Ҹ� ������ �����ϰų� ����Ѵ�.  
	    	System.out.println(elem1.text());   
	    	System.out.println(elem2.text());   
	    	System.out.println(elem3.text());   
	    	System.out.println(elem4.text());   
	    	System.out.println(elem5.text());   
	    	System.out.println(elem6.text());
	    	
	  	  //  5. ����� ���� ������ ���� //�� ȭ�� ����ϱ� 
	    	String elem1_str = elem1.text();
	    	String elem2_str = elem2.text();
	    	String elem3_str = elem3.text();
	    	String elem4_str = elem4.text();
	    	String elem5_str = elem5.text();
	    	String elem6_str = elem6.text();
		
//	    	�ŷ����� ���� - ȸ��, �ְ�, ������

	    	
	  } catch (IOException e) {
			e.printStackTrace();
			}


	}

}
