package sec10.exam02.wordg;

public class Player {
//	필드
	 String name; //참가자 이름
	 String word; //단어 저장 변수
	 int lastIndex;//단어의 마지막 글자 위치를 가리키는 인덱스 값
	 char lastChar, firstChar; //마지막 글자, 첫번째 글자
	 int wholeChar;//전체 글자 변수
	 
//	 생성자
	 Player(String name){//참가자가 입력한 이름을 받는다.
	  this.name = name;
	 }
	 
//	 메소드
	 public String sayWord(String word) {//참가자가 입력한 단어를 받는다.
	  this.word = word;
	  return word;
	 }
	 
//	 메소드 - 이전 플레이어가 입력한 단어 마지막 문자와 다음 플레이어가 말한 단어 시작 문자가 같은지 비교.
//	       - 끝 글자가 같으면 성공(true), 다르면 실패(false) 메소드.
	 public boolean succeed(String lastword) {
//		 int len=lastword.length();//이전 단어의 길이 //더 빠른 연산
//		 int newlen=word.length();//참가자 입력 단어 길이
//		 if(newlen<=1) {
//			 System.out.println("단어의 길이는 2글자 이상이어야 합니다.");
//			 return false;
//		 }
//		 else {
		 wholeChar = word.length();//lastword전체 글자 길이 wholeChar에 대입 
		 lastIndex = lastword.length()-1; //lastword의 단어 길이 끝을 lastIndex대입.
		 lastChar = lastword.charAt(lastIndex); //lastIndex의 단어 길이 끝을 cahrAt()을 이용하여 
//	                                           마지막 글자 lastChar에 대입
		 firstChar=word.charAt(0);//charAt()을 이용하여 
//	  		word(참가자가 입력한 단어) 첫번째 글자를 firstChar에 대입.
	  
		 if((wholeChar>=2)&&(lastChar == firstChar))
			 //lastChar와 firstChar가 같고 wholeChar의 길이 값이 2보다 크거나 같으면 true.
			 return true;
		 
			 
		 
	  
		 else // lastChar와 firstChar가 다르면 false.
			 return false;
//		 }
		 
	 


	 }//boolean
}//class
