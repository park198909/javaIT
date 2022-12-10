package day13;

public class Sync2 {
	public static void main(String[] args) {
		// 사람 3명
		Room room = new Room();
		Thread t1 = new Thread(room, "임꺽정");
		Thread t2 = new Thread(room, "홍길동");
		Thread t3 = new Thread(room, "최진사");
		
		t1.start();
		t2.start();
		t3.start();
	}
}

// 의상실
// 한 사람이 사용 중이면 다른 사람들은 대기를 해야한다 ==> 동기화
class Room implements Runnable{
	private int time;
	@Override
	public void run() {
		synchronized (this) {
			time = 0;
			System.out.println(Thread.currentThread().getName()+" 탈의실 입장");
			while(time<5) {
				try {Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
				time++;
				System.out.println("갈아입는 중 - "+time+"초");
			}
			System.out.println("탈의실 비움\n");
		}
	}
	
}