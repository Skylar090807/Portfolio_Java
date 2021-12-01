package sec11.exam01.inout;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReaderWriterExam {
//	원본.txt 파일 내용 읽어서
//	동일 폴더에 복사본.txt 파일을 만들고 내용 저장.
//	원본.txt 파일 내용과 동일한 복사본.txt 파일 생성하는 소스 작성.
//	data변수 한 글자씩 처리 / buffer 배열 단위 처리의 나노세컨드 단위 체크 후 시간 비교.
	
	public static void main(String[] args) throws Exception {
		
		long startTime = System.nanoTime();//시작 시간
		
//		FileReader, FileWriter는 운영체제의 기본 한글 인코딩을 기본으로 인식하여 한글이 깨진다.
//		그러므로 인코딩 설정 가능한 FileInputStream, FileOutputStream을 사용한다.
		BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream("C:/javadata/원본.txt"), "utf-8"));
		BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/javadata/복사본.txt"), "utf-8"));
//		Reader fr = new FileReader("C:/javadata/원본.txt");
//		Writer fw = new FileWriter("C:/javadata/복사본.txt");
		
		while(true) {
			int data = fr.read();
			if(data == -1)
				break;
			System.out.print((char)data);
			fw.write((char)data);
		}
		System.out.println();
		System.out.println("복사가 완료되었습니다.");
		 
		fr.close();
		fw.close();
		
		long endTime = System.nanoTime();//종료 시간
		
		System.out.println();
		System.out.println("계산에 " + (endTime-startTime)/1000000000.0 + " 초가 소요되었습니다.");
		
		
		
		
	}//main

	
}//class
