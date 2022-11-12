package day05;

public class Class6 {
	public static void main(String[] args) {
		Person 홍길동 = new Person();
		Person 이순신 = new Person();
		
		홍길동.name = "홍길동";
		홍길동.age = 30;
		홍길동.gender = "남자";
		홍길동.height = 177.7;
		
		이순신.name = "이순신";
		이순신.age = 45;
		이순신.gender = "남자";
		이순신.height = 180.0;
		
		홍길동.정보보기();
		홍길동.인사하기();		
		
		System.out.println();
		
		이순신.정보보기();
		이순신.인사하기();		
	}
}

class Person{
	// 이름, 나이, 성별, 키
	String name;
	int age;
	String gender;
	double height;
	
	// 정보입력 (이름,나이,성별,키 입력)
	public void 정보입력(String name,int age,String gender,double height) {
		name = this.name;
		age = this.age;
		gender = this.gender;
		height = this.height;
	}
	
	// 정보보기 (이름,나이,성별,키 출력)
	public void 정보보기() {
		System.out.println("이름:"+this.name+" 나이:"+this.age+" 성별:"+gender+" 키:"+height);
	}
	// 인사하기 (홍길동이 인사합니다)
	public void 인사하기() {
		System.out.println(this.name+"이 인사합니다.");
	}
	
}

