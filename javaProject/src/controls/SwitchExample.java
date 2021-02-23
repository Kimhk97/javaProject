package controls;

public class SwitchExample {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
//			int z = (int) (Math.random() * 10) + 1;
//			System.out.println(z); // 0~5 사이의 임의의 수 실행
		}
		String msg = "짝수/홀수";
		int z = (int) (Math.random() * 10) + 1;
		switch (z) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			msg = "홀수";
			break;
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
			msg = "짝수";
			break;
		}
		System.out.println(z + "는 " + msg + " 입니다.");
	}
}
