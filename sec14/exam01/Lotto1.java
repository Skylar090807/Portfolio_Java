package csh01.exam01;

public class Lotto1 {

	public static void main(String[] args) {
		System.out.println("----------------------------------------");
		System.out.println("*************Lotto��ȣ ������*************");
		System.out.println("----------------------------------------");

	int Lotto[] = new int[6];

	// �迭 ����
	System.out.print("������ Lotto��ȣ�� ");
	
	for(int i=0; i<Lotto.length; i++){
		Lotto[i] = (int)(Math.random()*45)+1;

	    // ���� �� ��ȯ
		for(int j=0; j<i; j++){//�ߺ� �� ����
			if(Lotto[i] == Lotto[j]){
				i--;
				break;
			}//if
		}//inner for
	}//outer for

	for(int i=0; i<Lotto.length; i++){
		System.out.print(Lotto[i] + " ");
	}//for
	System.out.println(" �Դϴ�.");
	System.out.println("----------------------------------------");
	System.out.println("Maker: �ֽ���");


	}//main
}//class
