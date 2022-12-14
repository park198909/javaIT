package day11;

import java.util.ArrayList;

public class List2 {
	public static void main(String[] args) {
		// 객체화
		ListClass2 lc2 = new ListClass2();
		// go사용
		lc2.go();
	}
}

class ListClass2{
	
	public void go() {
		ArrayList<String> arr1 = new ArrayList<>();			// <>(제네릭(C++용어)) : 클래스에 자료형 부가할 떄 사용
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		// 추가,삽입 add
		// 수정 set
		// 삭제 remove
		// 읽기 get
		// 총갯수 size
		arr1.add("일");			// 방이 한개 생성되고 "일"을 대입
		arr1.add("이");			// 방이 한개 생성되고 "이" 대입
		
		// 읽기
		System.out.println(arr1.get(0));
		System.out.println(arr1.get(1));
		
		arr2.add(1);
		arr2.add(2);
		
		System.out.println(arr2.get(0));
		System.out.println(arr2.get(1));
	}
}