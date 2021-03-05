package inheritances;

public class SmartPhone extends DmbPhone { // d.p가 c.p를 상속받앗으니 결과적으로 s.p는 c.p + d.p

	
	public String toString() {
		
		@Override
		void powerOn() { //부모한테 상속받은 메소드를 입맛에 맞게 수정해서 쓸 수도 있음. 그대로 써도(굳이 메소드 선언 안 해도) 상관없음
			System.out.println("SmartPhone 전원을 켭니다");
		}
		
		@Override
		void powerOff() {
			System.out.println("SmartPhone 전원을 끕니다");
		}
		
		return "SmartPhone => model : " + model + ", color : " + color;
		
		
		}
}
