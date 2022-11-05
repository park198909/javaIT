package day02;

public class If1 {
	public static void main(String[] args) {
		// 상황에 따라서 프로그램 동작을 다르게하고 싶을때 사용하는 문법
		// ex) 버스요금 - 나이에 따라서 금액을 다르게
		
		// if ~ else if ~ else
		// 성인인지 미성년자인지 판별하는 프로그램
		int age = 18;
		if(age >= 20) {
			System.out.println("성인입니다.");
			// 소괄호 안의 내용이 틀리면 무시됨
		}else {
			// 소괄호 안의 내용이 틀리면 실행
			System.out.println("미성년자 입니다.");
		}
		
		int money = 10000;
		if(money > 10000) {
			System.out.println("부자");
		}
		
		/* 
		 if(조건1){
		 	조건이 맞으면 실행할 문장1;
		 	조건이 맞으면 실행할 문장2;
		 } else if(whrjs2){
		 	위 조건이 틀리고 조건2가 맞으면 실행할 문장1;
		 	위 조건이 틀리고 조건2가 맞으면 실행할 문장2;
		 } else if(조건3){
		 	위 모든 조건들이 틀리고 조건3이 맞으면 실행할 문장1;
		 } else{
		 	위 모든 조건들이 틀릴떄 실행할 문장;
		 }
		 */
		
		int 점수 = 89;
		// 덤수가 90이상이면 우등생, 그 외에는 일반학생
		if(점수 >= 90) {
			System.out.println("우등생");
		} else {
			System.out.println("일반학생");
		}
		
	}
}
