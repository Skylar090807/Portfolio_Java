package csh01.exam01;

public class Lotto1 {

	public static void main(String[] args) {
		System.out.println("----------------------------------------");
		System.out.println("*************Lotto번호 생성기*************");
		System.out.println("----------------------------------------");

	int Lotto[] = new int[6];

	// 배열 생성
	System.out.print("생성된 Lotto번호는 ");
	
	for(int i=0; i<Lotto.length; i++){
		Lotto[i] = (int)(Math.random()*45)+1;

	    // 랜덤 값 반환
		for(int j=0; j<i; j++){//중복 값 제거
			if(Lotto[i] == Lotto[j]){
				i--;
				break;
			}//if
		}//inner for
	}//outer for

	for(int i=0; i<Lotto.length; i++){
		System.out.print(Lotto[i] + " ");
	}//for
	System.out.println(" 입니다.");
	System.out.println("----------------------------------------");
	System.out.println("Maker: 최승희");


	}//main
}//class
