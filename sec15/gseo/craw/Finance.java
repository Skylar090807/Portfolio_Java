package kr.gseo.craw;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Finance {

	public static void main(String[] args) throws IOException {
		
//		<JSoup 활용 웹 크롤링 과제 > 
		/* Naver 금융 페이지의 TOP종목 세 가지를 copy selector로 가져와 for loop로 처리.
		 * 	첫번째	2,325	+2.20%
			두번째	3,160	-2.47%
			세번째	6,670	+20.18%
		 */
		
		
		String URL = "https://finance.naver.com/ ";// 1. 원하는 url 주소 지정
    	Document  doc = Jsoup.connect(URL).get();// 2. url에서 전체 구조를 받아온다
		
//    	3. 원하는 데이터 copy selector로 가져온 후 for loop 처리.
    	
//		3-0.원하는 데이터 copy selector로 가져오기.
//	    #_topItems1 > tr:nth-child(1) > th > a //첫번째 주식 이름
//	    #_topItems1 > tr:nth-child(1) > td:nth-child(2) //첫번째 현재가
//	    #_topItems1 > tr:nth-child(1) > td:nth-child(4) //첫번째 등락률
	    	
//	    #_topItems1 > tr:nth-child(2) > th > a //두번째 주식 이름
//	    #_topItems1 > tr:nth-child(2) > td:nth-child(2)//두번째 현재가
//	    #_topItems1 > tr:nth-child(2) > td:nth-child(4)//세번째 등락률
	    	
//	    #_topItems1 > tr:nth-child(3) > th > a //세번째 주식이름
//	    #_topItems1 > tr:nth-child(3) > td:nth-child(2) //세번째 현재가
//	    #_topItems1 > tr:nth-child(3) > td:nth-child(4) //세번째 등락률
    	
//      3-1.배열 선언 후 for loop 처리.
    	
    	String	str[] = new String[3];
    	String  str2[] = new String[3];
    	String  str3[] = new String[3];
    	Elements stockName1; //주식이름
    	Elements stockV1; //현재가
    	Elements stockV2; //등락률
    	
    	for(int i=1; i<=str.length; i++) {
    		stockName1 = doc.select("#_topItems1 > tr:nth-child("+i+") > th > a ");//주식이름
    		str[i-1] = stockName1.text();
    	}
    	for(int i=1; i<=str2.length; i++) {
    		stockV1 = doc.select("#_topItems1 > tr:nth-child("+i+") > td:nth-child(2)");//현재가
    		str2[i-1] = stockV1.text();
    	}
    	for(int i=1; i<=str3.length; i++) {
    		stockV2 = doc.select("#_topItems1 > tr:nth-child("+i+") > td:nth-child(4)");//등락률
    		str3[i-1] = stockV2.text();
    	}
    	
//      출력
    	System.out.println("[1. 배열 선언 후 for loop로 출력]");
    	for(int i=0; i<str.length; i++) {
    		System.out.print(str[i]+"\t"+str2[i]+"\t"+str3[i]+"\n");
    	}
    	
    	System.out.println("------------------------------------------------------------------");
    	
//    	3-2. 향상된 for loop로 TOP종목 모두 가져와 출력. - 실패 ->실패 요인 추측 selector 값 범위 설정 오류? 원인 파악 불분명...
    	
		Elements stocklist = doc.select("#_topItems1");
		
		Elements stockName = stocklist.select("th"); //주식 이름
		Elements stockValue1= stocklist.select("td:nth-child(2)"); //현재가
		Elements stockValue2= stocklist.select("td:nth-child(4)"); //등락률

		System.out.println("[2. selector범위 지정 후 향상된 for loop로 여섯 개 항목 모두 출력-실패]");
		for(Element a : stockName) {
			System.out.println(a.text());
		}
		for(Element b : stockValue1 ) {
			System.out.println(b.text());
		}
		for(Element c : stockValue2 ) {
			System.out.println(c.text());
		}
		
    	
		System.out.println("---------------------------------------------------------------");
		
		 
		//목표 값과 비교위해 직접 입력하고 출력.
		System.out.println("[3. 목표 값과 비교위해 직접 입력하고 출력]");
	    Elements elem1 = doc.select("#_topItems1 > tr:nth-child(1) > th > a");
	    Elements elem2 = doc.select("#_topItems1 > tr:nth-child(1) > td:nth-child(2)");
	    Elements elem3 = doc.select("#_topItems1 > tr:nth-child(1) > td:nth-child(4)");
	    System.out.print(elem1.text()+"\t"+elem2.text()+"\t"+elem3.text()+"\n");
	    	
	    Elements elem4 = doc.select("#_topItems1 > tr:nth-child(2) > th > a");
	    Elements elem5 = doc.select("#_topItems1 > tr:nth-child(2) > td:nth-child(2)");
	    Elements elem6 = doc.select("#_topItems1 > tr:nth-child(2) > td:nth-child(4)");
	    System.out.print(elem4.text()+"\t"+elem5.text()+"\t"+elem6.text()+"\n");
	    	
	    Elements elem7 = doc.select("#_topItems1 > tr:nth-child(3) > th > a");
	    Elements elem8 = doc.select("#_topItems1 > tr:nth-child(3) > td:nth-child(2)");
	    Elements elem9 = doc.select("#_topItems1 > tr:nth-child(3) > td:nth-child(4)");
	    System.out.print(elem7.text()+"\t"+elem8.text()+"\t"+elem9.text()+"\n");
		 
		System.out.println("----------------------------------------------------------------");
//		final선언 후 for loop 처리
		
		final int	SIZE = 6; //
		
    	String	item[] = new String[SIZE];
    	String	price[] = new String[SIZE];
    	String	rate[] = new String[SIZE];
    	
    	for(int i=1; i<=item.length; i++) {
    		item[i-1] = doc.select("#_topItems1 > tr:nth-child("+i+") > th > a").text();
    		price[i-1] = doc.select("#_topItems1 > tr:nth-child("+i+") > td:nth-child(2)").text();
    		rate[i-1] = doc.select("#_topItems1 > tr:nth-child("+i+") > td:nth-child(4)").text();
    	}
    	
    	System.out.println("[거래상위종목]");
    	System.out.printf("%-40s\t%s\t%s\n", "<회사>", "<주가>", "<변동률>");
    	for(int i=0; i<item.length; i++) {
    		System.out.printf("%-40s\t%s\t%s\n", item[i], price[i], rate[i]);
    	}
 

	}

}
