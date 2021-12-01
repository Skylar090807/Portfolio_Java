package day05;

public class ForTest4 {

	public static void main(String[] args) {
//		중첩 for루프
		/*★★★★★
		/*★★★★★
		/*★★★★★
		 * 3행 5열
		 */
		for(int i=1; i<4; i++) {//행의 조건
			for(int j=1; j<6; j++) {//열의 조건
				System.out.print("★");				
			}
			System.out.println();
		}
		
		System.out.println("--중첩 for루프----------");
		
	    for(int i=1; i<4; i++){
	    	for(int j=1;j<3;j++) {
	    		System.out.println("i= "+i+", j="+j);
	    	}
	    	System.out.println("**********************");
	    }

//      [1]중첩 for루프를 이용해서 아래 모양을 출력하세요
//	    ★
//	    ★★
//	    ★★★
//	    ★★★★
	    for(int i=0; i<=4; i++) {
			for(int j=1; j<=i; j++)
				System.out.print("★");
			System.out.println();
		}
	    
	    for(int i=1;i<5;i++) {
	    	for(int j=1;j<5;j++) {
	    		if(i>=j)
	    		System.out.print("★");
	    	}
	    	System.out.println();
	    }
	    System.out.println("----------------");

	    /*중첩 for 루프 이용 아래와 같은 모양 출력. 
	     *    *
	     *   **
	     *  ***
	     * ****		
	     */
	    for(int i=1;i<5;i++){
	    	for(int j=4;j>0;j--){
	    		if(i<j){
	    			System.out.print(" ");
	    		}else{
	    			System.out.print("*");
	    		}
	    	}
	    	System.out.println("");
	    }
	    
	    for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(i+j>=5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	    

	}

}
