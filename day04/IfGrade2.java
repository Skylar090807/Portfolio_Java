package day04;

public class IfGrade2 {

	public static void main(String[] args) {
		// 중첩 if문
		 int score = 85;
	        String grade = null;
	        // 중첩 if문 : 중첩은 무제한으로 할 수 있지만 두개까지 하는 것이 바람직하다.
	        if (score >= 90) {
	            
	            if (score >= 95) {
	                grade = "A+";
	            }
	            else {
	                grade = "A0";
	            }
	        }
	        
	        else if (score >= 80) {
	            
	            if (score >= 85) {
	                grade = "B+";
	            }
	            else {
	                grade = "B0";
	            }
	        }
	        else {
	            grade = "C";
	            
	        }
	        
	        System.out.println("학점 : " + grade);

	}

}
