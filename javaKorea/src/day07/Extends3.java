package day07;

public class Extends3 {
	public static void main(String[] args) {
		
		TestClass tc = new TestClass();
		TestClassEx tce = new TestClassEx();
		tc.Print();
		tce.Print();
		tce.add("aaaa", 3.14);
	}
}
class TestClass{
	// private : 나 외에 다 사용불가\
	// protected : 상속받은 클래스까지는 허용
	// default : 같은 패키지면 허용
	// public : 같은 프로젝트면 허용
	
	// 상속할거면 private -> protected
	protected int num;
	protected String str;
	protected double dNum;
	
	public void Print() {
		System.out.println("테스트 클래스 사용");
	}	
}

// TestClass를 상속받아서 수정&추가
class TestClassEx extends TestClass{
	
	// 수정(오버라이딩)	
	public void Print() {
		System.out.println("TestClassEx가 만든 Print 사용");
		super.Print();
	}
	
	//추가
	public int add(String str, double dNum) {
		System.out.println("추가된 메서드 실행");
		super.num = 123;
		super.str = str;
		super.dNum = dNum;
		System.out.println(super.str);
		System.out.println(super.num);
		System.out.println(super.dNum);		
		return 0;
	}
}



