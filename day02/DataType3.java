package day02;

public class DataType3 {
	public static void main(String[] args) {
//		main+ctrl+space bar :main method ����Ű
		System.out.println("3.������---------");
//		char 2byte: 0 ~ 2^16-1 (65535)
//		short 2byte: -2^15 ~ 2^15-1
		char c1='A';
//		char type�� �����ڵ� ü�� ���.(\u0000)
		char c2='\uff57';
		System.out.println("c1: "+c1);
		System.out.println("c2: "+c2);
		char c3='ʫ';
//		char c4='������'; ����
		String s1="������";
//		String�� �⺻�ڷ����� �ƴ�. reference type.
		System.out.println("c3: "+c3);
		System.out.println("s1: "+s1);
		
		
	    char c4='A';
//	    char type ���꿡 ���Ǹ� int�� promotion.
	    System.out.println(c4+1);
//	    A:�ƽ�Ű�ڵ� �� 65
//	    A+1=65+1 �̹Ƿ� c4+1������ 66
        
	    
	    System.out.println("4. ����-------");
//	    boolean : true or false
	    boolean bool=true;
	    boolean bool2=false;
	    boolean bool3=2<3;
	    
	    System.out.println("bool: "+bool);
	    System.out.println("boo2: "+bool2);
	    System.out.println("boo3: "+bool3);
	    
	    
		
		
		
	}

}
