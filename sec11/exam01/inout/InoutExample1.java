package sec11.exam01.inout;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class InoutExample1 {

	public static void main(String[] args) throws Exception {//파일 입출력 예외 처리
		//파일 출력 스트림을 이용해 javadata폴더 안에 test1.txt파일 생성 후 byte데이터를 넣음.
		OutputStream os = new FileOutputStream("C:/javadata/test1.txt");
				
				byte a = 10;
				byte b = 20;
				byte c = 30;
				byte[] array = {10, 20, 30, 40, 50 };
				
				os.write(a);
				os.write(b);
				os.write(c);
				os.write(array);
				os.write(array, 2, 3);//배열 인덱스 2번부터 3개 읽어라
				System.out.println("파일 출력 완료");
//				os.flush();
				
				

		//파일 입력 스트림을 이용해 javadata폴더 안에 test1.txt 파일 내용 읽고 출력.		
		InputStream is = new FileInputStream("C:/javadata/test1.txt");
				
				while(true) {
					int data= is.read();
					if(data == -1)
						break;
					System.out.println(data);
				}
				
				
		
		//파일 입력 스트림을 이용해 javadata 폴더 안에 있는 test1.txt 파일의 내용르 읽어 와		
		//buffer 배열 변수에 저장 한 후 버퍼의 내용을 화면에 출력		
		InputStream is2 = new FileInputStream("C:/javadata/test1.txt");
		byte[] buffer = new byte[100];
		
		while(true) {
			int readByteNum = is2.read(buffer);
			System.out.println(readByteNum);
			if(readByteNum == -1)
				break;
			for(int i=0; i<readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		
		
		OutputStream os2 = new FileOutputStream("C:/javadata/test2.txt");
		//buffer[]에 있는 내용을 test2.txt 파일에 출력.
		os2.write(buffer);
		
		System.out.println("-------------------------------");
		
		//test2.txt 파일에 들어있는 내용을 읽어 화면에 출력 
		InputStream is3 = new FileInputStream("C:/javadata/test2.txt");
		while(true) {
			int data= is3.read();
			if(data == -1)
				break;
			System.out.println(data);
		}
		
		
				
		
		//입력 스트림과 출력 스트림을 닫음(열어 놓은 파일 닫음)		
		is.close();
		os.close();
		is2.close();
		os2.close();
		is3.close();

		

	}

}
