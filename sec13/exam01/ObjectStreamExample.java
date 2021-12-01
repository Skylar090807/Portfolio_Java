package sec13.exam01;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ObjectStreamExample {

	public static void main(String[] args) throws Exception {
		writeList();
		List<Board> list = readList();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(Board board : list) {
			System.out.println(
				board.getBno() + "\t" + board.getTitle() + "\t" + 
				board.getContent() + "\t" + board.getWriter() + "\t" +
				sdf.format(board.getDate())
			);
		}
	}
	
	public static void writeList() throws Exception {
		List<Board> list = new ArrayList<>();
		
		list.add(new Board(1, "����1", "����1", "�۾���1", new Date()));
		list.add(new Board(2, "����2", "����2", "�۾���2", new Date()));
		list.add(new Board(3, "����3", "����3", "�۾���3", new Date()));
		
		FileOutputStream fos = new FileOutputStream("C:/Temp/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}
	
	public static List<Board> readList() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Temp/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board> list = (List<Board>) ois.readObject();
		return list;
		

	}

}
