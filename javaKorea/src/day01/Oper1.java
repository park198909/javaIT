package day01;

public class Oper1 {
	public static void main(String[] args) {
		// String : 문자열
		// int : 정수
		// double : 실수
		
		int 숫자1 = 3,숫자2 = 2;
		
		System.out.println(1+1);
		System.out.println(3-4);
		System.out.println(3*3);
		System.out.println(10/2);
		System.out.println();
		
		int 숫자3 = 숫자1+숫자2;
		System.out.println(숫자3);
		System.out.println(숫자1+숫자2);
		System.out.println();
		
		
		//연산자
		
		String str = "Hello" + " " + "World" + "!";
		System.out.println(str);	
		
		int num = 1+1, num1 = 2-1, num2 = 3*3, num3 = 9/3, num4 = 10%3;
		System.out.println(num);	
		
		System.out.println(num1);	
	
		System.out.println(num2);	

		System.out.println(num3);	
	
		System.out.println(num4);	
		
		int 국어 = 57, 영어 = 41, 수학 = 61, 합계 = 0;
		double 평균 = 0;
		합계 = 국어+영어+수학;
		System.out.println("합계 : "+합계);
		평균 = 합계/3;
		System.out.println("평균 : "+평균);
		
	}
}
