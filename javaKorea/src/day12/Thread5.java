package day12;

public class Thread5 {
	public static void main(String[] args) {
		// 멀티쓰레드
		// 우선순위 정하는 방범2
		// 1. join() : 지금 실행중인 쓰레드말고는 전부 대기해라
		// 2. setPriority() : 우선순위 정하기
		
		MyThread5 mt5 = new MyThread5();
		MyThread5Ex mt5ex = new MyThread5Ex();
		MyThread5Ex mt5ex2 = new MyThread5Ex();
		
		mt5.start();
		try { mt5.join(); }			// join() : 나 말고 대기
		catch (Exception e) {}
		
		mt5ex.start();		// 대기중(join)
		mt5ex2.start();		// 대기중(join)
		
	}
}

class MyThread5 extends Thread{
	@Override
	public void run() {
		go();
	}
	
	public void go() {
		for (int i = 0; i < 20; i++) {
			Thread4.arr.add(""+(i+1));		// static은 객체화없이 사용 가능
			try {
				Thread.sleep(10);
			} catch (Exception e) {}
		}	
	}
}

class MyThread5Ex extends Thread{
	@Override
	public void run() {
		go();
	}
	
	public void go() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < Thread4.arr.size(); j++) {			
				System.out.print(Thread4.arr.get(j)+" ");
			} 
			System.out.println();
		}	
	}
}