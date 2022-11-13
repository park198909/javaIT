package day06;

// public class : 파일 당 1개만 생성가능
public class Class10 {
	public static void main(String[] args) {
		MyClass10 mc = new MyClass10();
		
		mc.function1();
		mc.function2("java");
		System.out.println(mc.function3("My","Quiz"));
		System.out.println(mc.function4(3, -4));
		
	}
}

class MyClass10{
	// #1 매개변수가 없고 리턴값이 없는 Hello World 출력해주는 메서드
	void function1() {
		System.out.println("Hello world");
	}
	// #2 매개변수가 String 1개, 매개변수의 문자열을 출력해주는 메서드
	void function2(String str) {
		System.out.println(str);
	}
	// #3 매개변수로 String 2개를 받아서, 두 문자열을 합치고 return
	String function3(String str1, String str2) {
		return (str1 + str2);
	}	
	// #4 매개변수로 int 2개를 받아서, 매개변수가 음수면 각각 양수로 만들고 더해서 return
	// 절댓값으로 만들고 더한 다음 return
	int function4(int a,int b) {
		if(a<0) {				
			a = a*(-1);
		}
		if(b<0) {				
			b = b*(-1);
		}	
		return a+b;
	}
}
