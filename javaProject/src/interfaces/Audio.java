package interfaces;

public class Audio implements RemoteControl { //R.C 인터페이스에서... 구현한다는...??
	int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio 켭니다");

		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio 끕니다");
		
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
		System.out.println("현재 Audio 볼륨은 " + volume);
		
	}
	
	

}
