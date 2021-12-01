package sec11.exam01.inout;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReaderWriterExam {
//	����.txt ���� ���� �о
//	���� ������ ���纻.txt ������ ����� ���� ����.
//	����.txt ���� ����� ������ ���纻.txt ���� �����ϴ� �ҽ� �ۼ�.
//	data���� �� ���ھ� ó�� / buffer �迭 ���� ó���� ���뼼���� ���� üũ �� �ð� ��.
	
	public static void main(String[] args) throws Exception {
		
		long startTime = System.nanoTime();//���� �ð�
		
//		FileReader, FileWriter�� �ü���� �⺻ �ѱ� ���ڵ��� �⺻���� �ν��Ͽ� �ѱ��� ������.
//		�׷��Ƿ� ���ڵ� ���� ������ FileInputStream, FileOutputStream�� ����Ѵ�.
		BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream("C:/javadata/����.txt"), "utf-8"));
		BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/javadata/���纻.txt"), "utf-8"));
//		Reader fr = new FileReader("C:/javadata/����.txt");
//		Writer fw = new FileWriter("C:/javadata/���纻.txt");
		
		while(true) {
			int data = fr.read();
			if(data == -1)
				break;
			System.out.print((char)data);
			fw.write((char)data);
		}
		System.out.println();
		System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
		 
		fr.close();
		fw.close();
		
		long endTime = System.nanoTime();//���� �ð�
		
		System.out.println();
		System.out.println("��꿡 " + (endTime-startTime)/1000000000.0 + " �ʰ� �ҿ�Ǿ����ϴ�.");
		
		
		
		
	}//main

	
}//class
