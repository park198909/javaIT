package day02;

public class Oper5 {
	public static void main(String[] args) {
		//산술연산자 : +,-,*,/,%
		//대입연산자 : =
		//누적연산자 : +=, -=, *=, /=
		//증감연산자 : ++, --
		//비교연산자 : >, <, >=, <=, ==, !=
		
		boolean 참거짓1 = true;
		boolean 참거짓2 = false;
		
		System.out.println(3 > 2);
		System.out.println(3 < 2);
		System.out.println("");
		// > 크다
		// < 작다
		// >= 크거나 같다
		// <= 작거나 같다
		// == 같다
		// != 다르다
		int 숫자1 = 1;
		int 숫자2 = 2;
		System.out.println(숫자1 > 숫자2);
		System.out.println(숫자1 < 숫자2);
		System.out.println(숫자1 >= 숫자2);
		System.out.println(숫자1 <= 숫자2);
		System.out.println(숫자1 == 숫자2);
		System.out.println(숫자1 != 숫자2);
		System.out.println("");
		
		int x = 20, y=10;
		Boolean result = false;
		
		result = x>y;
		System.out.println("x>y = "+result);
		result = x<y;
		System.out.println("x<y = "+result);
		result = x>=y;
		System.out.println("x>=y = "+result);
		result = x<=y;
		System.out.println("x<=y = "+result);
		result = x==y;
		System.out.println("x==y = "+result);
		result = x!=y;
		System.out.println("x!=y = "+result);
		
		//각 자료형의 기본값은 다음과 같다
		int 정수 = 0;
		double 실수 = 0.0;
		String 문자열 = null;
		boolean 불린 = false;
		char 문자 = '\0';
		
		
		
		
		
		//논리연산자 : &&, ||, !
	}
}
