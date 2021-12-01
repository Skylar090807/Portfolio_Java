package kr.gseo.craw;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Finance {

	public static void main(String[] args) throws IOException {
		
//		<JSoup Ȱ�� �� ũ�Ѹ� ���� > 
		/* Naver ���� �������� TOP���� �� ������ copy selector�� ������ for loop�� ó��.
		 * 	ù��°	2,325	+2.20%
			�ι�°	3,160	-2.47%
			����°	6,670	+20.18%
		 */
		
		
		String URL = "https://finance.naver.com/ ";// 1. ���ϴ� url �ּ� ����
    	Document  doc = Jsoup.connect(URL).get();// 2. url���� ��ü ������ �޾ƿ´�
		
//    	3. ���ϴ� ������ copy selector�� ������ �� for loop ó��.
    	
//		3-0.���ϴ� ������ copy selector�� ��������.
//	    #_topItems1 > tr:nth-child(1) > th > a //ù��° �ֽ� �̸�
//	    #_topItems1 > tr:nth-child(1) > td:nth-child(2) //ù��° ���簡
//	    #_topItems1 > tr:nth-child(1) > td:nth-child(4) //ù��° �����
	    	
//	    #_topItems1 > tr:nth-child(2) > th > a //�ι�° �ֽ� �̸�
//	    #_topItems1 > tr:nth-child(2) > td:nth-child(2)//�ι�° ���簡
//	    #_topItems1 > tr:nth-child(2) > td:nth-child(4)//����° �����
	    	
//	    #_topItems1 > tr:nth-child(3) > th > a //����° �ֽ��̸�
//	    #_topItems1 > tr:nth-child(3) > td:nth-child(2) //����° ���簡
//	    #_topItems1 > tr:nth-child(3) > td:nth-child(4) //����° �����
    	
//      3-1.�迭 ���� �� for loop ó��.
    	
    	String	str[] = new String[3];
    	String  str2[] = new String[3];
    	String  str3[] = new String[3];
    	Elements stockName1; //�ֽ��̸�
    	Elements stockV1; //���簡
    	Elements stockV2; //�����
    	
    	for(int i=1; i<=str.length; i++) {
    		stockName1 = doc.select("#_topItems1 > tr:nth-child("+i+") > th > a ");//�ֽ��̸�
    		str[i-1] = stockName1.text();
    	}
    	for(int i=1; i<=str2.length; i++) {
    		stockV1 = doc.select("#_topItems1 > tr:nth-child("+i+") > td:nth-child(2)");//���簡
    		str2[i-1] = stockV1.text();
    	}
    	for(int i=1; i<=str3.length; i++) {
    		stockV2 = doc.select("#_topItems1 > tr:nth-child("+i+") > td:nth-child(4)");//�����
    		str3[i-1] = stockV2.text();
    	}
    	
//      ���
    	System.out.println("[1. �迭 ���� �� for loop�� ���]");
    	for(int i=0; i<str.length; i++) {
    		System.out.print(str[i]+"\t"+str2[i]+"\t"+str3[i]+"\n");
    	}
    	
    	System.out.println("------------------------------------------------------------------");
    	
//    	3-2. ���� for loop�� TOP���� ��� ������ ���. - ���� ->���� ���� ���� selector �� ���� ���� ����? ���� �ľ� �Һи�...
    	
		Elements stocklist = doc.select("#_topItems1");
		
		Elements stockName = stocklist.select("th"); //�ֽ� �̸�
		Elements stockValue1= stocklist.select("td:nth-child(2)"); //���簡
		Elements stockValue2= stocklist.select("td:nth-child(4)"); //�����

		System.out.println("[2. selector���� ���� �� ���� for loop�� ���� �� �׸� ��� ���-����]");
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
		
		 
		//��ǥ ���� ������ ���� �Է��ϰ� ���.
		System.out.println("[3. ��ǥ ���� ������ ���� �Է��ϰ� ���]");
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
//		final���� �� for loop ó��
		
		final int	SIZE = 6; //
		
    	String	item[] = new String[SIZE];
    	String	price[] = new String[SIZE];
    	String	rate[] = new String[SIZE];
    	
    	for(int i=1; i<=item.length; i++) {
    		item[i-1] = doc.select("#_topItems1 > tr:nth-child("+i+") > th > a").text();
    		price[i-1] = doc.select("#_topItems1 > tr:nth-child("+i+") > td:nth-child(2)").text();
    		rate[i-1] = doc.select("#_topItems1 > tr:nth-child("+i+") > td:nth-child(4)").text();
    	}
    	
    	System.out.println("[�ŷ���������]");
    	System.out.printf("%-40s\t%s\t%s\n", "<ȸ��>", "<�ְ�>", "<������>");
    	for(int i=0; i<item.length; i++) {
    		System.out.printf("%-40s\t%s\t%s\n", item[i], price[i], rate[i]);
    	}
 

	}

}
