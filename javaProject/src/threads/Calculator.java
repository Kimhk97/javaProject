package threads;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) { //sync : 단 하나의 스레드만 시행. 원래는 user1, 2 다 나오는데 이제 위에 있는 것만 나옴
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
