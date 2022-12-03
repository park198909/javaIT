package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Map3 {
	public static void main(String[] args) {
		Map3Impl mi3 = new Map3Impl();
		mi3.go();
	}
}

class Map3Impl{
	private HashMap<String, String> hm = new HashMap<>();
	public void go() {
		// 국가별 수도
		// 국가를 입력하세요(0을 입력하면 전체보기)>>한국
		// 한국:서울
		
		Set<String> keyset = null;
		Iterator<String> it = null;
		
		hm.put("한국", "서울");
		hm.put("대한민국", "서울");
		hm.put("중국", "베이징");
		hm.put("미국", "워싱턴");
		hm.put("영국", "런던");
		hm.put("일본", "도쿄");	
		
				
		Scanner sc = new Scanner(System.in);
		System.out.println("국가를 입력하세요(0을 입력하면 전체보기)>>");
		String K = sc.next();
		String V = hm.get(K);
		
		if(K.equalsIgnoreCase("0")) {
			keyset = hm.keySet();
			it = keyset.iterator();
			while(it.hasNext()) {				
				String key = it.next();
				System.out.print(key+" : ");
				System.out.println(hm.get(key));
			}
		}else if(hm.get(K) == null || hm.get(K).equals("")) {
			System.out.println("해당 국가가 없습니다.");
		}else {
			System.out.println(K+" : "+V);
		}
		
		sc.close();
	}
}