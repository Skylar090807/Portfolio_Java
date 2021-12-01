package sec13.exam02;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		//Board ��ü�� �����ϴ� Vector
		List<Board> list = new Vector<Board>();
		//Vector ���� ��ü Ÿ�� Board�� �Ķ���ͷ� ǥ���ϰ� ������ ȣ��.
		
	
		//Board ��ü ����
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
		
		list.remove(2);
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}

}
