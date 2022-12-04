package day12;

import java.util.Iterator;

public class Runnable1 {
	public static void main(String[] args) {
		// 쓰레드 추가 생성법1 : Thread를 상속한다.
		// 쓰레드 추가 생성법2 : Runnable을 상속하고 사용하는 곳에서 Thread를 객체화한다.
		MyRunnable1 mr1 = new MyRunnable1();		// Runnable은 start()가 없다
		Thread t1 = new Thread(mr1);				// Thread를 추사로 객체화 해서
		t1.start();									// start()를 실행한다.
		
		MyThread7 mt7 = new MyThread7();
		mt7.start();
	}
}

class ex1{}

// 자바 : 다중상속이 불가능, 이미 다른걸 상속받고 있으면 Thread 상속이 불가능
class MyRunnable1 extends ex1 implements Runnable{

	@Override
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println(i+" "); 
			try { Thread.sleep(100); } 
			catch (Exception e) {}
		}
	}
}

class MyThread7 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try { Thread.sleep(1100); } 
			catch (Exception e) {}
			System.out.println(i+" ");			
		}
	}
}