package controls;

public class Exercise04 {
	public static void main(String[] args) {
		int sum = 0;
		int x = (int) (Math.random() * 5) + 1;
		int y = (int) (Math.random() * 5) + 1;

		while (true) {
			if (x+y == 5) {
				break;
			}
		}

		System.out.println("(x, y)");
	}
}
