package inheritances;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 0; i < 7; i++) {
			int problemLocation = car.run(); //run 메소드

			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire 교체");
				car.frontLeft = new HankookTire("앞왼쪽", 10);
				break;

			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRight = new KumhoTire("앞오른쪽", 12);
				break;

			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeft = new HankookTire("뒤왼쪽", 15);
				break;
				
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRight = new KumhoTire("뒤오른쪽", 20);
				break;
			}
			System.out.println("-------------------------"); //1회전 출력시 내용 구분
		}
		System.out.println("프로그램 종료.");
	}
}
