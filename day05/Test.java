package day05;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		System.out.println("별의 개수를 입력하세요.");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		for(int i=num-2; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		
		for(int i=1; i<=2*num-1;i++) {
			
			int column =(i<=num)? i:2*num-i;
			
			for(int j=1; j<=column; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	
		
		
			
			
			
				
				
		

	}//main()
	

}//class
