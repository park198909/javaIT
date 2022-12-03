package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class List5 {
	public static void main(String[] args) {
		ListModel lm = new ListModel(0, 0, null, null, null);
		ListClass5 lc5 = new ListClass5(lm);
		lc5.go();
	}
}

class ListClass5{
	
	ListModel lm;
	public ListClass5(ListModel lm) {
		this.lm = lm;
	}
	
	public void go() {
		ArrayList<String> arr3 = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("[1.추가 2.수정 3.제거 4.보기 0.종료]");
			lm.setStr(sc.next());
			switch(lm.getStr()) {
			case "1":
				System.out.print("추가할 항목 입력>>>");
				lm.setAddStr(sc.next());
				arr3.add(lm.getAddStr());
				break;
			case "2":
				System.out.print("수정할 위치를 입력하세요>>>");
				lm.set수정Int(sc.nextInt());
				System.out.print("수정할 내용을 입력하세요>>>");
				lm.set수정Str(sc.next());
				arr3.set(lm.get수정Int()-1, lm.get수정Str());
				break;
			case "3":
				System.out.print("삭제할 위치를 입력하세요>>>");
				lm.setRmInt(sc.nextInt());
				arr3.remove(lm.getRmInt()-1);
				break;
			case "4":
				for(int i=0; i< arr3.size(); i++) {
					System.out.print(arr3.get(i)+" ");
				}
				break;
			case "0":
				break;
			default:
				System.out.println("다른 번호를 입력하세요.");
				continue;
			}			
			if(lm.getStr().equals("0")) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		sc.close();
	}
}

class ListModel{
	private int 수정Int, rmInt;
	private String str, addStr, 수정Str;
	
	public ListModel(int 수정Int, int rmInt, String str, String addStr, String 수정Str) {
		this.수정Int = 수정Int;		
		this.str = str;		
		this.addStr = addStr;
		this.rmInt = rmInt;
		this.수정Str = 수정Str;		
	}

	public int get수정Int() {
		return 수정Int;
	}
	public void set수정Int(int 수정Int) {
		this.수정Int = 수정Int;
	}
	public int getRmInt() {
		return rmInt;
	}
	public void setRmInt(int rmInt) {
		this.rmInt = rmInt;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String getAddStr() {
		return addStr;
	}
	public void setAddStr(String addStr) {
		this.addStr = addStr;
	}
	public String get수정Str() {
		return 수정Str;
	}
	public void set수정Str(String 수정Str) {
		this.수정Str = 수정Str;
	}
}
