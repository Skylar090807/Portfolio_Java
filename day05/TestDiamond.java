package day05;
import java.util.*;
public class TestDiamond {

	public static void main(String[] args) {
		System.out.println("���� ������ �Է��ϼ���.");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=0; i < num; i++) {
		    for(int j=0; j < num; j++) {
		        if(i <= num / 2) {
		            if(i+j <= num/2-1) {
		                System.out.print(" ");
		            }else if(j-i >= num/2+1) {
		                System.out.print(" ");
		            }else {
		                System.out.print("*");
		            }
		        }else if (i>num/2)
		        {
		            if (i-j>=num/2+1)
		                System.out.print(" ");
		            else if (i+j>=num/2*3+1)
		                System.out.print(" ");
		            else
		                System.out.print("*"); 
		        }
		    }
		    System.out.println();
	}

  }
}
