package day07;

public class StirngTest {

	public static void main(String[] args) {
		//java.lang.String Ŭ����
		//public char charAt(int index)
		//: index ��ġ�� ���� 1���� �����ؼ� ��ȯ.
		
		//public int length()
        //���ڿ��� ���̸� ��ȯ.
		
		//non-static method ���� �� "��ü��.�޼ҵ��()"
		
		String str="Good Job~";//9��
		
		int len=str.length();
		System.out.println(str+"�� ����: "+len);
		
		char c= str.charAt(5);
		System.out.println(c);
		
		//[����1] str�� ���ڸ� �ݺ��� ���鼭 1���� �����ؼ� charŸ�� �迭�� ����
		char[] crr=new char[str.length()];
		
		for(int i=0; i < str.length(); i++) { 
			char ch=str.charAt(i);
			System.out.println(ch);
			crr[i]=ch;
			 
		}
		
		//Enhanced for loop(Ȯ�� for ����)
		//for(��������: �ڷᱸ��){ ���๮...}
		System.out.println("*****************************");
		
		for(char x:crr) {
			System.out.println(x+": "+Character.isUpperCase(x));
		}
		
		System.out.println();
		
		//[����2] str2 ���� 1���� �����ؼ� �� ���ڸ� ���� �� 1+2+3+4+5 ���
		String str2 = "12345"; 
		int sum = 0; 
		for(int i=0; i < str2.length(); i++) { 
			 int ch= str2.charAt(i) - '0';
			 System.out.println(ch);
			 sum+=ch;
		} 
		System.out.println("sum="+sum); 
		
		//[����3] java�� ���� �������� 4-13
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���: ");
		//String value = "12o34"; 
		String value=sc.next();
		char ch = ' '; 
		boolean isNumber = true;
		
		//�ݺ����� charAt(int i)�� �̿��ؼ� ���ڿ��� ���ڸ�
		//�ϳ��� �о �˻��Ѵ�  
		
		for(int i=0; i < value.length() ;i++) { 
			//if(!Character.isDigit(ch)){ }
			if (!(value.charAt(i) >= '0' && value.charAt(i) <= '9')) {

				isNumber = false;

				break;

			}
		
		} 
	
		if (isNumber) { 
			System.out.println(value+" �� �����Դϴ� ."); 
		} else { 
		System.out.println(value+" �� ���ڰ� �ƴմϴ� .");  
		}
	
		
	}//main

}//class
