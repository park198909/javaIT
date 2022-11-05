package day02;

public class Oper6 {
	public static void main(String[] args) {
		//산술연산자 : +,-,*,/,%
		//대입연산자 : =
		//누적연산자 : +=, -=, *=, /=
		//증감연산자 : ++, --
		//비교연산자 : >, <, >=, <=, ==, !=
		//논리연산자 : &&, ||, !
		
		// && : amd
		// || : or
		// ! : not(boolean값을 반대로 바꿈)
		
		boolean tst = !(true);
		// System.out.println(tst);
		
		boolean 참 = true;
		boolean 거짓 = false;
		
		// and &&
		System.out.println("참&&참: "+(참 && 참));
		System.out.println("참&&거짓: "+(참 && 거짓));
		System.out.println("거짓&&참: "+(거짓 && 참));
		System.out.println("거짓&&거짓: "+(거짓 && 거짓));
		
		// 청소년 : 14세이상 ~ 20세미만
		int age = 15;
		System.out.println(age >= 14 && age <= 20);
		
		// or || 또는 : 앞이나 뒤 둘중 하나만 맞아도 맞음
		System.out.println("참||참: "+(참 || 참));
		System.out.println("참||거짓: "+(참 || 거짓));
		System.out.println("거짓||참: "+(거짓 || 참));
		System.out.println("거짓||거짓: "+(거짓 || 거짓));
		
		//키가 150cm이상이거나 나이가 15이상이면 통과
		double height = 160.0;
		System.out.println(height >= 150 || age >= 15);
		
		// not ! 아니면 : 맞으면 틀린걸로, 틀리면 맞는걸로
		System.out.println(!참);			// false
		System.out.println(!거짓);		// true
		
		System.out.println("==========");
		
		int x = 100, y = 200;
		boolean result;
		result = x<y && y>=200;
		
		System.out.println(result);
		result = x<y && y<200;
		System.out.println(result);
		result = x<y || y>=200;
		System.out.println(result);
		result = x<y || y<200;
		System.out.println(result);
		result = !(x>y);
		System.out.println(result);		
	}
}
