package day01;

public class Var3 {
	public static void main(String[] args) {
		
		
		
		String 변수1 = "저장공간1";
		
		
		int 뺄셈 = 13-4;
		String 주소 = "13-4";
		String 휴대폰 = "010-4597-5843";
		Double 파이 = 3.14;
		
		System.out.println(뺄셈);
		System.out.println(휴대폰);
		System.out.println(파이);
		
		휴대폰 = "010-1234-5678";
		System.out.println(휴대폰);
		System.out.println(주소);
		System.out.println(변수1);
		
		String var1;			//선언 : 공간만 만듬
		String var2 = "hi";		//초기화 : 공간을 만들고 값을 입력
		System.out.println(var2);
		var1 = "hello";			//대입 : 기존 공간의 값을 변경
		System.out.println(var1);
		
	}
}
