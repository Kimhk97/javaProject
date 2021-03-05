package inheritances;

public class DmbPhone extends CellPhone{ // 자식클래스 - extends + 부모클래스명 (상속받겠다)
	//필드 -상속받은 것 +
	int channel;
	
	//생성자 -상속받은 기본
	
	//메소드 -상속받은 것 +
	void turnOnDmb() {
		System.out.println("채널: " + channel + " 방송을 수신합니다 ");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널: " + channel + "로 변경합니다");
	}
	void turnOffDmb () {
		System.out.println("방송을 종료합니다");
	}
	
	@Override
	void powerOn() { //부모한테 상속받은 메소드를 입맛에 맞게 수정해서 쓸 수도 있음. 그대로 써도(굳이 메소드 선언 안 해도) 상관없음
		System.out.println("DmbPhone 전원을 켭니다");
	}
	@Override
	void powerOff() {
		System.out.println("DmbPhone 전원을 끕니다");
	}
	@Override
	void bell() {
		System.out.println("DmbPhone 벨이 울립니다");
	}
	@Override
	public String toString() {
		return "DmbPhone => model : " + model + ", color : " + color + ", channel : " + channel;
	}
	
	
	
	
	

}
