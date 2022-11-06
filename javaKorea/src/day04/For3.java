package day04;

public class For3 {
	public static void main(String[] args) {
		// 5번 "안녕"하기
		for(int i=0; i<5; i++) {
			System.out.println("안녕");
		}
		
		// 1~10까지 합 구하기
		int sum = 0;
		for(int i=1; i<11; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 10~1 거꾸로 출력하기
		System.out.println("========");
		for(int i=10; i>0; i--) {
			System.out.println(i);
		}
		/*		
		//0~20 사이의 숫자 중 짝수만 출력하기
		System.out.println("====1번(if사용)====");
		for(int b=0; b<21; b++) {
			if((b%2)==0) {
				System.out.println(b);
			}
		}
		
		System.out.println("====2번(if사용X)====");
		for(int b=0; b<21; b+=2) {
			System.out.println(b);
		}
		*/
	}
}
