package day04;

public class Array1 {
	public static void main(String[] args) {
		// 변수
		String name = "이름";
		int age = 12;
		double heigh = 111.1;
		
		// 하나의 주제로 변수들을 묶고 싶을때
		// 카페메뉴 나열 
		String menu1 = "에스프레소";
		String menu2 = "아메리카노";
		String menu3 = "카페라떼";
		String menu4 = "카페모카";
		String menu5 = "오렌지주스";
		String menu6 = "케모마일차";
		String menu7 = "쌍화차";
		
		// 카페메뉴 전시 : 일일히 다 해줘야 함
//		System.out.println(menu1);
//		System.out.println(menu2);
//		System.out.println(menu3);
//		System.out.println(menu4);
//		System.out.println(menu5);
//		System.out.println(menu6);
//		System.out.println(menu7);
		
		// 반복문이 사용 가능한 묶음으로 만들자
		// 배열
		String[] menu = {"에스프레소","아메리카노","카페라떼","카페모카","오렌지주스","케모마일차","쌍화차"};
		/*
		System.out.println(menu[0]);
		System.out.println(menu[1]);
		System.out.println(menu[2]);
		System.out.println(menu[3]);
		System.out.println(menu[4]);
		System.out.println(menu[5]);
		System.out.println(menu[6]);
		System.out.println(menu[1+5]);
		*/
		
		// 메뉴 전체 보여주기
		for(int i=0; i<7; i++) {
			System.out.println(menu[i]);	// menu[0] ~ mene[6]
		}
		
	}
}
