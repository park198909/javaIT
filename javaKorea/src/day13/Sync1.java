package day13;

public class Sync1 {
	public static void main(String[] args) {
		Toilet toilet = new Toilet();
		Thread t1 = new Thread(toilet, "임꺽정");
		Thread t2 = new Thread(toilet, "홍길동");		// 하나의 클래스를 두 쓰레드가 공유할 땐 '동기화'
		
		t1.start();
		t2.start();
		
	}
}

// 식당화장실이 1개, 사람은 많다.
// 동시에 화장실을 이용할 순 없으니 한명이 사용하면 다른 한명은 대기를 시켜야지!
class Toilet implements Runnable{
	private int time;
	@Override
	public void run() {
		synchronized (this) {				// synchronized(객체)
			time = 0;
			System.out.println("화장실 들어감");
			while(time < 5) {
				try {Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
				time++;
				System.out.println(Thread.currentThread().getName()+" 화장실 사용중..."+time+"초");
			}
			System.out.println("화장실 비움");
		}
	}
}