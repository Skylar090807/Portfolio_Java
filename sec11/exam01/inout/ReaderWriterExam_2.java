package sec11.exam01.inout;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;

public class ReaderWriterExam_2 {

		public static void main(String[] args) throws Exception {
			// c:/javadata/원본.txt => 복사본.txt copy
			Writer	writer = new FileWriter("C:/javadata/복사본.txt");
			FileInputStream	instr = new FileInputStream("C:/javadata/원본.txt");
			InputStreamReader inreader = new InputStreamReader(instr, "UTF-8");
			char[]	buffer = new char[100];
			
			int	readByte=0;
			while(true) {
				readByte = inreader.read(buffer);
				if(readByte == -1)
					break;
				writer.write(buffer, 0, readByte);
			}
			
			writer.flush();
			writer.close();
			instr.close();
			inreader.close();
		

	


	}
	}



