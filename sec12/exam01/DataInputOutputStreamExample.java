package sec12.exam01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/javadata/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("감자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush(); dos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream("C:/javadata/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		
//		for(int i=0; i<2; i++) {
//			String name = dis.readUTF();
//			double score = dis.readDouble();
//			int order = dis.readInt();
//			System.out.println(name + " : " + score + " : " + order);
//		}
		
		//second.db 파일에 primitive.db의 내용을 copy.
		FileOutputStream fos2 = new FileOutputStream("C:/javadata/second.db");
		DataOutputStream dos2 = new DataOutputStream(fos2);
		
		for(int i=0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			dos2.writeUTF(name);
			dos2.writeDouble(score);
			dos2.writeInt(order);
			System.out.println(name + " : " + score + " : " + order);
		}
		dos2.flush(); dos2.close(); fos2.close();
		dis.close(); fis.close();
		
		FileInputStream fis2 = new FileInputStream("C:/javadata/second.db");
		DataInputStream dis2 = new DataInputStream(fis2);
		for(int i=0; i<2; i++) {
			String name = dis2.readUTF();
			double score = dis2.readDouble();
			int order = dis2.readInt();
			System.out.println(name + " : " + score + " : " + order);
			
		}
		
		dis2.close(); fis2.close();


	}

}
