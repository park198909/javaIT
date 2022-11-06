package day04;

public class While3 {
	public static void main(String[] args) {
		int i = 0;
		while(i < 10) {
			System.out.println(i+"번");
			i++;
		}
		
		//5번 "안녕"하기
		int j = 0;
		while(j < 5) {
			System.out.println("안녕");
			j++;
		}
		
		// 1~10까지 합 구하기	(답:55)
		int k = 0, sum = 0;
		while(k < 11) {
			sum += k;
			k++;
		}
		System.out.println(sum);
		
		// 1~50까지 합 구하기	(답:1275)
		int x = 0, sum2 = 0;
		while(x < 51) {
			sum2 += x;
			x++;
		}
		System.out.println(sum2);
		
	
	}
}
