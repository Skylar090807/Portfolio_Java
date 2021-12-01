package sec09.exam01;

public class NullPointerExeption {

	public static void main(String[] args) {
		
		try {
		   String str = null;
		   System.out.println(str);
		   System.out.println(str.toString());// NullPointerException
		} catch(NullPointerException e) {
			System.out.println("변수가 null값을 가지고 있어 연산 사용 불가.");
		}
		
		try {
			int num[]= {10,20,30,40,50}; //index num[0]~num[4]
		
			for(int i=0; i<=5; i++) 
				System.out.println(num[i]); //ArrayIndexOutOfBoundsException
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 index가 값의 범위를 벗어났습니다.");
		}
		
		try {
		String strnum1="123";
		String strnum2="Gangseo";
		
		int num1=Integer.parseInt(strnum1);
		System.out.println(num1);
		int num2=Integer.parseInt(strnum2); //NumberFormatException
		System.out.println(num2);
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환 불가 문자열 포함.");
			
		}
		
		try {
		Class clazz = Class.forName("java.lang.String2");//ClassNotFoundException
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
		
		
		
		
		

	}

}
