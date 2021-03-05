package inheritances;

public class CellPhoneEx {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
		cp.model = "Galaxy";
		cp.color = "White";
		cp.powerOn();
		cp.bell();
		cp.powerOff();

		cp.equals(" "); //CellPhone에 메소드를 삽입한 적 없는데 문제가 없다. object라고 하는 루트 클래스에서 다른 모든 클래스들이 상속받고 있기 때문.
		cp.getClass();
		cp.toString();
		
		System.out.println("=========================================");
		DmbPhone dp = new DmbPhone(); //따로 선언없이 CellPhone을 상속만 받은 상태에서도 메소드 사용 가능
		dp.model = "Motolora";
		dp.color = "Black";
		dp.channel = 10;

		dp.powerOn(); //원래는 부모한테 상속받은 대로 CellPhone으로 떴지만 DmbPhone 클래스에서 따로 정의해주면 그대로 뜸 (overriding)
		dp.bell();
		dp.turnOffDmb();
		dp.turnOnDmb();
		dp.changeChannel(20);
		dp.powerOff();
		
		System.out.println("==========================================");
		SmartPhone sp = new SmartPhone();
		sp.model = "LGPhone";
		sp.color = "Pink";
		sp.commonMethond();
		
		System.out.println("==========================================");
		System.out.println(cp.toString()); //그냥 cp만 넣으면 주소값이 나옴! toString 또한 object 최상위 클래스에 위치.
		System.out.println(dp.toString());
		System.out.println(sp.toString()); //상속(노출) 순서 : sp는 dp한테도 받고 cp한테도 받았는데, dp에서 override 된 경우 dp의 내용이 먼저 뜸
		//그러니까 sp <- dp <- cp 이기 때문에 sp는 dp의 영향을 먼저 받고, 따로 override 안 된 부분은 cp에게서 받아오는 것! 
		
	}

	
	
}
