package controls;

public class ForExample { // 1~10까지의 합계
	public static void main(String[] args) {
		int sum = 0; // 초기화
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) { // 짝수만 합계
//			System.out.println("i: " + i);
//			System.out.println("sum: " + sum);
				sum += i; // sum은 1, i는 2, 이런 식으로 점점 증가하며 계속 더함

			}

		}
		System.out.println("1~10까지의 합계: " + sum);
	}
}
