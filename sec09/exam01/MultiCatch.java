package sec09.exam01;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			   String str = null;
			   System.out.println(str);
			   System.out.println(str.toString()); // NullPointerException
			   
				int num[]= {10,20,30,40,50}; //index num[0]~num[4]
				
				for(int i=0; i<=5; i++) //ArrayIndexOutOfBoundsException
					System.out.println(num[i]);
				
				String strnum1="123";
				String strnum2="Gangseo";
				
				int num1=Integer.parseInt(strnum1);
				System.out.println(num1);
				int num2=Integer.parseInt(strnum2); //NumberFormatException
				System.out.println(num2);
				
				Class clazz = Class.forName("java.lang.String2");//ClassNotFoundException
			
			
		} 
		catch(NullPointerException e) {
			System.out.println("������ null���� ������ �־� ���� ��� �Ұ�.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� index�� ���� ������ ������ϴ�.");
		}
		catch(NumberFormatException e) {
				System.out.println("���ڷ� ��ȯ �Ұ� ���ڿ� ����.");
				
		}
		catch(ClassNotFoundException e) {
				System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
		catch(Exception e) {
			System.out.println(e);
		}//���� Exception�� catch ���� �ϴܿ� ��ġ.
		finally {
			System.out.println("���ܰ� �߻��� ��� ���۾� �����ϼ���. ");
			
		}

	}

}
