package day02;

public class Review {
	public static void main(String[] args) {
		// 컨트롤 + 스페이스바 = 자동완성
		// 컨트롤 + F11 = RUN
		// 컨트롤 + 알트 + ↓ = 현재 줄을 아래줄에 복사
		// 컨트롤 + Y = 컨트롤 + Z 취소 
		// F11 = 디버그 리뷰(한줄씩 실행)
		
		String word = "Java";		
		System.out.println("Hello "+word);
		System.out.println("======");		
		System.out.println("Hello "+word);
		System.out.println("======");
		System.out.println("Hello "+word);
		System.out.println("Hello "+word);
		System.out.println("Hello "+word);
		System.out.println("======");
		System.out.println("Hello "+word);
		System.out.println("Hello "+word+"\n");
	
		//변수 : 저장공간
		String str = "Hi";		//문자형
		int num = 0;			//정수
		double dnum = 0.0;		//실수

		System.out.println((double)num); 	//자료형변환 -----> (자료형)변수이름 입력
		
		System.out.println(str);
		str = "Hello";
		System.out.println(str+"\n");
		
		str = "Java2"; 				// 왼쪽은 공간, 오른쪽은 값을 의미함, str(공간) = Java2(값)
		System.out.println(word);
		word = str;
		System.out.println(word+"\n");
		
		String 한글변수가능;
		한글변수가능 = "한글";			//한글로 변수공간 생성가능, 첫글자는 한글,영어만가능(숫자,특수문자 안됨)
		System.out.println(한글변수가능);
		
		// 자바 개발환경 : 인텔리제이(사기업), Egov(국가행정SI), 오리지널 이클립스는 사용되지 않는다.
		
	}
	
}
