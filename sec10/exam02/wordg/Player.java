package sec10.exam02.wordg;

public class Player {
//	�ʵ�
	 String name; //������ �̸�
	 String word; //�ܾ� ���� ����
	 int lastIndex;//�ܾ��� ������ ���� ��ġ�� ����Ű�� �ε��� ��
	 char lastChar, firstChar; //������ ����, ù��° ����
	 int wholeChar;//��ü ���� ����
	 
//	 ������
	 Player(String name){//�����ڰ� �Է��� �̸��� �޴´�.
	  this.name = name;
	 }
	 
//	 �޼ҵ�
	 public String sayWord(String word) {//�����ڰ� �Է��� �ܾ �޴´�.
	  this.word = word;
	  return word;
	 }
	 
//	 �޼ҵ� - ���� �÷��̾ �Է��� �ܾ� ������ ���ڿ� ���� �÷��̾ ���� �ܾ� ���� ���ڰ� ������ ��.
//	       - �� ���ڰ� ������ ����(true), �ٸ��� ����(false) �޼ҵ�.
	 public boolean succeed(String lastword) {
//		 int len=lastword.length();//���� �ܾ��� ���� //�� ���� ����
//		 int newlen=word.length();//������ �Է� �ܾ� ����
//		 if(newlen<=1) {
//			 System.out.println("�ܾ��� ���̴� 2���� �̻��̾�� �մϴ�.");
//			 return false;
//		 }
//		 else {
		 wholeChar = word.length();//lastword��ü ���� ���� wholeChar�� ���� 
		 lastIndex = lastword.length()-1; //lastword�� �ܾ� ���� ���� lastIndex����.
		 lastChar = lastword.charAt(lastIndex); //lastIndex�� �ܾ� ���� ���� cahrAt()�� �̿��Ͽ� 
//	                                           ������ ���� lastChar�� ����
		 firstChar=word.charAt(0);//charAt()�� �̿��Ͽ� 
//	  		word(�����ڰ� �Է��� �ܾ�) ù��° ���ڸ� firstChar�� ����.
	  
		 if((wholeChar>=2)&&(lastChar == firstChar))
			 //lastChar�� firstChar�� ���� wholeChar�� ���� ���� 2���� ũ�ų� ������ true.
			 return true;
		 
			 
		 
	  
		 else // lastChar�� firstChar�� �ٸ��� false.
			 return false;
//		 }
		 
	 


	 }//boolean
}//class
