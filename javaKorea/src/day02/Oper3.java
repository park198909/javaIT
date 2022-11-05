package day02;

public class Oper3 {
	public static void main(String[] args) {
		
		//산술연산자 : +,-,*,/,%
		//대입연산자 : =
		//누적연산자 : +=, -=, *=, /=
		
		int 숫자1;
		int 숫자2;
		숫자1 = 3;
		숫자2 = 2;
		
		System.out.println(숫자1+숫자2);
		int 숫자3 = 숫자1+숫자2;
		System.out.println(숫자3);
		숫자1 = 숫자1 + 숫자2;			//자기자신 + 다른변수 적용 후 자기자신에 결과값 적용(누적연산자)
		System.out.println(숫자1);
		
		숫자1 += 숫자2; // 숫자1 = 숫자1 + 숫자2와 같은 결과가 나옴
		System.out.println(숫자1+"\n");
		
		int i = 0;
		
		i += 3;
		System.out.println("i += 3 = "+i);
		i += 3.14;
		System.out.println("i += 3.14 = "+i);
		i *= 2;
		System.out.println("i *= 2 = "+i);
		i /= 2;
		System.out.println("i /= 2 = "+i);
		i -= 5;
		System.out.println("i -= 5 = "+i);
		i %= 2;
		System.out.println("i %= 2 = "+i);
		
		
				
		
		//증감연산자 : ++, --
		//비교연산자 : >, <, >=, <=, ==, !=
		//논리연산자 : &&, ||, !
		
		
		
		
	}
}
