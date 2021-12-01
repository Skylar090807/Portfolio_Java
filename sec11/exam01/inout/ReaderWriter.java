package sec11.exam01.inout;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderWriter {

	public static void main(String[] args) throws Exception {
		
		//문자 출력 스트림(파일 생성 후 대입)
		Writer writer = new FileWriter("C:/javadata/test3.txt");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		char[] array = {'D', 'E', 'F'};
		char i = '\n';
		
		String title = "애국가";
		String national = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리 나라 만세";
		
		
		writer.write(a);//파일에 A입력
		writer.write(b);//B
		writer.write(c);//C
		writer.write(array);//DEF
		writer.write(array, 1, 2);//EF
		writer.write(i);
		writer.write(title);
//		writer.write("\n"+title+"\n"); //시간 복잡도 우수
		writer.write(i);
		writer.write(national);//동해물과~...
		
		System.out.println("test3.txt 파일에 변수 값, 배열 값 쓰기 완료.");
		writer.flush();
		
		Reader reader = new FileReader("C:/javadata/test3.txt");
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
