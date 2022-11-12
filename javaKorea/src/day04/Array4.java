package day04;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		// 입력받은 나라의 수도를 알려주는 프로그램 만들기
		// 국가, 수도
		
		// 어느 나라의 수도가 궁금하신가요?
		// '미국'
		// 미국의 수도는 워싱턴 입니다.		
		String nations[] = {"한국","대한민국","미국","중국","일본"};
		String cities[] = {"서울","서울","워싱턴","베이징","도쿄"};
		
		String str;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("\n"+"어느 나라의 수도가 궁금하신가요?");
		str = sc.next();
		int idx = -1;
			if(str.equals("0")) {
				System.out.println("프로그램 종료");
				break;
			}
			for(int i=0; i<nations.length; i++) {
				if(str.equals(nations[i])) {
					switch(i) {
						case 0:
							System.out.println(nations[i]+"의 수도는 "+cities[i]+" 입니다.");
							idx=i;
							break;
						case 1:
							System.out.println(nations[i]+"의 수도는 "+cities[i]+" 입니다.");
							idx=i;
							break;
						case 2:
							System.out.println(nations[i]+"의 수도는 "+cities[i]+" 입니다.");
							idx=i;
							break;
						case 3:
							System.out.println(nations[i]+"의 수도는 "+cities[i]+" 입니다.");
							idx=i;
							break;
						case 4:
							System.out.println(nations[i]+"의 수도는 "+cities[i]+" 입니다.");
							idx=i;
							break;
						default:
							break;
					}
				}
			}
			if(idx == -1){
			System.out.println("없는 나라입니다.");
			}
		}	
		sc.close();
	}
}
