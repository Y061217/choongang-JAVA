package thread01;

import java.util.ArrayList;
import java.util.List;

//다중작업
//Thread 클래스를 상속하거나
//Runnable 인터페이스를 사용
public class Thread04 implements Runnable{
	int seq;
	
	public Thread04(int seq) {
		this.seq = seq;
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		System.out.println(seq + "스레드 시작");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(seq + "스레드 종료");
		
	}
	public static void main(String[] args) {
		System.out.println("메인 시작");
		List<Thread> list = new ArrayList<Thread>();
		for (int i = 0; i < 20; i++) {
			Thread t = new Thread(new Thread04(i));
			t.start();
			list.add(t);
			
		}
		
		for (int i = 0; i < list.size(); i++) {
			Thread t = list.get(i);
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("메인 종료");
	}
}
