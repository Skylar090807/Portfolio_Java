package sec11.exam01.inout;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;


public class ReaderWriter_buffer {

	public static void main(String[] args) throws Exception {
		
		long startTime = System.nanoTime();//���� �ð�
		
		
//		FileReader, FileWriter�� �ü���� �⺻ �ѱ� ���ڵ��� �⺻���� �ν��Ͽ� �ѱ��� ������.
//		�׷��Ƿ� ���ڵ� ���� ������ FileInputStream, FileOutputStream�� ����Ѵ�.
		BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream("C:/javadata/����.txt"), "utf-8"));
		BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/javadata/���纻2.txt"), "utf-8"));
//		Reader fr = new FileReader("C:/javadata/����.txt");
//		Writer fw = new FileWriter("C:/javadata/���纻2.txt");
		
		char[] buffer = new char [200];
	
		while(true) {
			int data = fr.read(buffer);
			if(data == -1)
				break;
			for(int i=0; i<data; i++) {
				System.out.print(buffer[i]);
			}
			fw.write(buffer);
		}
		System.out.println();
		System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
	
		fr.close();
		fw.close();
		
		long endTime = System.nanoTime();//���� �ð�
		
		System.out.println();
		System.out.println("��꿡 " + (endTime-startTime)/1000000000.0 + " �ʰ� �ҿ�Ǿ����ϴ�.");

	}
}
