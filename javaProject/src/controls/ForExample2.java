package controls;

public class ForExample2 {
	public static void main(String[] args) { // 구구단,,,어케함?
		for (int i = 2; i <= 9; i++) {
			showResult(i);
		}
//		int num = 4;
//		for (int x = 1; x <= 9; x++) {
//			System.out.println(num + " * " + x + " = " + (num * 1));
//		}
	}

	public static void showResult(int num) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * 1));
		}
	}
}
