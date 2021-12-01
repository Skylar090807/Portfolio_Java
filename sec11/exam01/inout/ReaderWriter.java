package sec11.exam01.inout;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderWriter {

	public static void main(String[] args) throws Exception {
		
		//���� ��� ��Ʈ��(���� ���� �� ����)
		Writer writer = new FileWriter("C:/javadata/test3.txt");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		char[] array = {'D', 'E', 'F'};
		char i = '\n';
		
		String title = "�ֱ���";
		String national = "���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮 ���� ����";
		
		
		writer.write(a);//���Ͽ� A�Է�
		writer.write(b);//B
		writer.write(c);//C
		writer.write(array);//DEF
		writer.write(array, 1, 2);//EF
		writer.write(i);
		writer.write(title);
//		writer.write("\n"+title+"\n"); //�ð� ���⵵ ���
		writer.write(i);
		writer.write(national);//���ع���~...
		
		System.out.println("test3.txt ���Ͽ� ���� ��, �迭 �� ���� �Ϸ�.");
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
