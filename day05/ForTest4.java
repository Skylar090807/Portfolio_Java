package day05;

public class ForTest4 {

	public static void main(String[] args) {
//		��ø for����
		/*�ڡڡڡڡ�
		/*�ڡڡڡڡ�
		/*�ڡڡڡڡ�
		 * 3�� 5��
		 */
		for(int i=1; i<4; i++) {//���� ����
			for(int j=1; j<6; j++) {//���� ����
				System.out.print("��");				
			}
			System.out.println();
		}
		
		System.out.println("--��ø for����----------");
		
	    for(int i=1; i<4; i++){
	    	for(int j=1;j<3;j++) {
	    		System.out.println("i= "+i+", j="+j);
	    	}
	    	System.out.println("**********************");
	    }

//      [1]��ø for������ �̿��ؼ� �Ʒ� ����� ����ϼ���
//	    ��
//	    �ڡ�
//	    �ڡڡ�
//	    �ڡڡڡ�
	    for(int i=0; i<=4; i++) {
			for(int j=1; j<=i; j++)
				System.out.print("��");
			System.out.println();
		}
	    
	    for(int i=1;i<5;i++) {
	    	for(int j=1;j<5;j++) {
	    		if(i>=j)
	    		System.out.print("��");
	    	}
	    	System.out.println();
	    }
	    System.out.println("----------------");

	    /*��ø for ���� �̿� �Ʒ��� ���� ��� ���. 
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
