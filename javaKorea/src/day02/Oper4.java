package day02;

public class Oper4 {
	public static void main(String[] args) {
		//산술연산자 : +,-,*,/,%
		//대입연산자 : =
		//누적연산자 : +=, -=, *=, /=
		//증감연산자 : ++, --
		
		int 숫자1 = 0;
		숫자1 += 1;		//숫자1 = 숫자1 + 1;
		숫자1++; 			//숫자1 += 1;
		
		int num = 3;
		num--;			//num -= 1;
		System.out.println(num);
		num++;			//num += 1;
		System.out.println(num);
		
		++num;			//1을 누적연산 후 코드 실행
		num++; 			//코드 실행 후 1을 누적연산
		
		int 숫자2 = 0;
		System.out.println(++숫자2);
		System.out.println(숫자2++);
		System.out.println(숫자2);

		num = num + 1;
		num += 1;
		num++;
		
		//비교연산자 : >, <, >=, <=, ==, !=
		//논리연산자 : &&, ||, !
		
		
	}
}
