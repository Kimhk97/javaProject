package inheritances;

public class Tire {
	int maxRotation; // 최대회전수
	int accumulatedRotation; // 누적회전수
	String location; // 타이어의 위치

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;

	}

	public boolean roll() { // 최대회전수 = 누적회전수가 되면 더이상 사용할 수 없음
		accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
