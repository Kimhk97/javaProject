package controls;

public class Morning0225 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 11; i <= 30; i++) {
			sum += i;
		}
		System.out.println("방법1: " + sum);

		sum = 0;
		int v1 = 11;
		int v2 = 30;

		for (int i = v1; i <= v2; i++) {
			sum += i;
		}
		System.out.println("방법2: " + sum);

		sum = 0;
		sum = getSum(v1, v2);
		System.out.println("방법3: " + sum);

	}
	public static int getSum(int fromValue, int toValue) {
		int sum = 0;
		for (int i = fromValue; i <= toValue; i++) {
			sum += i;;
		}
		return sum;
	}

}
