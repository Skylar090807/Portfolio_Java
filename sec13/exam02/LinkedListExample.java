package sec13.exam02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		//ArrayList와 LinkedList의 실행 성능 비교.
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {//9999번까지 해당 숫자 0번에 넣는 메소드.
			list1.add(0, String.valueOf(i));//ArrayList에 메소드 적용. 시프트 연산으로 옮겨감.
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));//LinkedList에 메소드 적용. 시프트 연산 사용 않고  가리키는 주소만 달라짐.
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime-startTime) + " ns");
		

	}

}
