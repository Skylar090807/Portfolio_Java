package sec11.exam01.inout;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class InoutExample1 {

	public static void main(String[] args) throws Exception {//���� ����� ���� ó��
		//���� ��� ��Ʈ���� �̿��� javadata���� �ȿ� test1.txt���� ���� �� byte�����͸� ����.
		OutputStream os = new FileOutputStream("C:/javadata/test1.txt");
				
				byte a = 10;
				byte b = 20;
				byte c = 30;
				byte[] array = {10, 20, 30, 40, 50 };
				
				os.write(a);
				os.write(b);
				os.write(c);
				os.write(array);
				os.write(array, 2, 3);//�迭 �ε��� 2������ 3�� �о��
				System.out.println("���� ��� �Ϸ�");
//				os.flush();
				
				

		//���� �Է� ��Ʈ���� �̿��� javadata���� �ȿ� test1.txt ���� ���� �а� ���.		
		InputStream is = new FileInputStream("C:/javadata/test1.txt");
				
				while(true) {
					int data= is.read();
					if(data == -1)
						break;
					System.out.println(data);
				}
				
				
		
		//���� �Է� ��Ʈ���� �̿��� javadata ���� �ȿ� �ִ� test1.txt ������ ���븣 �о� ��		
		//buffer �迭 ������ ���� �� �� ������ ������ ȭ�鿡 ���		
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
		//buffer[]�� �ִ� ������ test2.txt ���Ͽ� ���.
		os2.write(buffer);
		
		System.out.println("-------------------------------");
		
		//test2.txt ���Ͽ� ����ִ� ������ �о� ȭ�鿡 ��� 
		InputStream is3 = new FileInputStream("C:/javadata/test2.txt");
		while(true) {
			int data= is3.read();
			if(data == -1)
				break;
			System.out.println(data);
		}
		
		
				
		
		//�Է� ��Ʈ���� ��� ��Ʈ���� ����(���� ���� ���� ����)		
		is.close();
		os.close();
		is2.close();
		os2.close();
		is3.close();

		

	}

}
