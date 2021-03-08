package interfaces;

public class RemoteControlExe {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();

		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();

		rc = new RemoteControl() { // 익명구현개체. class 따로 선언하지 않고 일회용 class 사용하기.
			int volume;

			@Override
			public void turnOn() {
				System.out.println("DVD를 켭니다");

			}

			@Override
			public void turnOff() {
				System.out.println("DVD를 끕니다");

			}

			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("현재 DVD 볼륨은 " + volume);

			}

		};
		rc.turnOn();
		rc.setVolume(8);
		rc.turnOff();

	}

}
