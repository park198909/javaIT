package day07;

public class Extends4 {
	public static void main(String[] args) {
		Human h = new Human(14,"홍길동");
		// 사람 정보를 출력 
		System.out.println("이름: "+h.getName()+", 나이: "+h.getAge());
		Member m = new Member(22, "이순신", 198);
		// 회원 정보를 출력
		m.memberInfo();
	}
}

// 클래스 : 사람Human
class Human{
// 이름, 나이
	private int age;
	private String name;
	
// 생성자를 통해서 정보를 입력
	Human(int age,String name) {
		this.age = age;
		this.name = name;		
	}

// 게터,세터
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}



// 클래스 : 회원Member
class Member extends Human{
	private int mNum;
// 생성자를 통해서 정보를 입력
// +회원번호
	Member(int age, String name, int mNum) {
		super(age, name);	// 부모의 생성자를 사용
		this.mNum = mNum;
	}
		
// 회원번호 게터,세터
	public int getmNum() {
		return mNum;
	}
	
	public void setmNum(int mNum) {
		this.mNum = mNum;
	}
// +회원소개
	public void memberInfo() {
		System.out.println("이름: "+this.getName()+", 나이: "+this.getAge()+", 회원번호: "+this.getmNum());
	}
}	