package inheritances;

public class SmartPhone extends DmbPhone { // d.p가 c.p를 상속받앗으니 결과적으로 s.p는 c.p + d.p

	public String toString() {
		
		
		@Override
		void powerOn() {
			System.out.println("SmartPhone 전원을 켭니다");
		}

		@Override
		void powerOff() {
			System.out.println("SmartPhone 전원을 끕니다");
		}

		return"SmartPhone => model : "+model+", color : "+color;
	}

	
}
