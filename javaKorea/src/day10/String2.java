package day10;

public class String2 {
	public static void main(String[] args) {
		MyString2 ms2 = new MyString2();
		ms2.go();
	}
}


class MyString2{
	private String str;		// 접근권한제어자는 멤버변수에만 사용(지역변수X)
	
	public void go() {
		String str1 = "Hello World";
		System.out.println(str);			// String의 기본값 == null
		
		// String클래스에서 지원해주는 메서드
		System.out.println(str1.equals(str));				// '비교' false | true
		System.out.println(str1.charAt(6));					// 6번방 '문자' (배열)
		System.out.println(str1.indexOf("Wor"));			// Wor의 첫번째 글자의 '방번호'를 반환(알려줌)
		System.out.println(str1.length());					// 문자열의 '길이'
		System.out.println(str1.startsWith("Hello"));		// Hello로 '시작'하는 문자열인지 true | false
		System.out.println(str1.contains("World"));			// World 문자열을 '포함'하고 있는지 조사 true | false
		System.out.println(str1.substring(6, 10+1));		// 6번방 ~ 10번방의 문자열을 잘라내서 반환(World)		
		System.out.println(str1.replace("Hello", "Hi"));	// Hello 문자열을 찾아서 Hi로 '교체'
	}
}