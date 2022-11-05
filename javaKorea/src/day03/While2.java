package day03;

public class While2 {
	public static void main(String[] args) {
		
		// while은 무한반복을 방지하기 위해 플래그를 세움
		// 반복문 : 유사한 코드를 원하는 횟수만큼 실해시키기 위해서
		
		// 5번 -> 15번 -> 10000번 -> 반복문 사용
		// System.out.println("Hello");	
		
		int i = 0;			// 플래그 0
		while(i != 10000) {
			System.out.println("Hello");
			i++; 			//중괄호 실행시마다 i를 1씩 늘려줌
		}
	}
}
