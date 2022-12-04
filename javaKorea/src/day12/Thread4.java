package day12;

import java.util.ArrayList;

public class Thread4 {
	static ArrayList<String> arr = new ArrayList<>();
	
	public static void main(String[] args) {
		MyThread4 mt4 = new MyThread4();
		MyThread4Ex mt4ex = new MyThread4Ex();
		
		mt4.start();
		mt4ex.start();
	}
}

class MyThread4 extends Thread{
	// 0.5초에 한번씩 add(총 20번)
	@Override
	public void run() {
		go();
	}
	
	public void go() {
		for (int i = 0; i < 20; i++) {
			Thread4.arr.add(""+(i+1));		// static은 객체화없이 사용 가능
			//System.out.print(Thread4.arr.get(0));
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}		
		}	
	}
}

class MyThread4Ex extends Thread{
	// 1초에 한번씩 전체 조회 (총 10번)
	@Override
	public void run() {
		go();
	}
	
	public void go() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < Thread4.arr.size(); j++) {			
				System.out.print(Thread4.arr.get(j)+" ");
			} 
						
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println();
		}	
	}
}