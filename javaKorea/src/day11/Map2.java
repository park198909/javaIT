package day11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Map2 {
	public static void main(String[] args) {
		Map2Impl mi2 = new Map2Impl();
		mi2.go();
		mi2.tester();
	}
}

class Map2Impl{
	HashMap<String, String> hm = new HashMap<>();
	public void go() {
		// 단어 5개 영한사전
		hm.put("earth", "지구");
		hm.put("sun", "태양");
		hm.put("moon", "달");
		hm.put("mars", "화성");
		hm.put("jupiter", "목성");		
	}
	
	public void tester() {
		String word_eng = null, word_kor = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("[영한사전]검색할 단어를 입력하세요>>");
		word_eng = sc.next();
		word_kor = hm.get(word_eng);	
		if(word_kor.equals(null) || word_kor.equals("")){
			System.out.println("없는 단어 입니다.");
		}else {
			System.out.println("뜻 : "+word_kor);		
		}
	}
}