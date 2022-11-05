package day02;

public class Oper7 {
	public static void main(String[] args) {
		//삼항연산자 : 조건에 따라서 프로그램 동작을 다르게 (if문을 주로 사용하여 쓰지는 않음)
		int num = 3;
		String result = (num < 2) ? "맞다" : "틀리다";
		System.out.println(result);
	}
}
