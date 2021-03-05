package inheritances;

public class CellPhoneEx2 {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone(); // 부모를 담고
//		cp = (CellPhone) new DmbPhone(); //부모 말고 또 자식을 담을 수도 있음 //int = (int) byte; -> (CellPhone) new DmbPhone
//		cp = (CellPhone) new SmartPhone();
		cp.color = "";

		if (cp instanceof DmbPhone) {
			DmbPhone dp = (DmbPhone) cp; // 부모 인스턴스가 자식 메소드를 강제로 가지게 됨 //cp를 변환할 때 타입이 맞는지 확인
			dp.model = "";
			dp.color = "";
			dp.channel = 15;
			dp.powerOn();
			System.out.println("Casting 완료");

		} else {
			System.out.println("Casting 할 수 없습니다.");
		}
		
		//다형성
		//부모 > 자식들 -> 부모의 메소드에 자식의 메소드가 호출됨
		
		cp = new DmbPhone();
		cp.powerOn();
		
		cp = new SmartPhone();
		cp.powerOn();

	}
}
