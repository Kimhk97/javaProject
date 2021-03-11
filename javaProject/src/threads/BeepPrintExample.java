package threads;

import java.awt.Toolkit;

class WorkerThread extends Thread {
	@Override
	public void run() {
		super.run();
	}
}

class NewThread implements Runnable {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}


public class BeepPrintExample {
	public static void main(String[] args) {
		
		//Thread를 상속받아서 새로운 WorkerThread 클래스 생성
//		Thread thread = new WorkerThread();
//		thread.start();
	
		//Runnable Interface를 구현하는 객체 클래스를 Thread(new Runnable())의 생성자의 매개값으로 사용
		Thread thread = new Thread();
		thread.start();



		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
