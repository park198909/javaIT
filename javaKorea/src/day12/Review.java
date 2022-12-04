package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Review {
	public static void main(String[] args) {
		// 컬렉션 : 배열을 좀더 쉽게 사용학시 위해 자바에서 제공해주는 클래스(자바에서 만든 배열)
		// List, Set, Map
		// List : 삭제 및 삽입이 쉽고 순서를 갖고 있음
		// Set : 중복X, 순서X, Iterator
		// Map : 키와 값으로 이루어짐, 순서가 아닌 키로 관리
		__List lst = new __List();
		//lst.go();
		__Set1 st = new __Set1();
		//st.go();
		__Map1 m = new __Map1();
		m.go();
	}
}

class __List{
	ArrayList<String> arr = new ArrayList<>();			// 추가, 수정, 삭제가 쉬운 배열
	public void go() {
		// 추가 add
		arr.add("한개");
		arr.add("두개");
		arr.add("세개");
		arr.add("네개");
		
		// 삽입 add
		arr.add(0, "영개");
		
		// 조회 get
		System.out.println(arr.get(1));
		
		// 삭제 remove
		arr.remove(0);
		arr.remove("네개");
		
		// 수정 set
		arr.set(0, "첫번째");
		
		System.out.println("=============");
		// 전체 조회 size + get
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}

class __Set1{
	Set<String> hs = new HashSet<>();		// 다형성 : 자식 클래스는 부모 클래스를 자료형으로 사용해도 됨
	public void go() {
		// 추가 add (중복되는 내용은 저장되지 않는다.)
		hs.add("한개");
		hs.add("한개");
		hs.add("한개");
		hs.add("두개");
		
		// 전체 조회 Iterator
		Iterator<String> iter = hs.iterator();
		while(iter.hasNext()) {					// 다음 것이 있는가?
			String str = iter.next();			// 현재 것을 반환(다음 것을 지정)
			System.out.println(str);		
		}
	}
}

class __Map1{
	HashMap<Integer, String> hm = new HashMap<>();		// 웹에서 자주 사용, 순서가 아닌 내가 지정한 키워드로 보관
	public void go() {
		// 추가 put
		hm.put(100, "백");
		hm.put(90, "구십");
		hm.put(200, "이백");
		hm.put(150, "백오십");
		hm.put(150, "key는 중복이 안됩니다.");		
		hm.put(150, "key가 같으면 덮어 씁니다.");		
		
		// 조회 get
		System.out.println(hm.get(150));		// key값을 가지고 value를 가져온다.
		System.out.println(hm.keySet());
		
		// 전체 조회 Set
		Set<Integer> keys = hm.keySet();
		Iterator<Integer> iter = keys.iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			System.out.println(key+":"+hm.get(key));		// 키 : 값
		}
		
		// Map 자체를 보기
		System.out.println(hm);
	}
}