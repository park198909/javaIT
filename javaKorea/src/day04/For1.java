package day04;

public class For1 {
	public static void main(String[] args) {
		// 반복문 : while, for
		// for : while이 너무 지저분하니까 정리해서 쓰자 *for내부에서 설정한 변수는 for문 종료 후 사라진다.
		
		//while버전
		int j = 0;
		while(j < 5) {
			System.out.println("while안녕");
			j++;
		}
		
		//for버전
		for(int i=0; i<5; i++) {
			System.out.println("for안녕");
		}
		
		/*
			 for(초기값;조건;증감량){
			 	반복하고자 하는 코드들;
			 }
		*/
		
		// 1~10까지 합 구하기	(답:55)
		// while버전
		int k = 0, sum = 0;
		while(k < 11) {
			sum += k;
			k++;
		}
		System.out.println(sum);
		
		//for버전
		int 총합 = 0;
		for(int b=0; b<11; b++) {
			총합	+= b;
		}
		System.out.println(총합);
		
		// 1. 초기값을 생성 
		// 2. 조건식 검사
		// 3. {} 실행
		// 4. 증감식
		// 5. 조건식 검사
		// 6. {} 실행
		// ...
		
	}
}
