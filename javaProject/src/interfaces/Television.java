package interfaces;

public class Television implements RemoteControl { // RemoteControl을 받아 Television이 구현해줘야함
	int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLLUME) {
			this.volume = RemoteControl.MIN_VOLLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨은 " + volume);
	}

}
