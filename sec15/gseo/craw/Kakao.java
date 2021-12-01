package kr.gseo.craw;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

//import java.io.IOException;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;


public class Kakao {

	public static void main(String[] args) {
		// 1. ���ϴ� url �ּ� ����
		String URL = "https://finance.naver.com/search/searchList.naver?query=%C4%AB%C4%AB%BF%C0"; //���̹� �������� īī�� �˻� ��
		
	    try {
	   // 2. url���� ��ü ������ �޾ƿ´�
	    	Document  doc = Jsoup.connect(URL).get(); 
//	    	System.out.println(doc);
	    	
	   // 3. ���ϴ� ��� �����Ѵ�.
//	    	name, current, pre, pm, sale, buy, capacity, pay
	    	Elements name1 = doc.select("#content tr:nth-child(1)  a");
	    	Elements name2 = doc.select("#content tr:nth-child(2)  a");
	    	Elements name3 = doc.select("#content tr:nth-child(3)  a");
	    	Elements name4 = doc.select("#content tr:nth-child(4)  a");
	    	
	    	Elements current1 = doc.select("#content tr:nth-child(1)  td:nth-child(2)");
	    	Elements current2 = doc.select("#content tr:nth-child(2)  td:nth-child(2)");
	    	Elements current3 = doc.select("#content tr:nth-child(3)  td:nth-child(2)");
	    	Elements current4 = doc.select("#content tr:nth-child(4)  td:nth-child(2)");
	    	
	    	Elements pre1 = doc.select("#content tr:nth-child(1)  td.num2.down");
	    	Elements pre2 = doc.select("#content tr:nth-child(2)  td.num2.down");
	    	Elements pre3 = doc.select("#content tr:nth-child(3)  td.num2.down");
	    	Elements pre4 = doc.select("#content tr:nth-child(4)  td.num2.down");
	    	
	    	Elements pm1 = doc.select("#content tr:nth-child(1)  td.num3.down");
	    	Elements pm2 = doc.select("#content tr:nth-child(2)  td.num3.down");
	    	Elements pm3 = doc.select("#content tr:nth-child(3)  td.num3.down");
	    	Elements pm4 = doc.select("#content tr:nth-child(4)  td.num3.down");
	    	
	    	Elements sale1 = doc.select("#content tr:nth-child(1)  td:nth-child(5)");
	    	Elements sale2 = doc.select("#content tr:nth-child(2)  td:nth-child(5)");
	    	Elements sale3 = doc.select("#content tr:nth-child(3)  td:nth-child(5)");
	    	Elements sale4 = doc.select("#content tr:nth-child(4)  td:nth-child(5)");
	    	
	    	Elements buy1 = doc.select("#content tr:nth-child(1)  td:nth-child(6)");
	    	Elements buy2 = doc.select("#content tr:nth-child(2)  td:nth-child(6)");
	    	Elements buy3 = doc.select("#content tr:nth-child(3)  td:nth-child(6)");
	    	Elements buy4 = doc.select("#content tr:nth-child(4)  td:nth-child(6)");
	    	
	    	Elements capacity1 = doc.select("#content tr:nth-child(1) > td:nth-child(7)");
	    	Elements capacity2 = doc.select("#content tr:nth-child(2) > td:nth-child(7)");
	    	Elements capacity3 = doc.select("#content tr:nth-child(3) > td:nth-child(7)");
	    	Elements capacity4 = doc.select("#content tr:nth-child(4) > td:nth-child(7)");
	    	
	    	Elements pay1= doc.select("#content tr:nth-child(1) > td:nth-child(8)");
	    	Elements pay2= doc.select("#content tr:nth-child(2) > td:nth-child(8)");
	    	Elements pay3= doc.select("#content tr:nth-child(3) > td:nth-child(8)");
	    	Elements pay4= doc.select("#content tr:nth-child(4) > td:nth-child(8)");
	    	
//	    	System.out.println(name1.text());
//	    	System.out.println(current1.text());
//	    	System.out.println(pre1.text());
//	    	System.out.println(pm1.text());
//	    	System.out.println(sale1.text());
//	    	System.out.println(buy1.text());
//	    	System.out.println(capacity1.text());
//	    	System.out.println(pay1.text());
	   // 4. ������ ��Ҹ� ������ �����ϰų� ����Ѵ�.  
	    	
	    	String name[] = new String[4];
	    	String current[] = new String[4];
	    	String pre[] = new String[4];
	    	String pm[] = new String[4];
	    	String sale[] = new String[4];
	    	String buy[] = new String[4];
	    	String capacity[] = new String[4];
	    	String pay[] = new String[4];
	    	
	    	for(int i=1; i<=name.length; i++) {
	    		int j = i-1;
	    		name[j] = doc.select("#content tr:nth-child("+i+") a").text();
	    		current[j] = doc.select("#content tr:nth-child("+i+") td:nth-child(2)").text();
	    		pre[j] = doc.select("#content tr:nth-child("+i+") td.num2").text();
	    		pm[j] = doc.select("#content tr:nth-child("+i+") td.num3").text();
	    		sale[j] = doc.select("#content tr:nth-child("+i+") td:nth-child(5)").text();
	    		buy[j] = doc.select("#content tr:nth-child("+i+") td:nth-child(6)").text();
	    		capacity[j] = doc.select("#content tr:nth-child("+i+") td:nth-child(7)").text();
	    		pay[j] = doc.select("#content tr:nth-child("+i+") td:nth-child(8)").text();
	    	}
	    	
	    	System.out.println("[īī�� �˻� ���]");
	    	System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
	    	System.out.printf("%-10s\t%10s\t%10s\t%10s\t%10s\t%10s\t%10s\t%10s\n", "<�����>","<���簡>","<���ϴ��>","<�����>","<�ŵ�ȣ��>","<�ż�ȣ��>","<�ŷ���>","<�ŷ����(�鸸)>");
	    	for(int i=0; i<name.length; i++) {
	    		System.out.printf("%-10s\t%10s\t%10s\t%10s\t%10s\t%10s\t%10s\t%10s\n", name[i], current[i], pre[i], pm[i], sale[i], buy[i], capacity[i], pay[i]);
	    	}
	    	System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");

	    	System.out.println("[�ǽ�����]");
//	    	result.txt ���Ͽ� ȭ�鿡 ��µǴ� ������ �����Ͻÿ�. �� ������ (,), (\t) ����ϱ�.
	    	
			Writer writer = new FileWriter("C:/javadata/result.txt");
			
//			String title ="%-10s"+"<�����>"+"\t%10s"+"<���簡>"+"\t%10s"+"<���ϴ��>"+"\t%10s"+"<�����>"+"\t%10s"+"<�ŵ�ȣ��>"+"\t%10s"+"<�ż�ȣ��>"+"\t%10s"+"<�ŷ���>"+"\t%10s"+"<�ŷ����(�鸸)>"+"\n";
//			writer.write(title);
			
	    	writer.write("<�����>\t\t<���簡>\t\t<���ϴ��>\t\t<�����>\t\t<�ŵ�ȣ��>\t\t<�ż�ȣ��>\t\t<�ŷ���>\t\t<�ŷ����(�鸸)>"+"\n");
			
			
	    	for(int i=0; i<name.length; i++) {
	    		String str = String.format("%-10s\t%10s\t%10s\t%10s\t%10s\t%10s\t%10s\t%10s\n",name[i], current[i], pre[i], pm[i], sale[i], buy[i], capacity[i], pay[i]);
	    		writer.write(str);
	    	}

	    	writer.flush();
	    	
			Reader reader = new FileReader("C:/javadata/result.txt");
			while(true) {
				int data = reader.read();
				if(data == -1)
					break;
				System.out.print((char)data);
			}
			
			reader.close();
			writer.close();


			
			
	    	
	   //5. ����� ���� ������ ���� �� ȭ�� ����ϱ�
//	    	String title_str = Title.text();
	    	
//	    	System.out.println("-------------------------------------");
//	    	System.out.println(title_str);
	    	
	  } catch (IOException e) {
			e.printStackTrace();
		}

		
		

	}

}
