package day04;

public class IfGrade2 {

	public static void main(String[] args) {
		// ��ø if��
		 int score = 85;
	        String grade = null;
	        // ��ø if�� : ��ø�� ���������� �� �� ������ �ΰ����� �ϴ� ���� �ٶ����ϴ�.
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
	        
	        System.out.println("���� : " + grade);

	}

}
