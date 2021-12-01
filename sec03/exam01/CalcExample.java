package sec03.exam01;

public class CalcExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
//		int result1 = myCalc.plus(5,6);
//		System.out.println("result1: "+result1);
		System.out.println("result: "+myCalc.plus(5, 6));
		
//		double result11 = myCalc.plus(5.5,6.7);
//		System.out.println("result11: "+result11);
		System.out.println("result: "+myCalc.plus(5.5,6.7));
		
//		int result3 = myCalc.minus(76,38);
//		System.out.println("result3: "+result3);
		System.out.println("result: "+myCalc.minus(76,38));
		
		System.out.println("result: "+myCalc.minus(76.678,38.987));
		
//		int result4 = myCalc.mul(76,38);
//		System.out.println("result3: "+result4);
		System.out.println("result: "+myCalc.mul(76, 38));
		
		System.out.println("result: "+myCalc.mul(76.678, 38.987));
		
		
		
		byte x= 10;
		byte y= 4;
		double result2 = myCalc.divide(x, y);
		System.out.printf("%d / %d = %.1f \n",x,y,result2);
//		System.out.println("result2: "+result2);
		
		System.out.println("-------------------------");
		
		Calculator yourCalc = new Calculator("°øÇÐ¿ë","Casio",70000);
		yourCalc.calcInfo();
		yourCalc.calcInfo("ÃÖ½ÂÈñ");
		yourCalc.calcInfo("ÃÖ½ÂÈñ",2021);
		
		myCalc.powerOff();
		

		
		

	}//main

}//class
