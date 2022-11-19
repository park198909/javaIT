package day07;

public class OverLoading2 {
	// 오버로딩 : 일반 메서드에는 햇깔리기 떄문에 권장하지 않음
	// 오버로딩 : 생성자 or 연산자 (자바에서는 생성자에서만 주로 쓰임)
		
	// 생성자 : 객체화를 하면서 처음에 해줄 작업들을 적어놓는 메서드
	OverLoading2() {
		System.out.println("생성자1");
	}
	
	OverLoading2(int num) {
		System.out.println("생성자2");
	}
	OverLoading2(int num1, int num2) {
		System.out.println("생성자3");
	}
	OverLoading2(String str) {
		System.out.println("생성자4");
	}
}
