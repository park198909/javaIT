package day03;

import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {
		// 국어, 영어, 수학
		// 각각 40점 이상이고
		// 총합이 150 이상이면
		// '합격'
		// 그 외에는 '불합격'
		// &&
		
		int 국어, 영어, 수학, 합계;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어성적을 입력하세요 : ");
		국어 = sc.nextInt();
		System.out.println("영어성적을 입력하세요 : ");
		영어 = sc.nextInt();
		System.out.println("수학성적을 입력하세요 : ");
		수학 = sc.nextInt();
		
		합계 = 국어 + 영어 + 수학;
		
		if(합계 >= 150){
			if(국어 >= 40 && 영어 >= 40 && 수학 >= 40) {
				System.out.println("합격");
			}else {
				System.out.println("과락");
			}
		}else {
			System.out.println("불합격");
		}
		
		sc.close();		
	}
}
