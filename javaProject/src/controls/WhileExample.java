package controls;

public class WhileExample {
	public static void main(String[] args) {
		int sum = 0, i = 0;
		while (i <= 10) {
			sum = sum + i;
			i++;
		}
		System.out.println("1~10의 합계: " + sum);

// 1~10
		i = 1;
		sum = 0;
		while (true) { //아래 식대로 true일 때 계속 반복. false가 나오기 전까지.
			sum = sum + i;
			i++;
			if (i >= 10) {
				break;
			}
		}
		System.out.println("1~10의 합계2 : " + sum);
	}
}
