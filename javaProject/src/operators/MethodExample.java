package operators;

public class MethodExample {
	public static void main(String[] args) {
		int result = sum(10, 20);
		System.out.println("결과: " + result);
		// 하나로 합치면 sysout("결과: " + sum(10, 20)); -> sysout에 이미 result하여 출력한다는 뜻을 담고 있어서
		// 굳이 result 필요x
		result = minus(30, 20); // minus = 차이
		System.out.println("결과: " + (30 - 20)); // 이렇게 바로 연산자 사용해서도 가능
		result = multi(15, 13); // multi = 곱
		result = divide(30, 12); // divide = 나눈 몫
		// result = 30, 20의 차이를 계산하는 minus()
		// result = 15, 13의 곱을 계산하는 multi()
		// result = 30, 12의 나눈 몫을 계산하는 divide()
		printAge(25);

		int n1 = 10;
		int n2 = 20;
		if (n1 == n2) {
			System.out.println("");
		}
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);

		System.out.println(str1.equals(str2)); //문자열 비교
		System.out.println(str1.equals(str3));
		
	}

	public static void printAge(int age) {
		System.out.println("나이는: " + age + "입니다.");
	}

	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}

	public static int minus(int a, int b) {
		int result = a - b;
		return result;
	}

	public static int multi(int a, int b) {
		int result = a * b;
		return result;
	}

	public static int divide(int a, int b) {
		int result = a / b;
		return result;
	}

}
