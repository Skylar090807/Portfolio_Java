package csh01.exam01;

public class Lotte2 {

	public static void main(String[] args) {
		System.out.println("---------------------------------------");
		System.out.println("*************Lotto번호 생성기*************");
		System.out.println("---------------------------------------");
		
		int Lotto[] = new int[6];
		System.out.print("생성된 Lotto번호는 ");

		for(int i=0;i<Lotto.length;i++){
		Lotto[i] = (int)(Math.random()*45)+1;

			for(int j=i-1;j>=0;j--){//중복 값 제거
				if(Lotto[i]==Lotto[j]){
					i--;
					break;
	
				}//if
			}//inner for

		}//outer for

		 

		for(int i=0; i<Lotto.length; i++){
		System.out.print(Lotto[i] + " ");
		}
		System.out.println(" 입니다.");
		System.out.println("---------------------------------------");
		System.out.println("Maker: 최승희");

		

		
	}

}
