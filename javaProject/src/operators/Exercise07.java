package operators;

public class Exercise07 {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;

		System.out.println((x > 7) && (y <= 5)); // 연산자 기호 이해하기
		System.out.println((x % 3 == 2) || (y % 2 != 1));

		boolean z = (x++ % 2 == 0) || (y++ % 3 == 0);
		if (z) {
			System.out.println("true: " + x + ", y: " + y);
		} else {
			System.out.println("false: " + x + ", y: " + y);
		}
		System.out.println(z);
	}

}
