package operators;

public class MethodExample {
	public static void main(String[] args) {
		int result = sum(10, 20);
		System.out.println("���: " + result);
		// �ϳ��� ��ġ�� sysout("���: " + sum(10, 20)); -> sysout�� �̹� result�Ͽ� ����Ѵٴ� ���� ��� �־
		// ���� result �ʿ�x
		result = minus(30, 20); // minus = ����
		System.out.println("���: " + (30 - 20)); // �̷��� �ٷ� ������ ����ؼ��� ����
		result = multi(15, 13); // multi = ��
		result = divide(30, 12); // divide = ���� ��
		// result = 30, 20�� ���̸� ����ϴ� minus()
		// result = 15, 13�� ���� ����ϴ� multi()
		// result = 30, 12�� ���� ���� ����ϴ� divide()
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

		System.out.println(str1.equals(str2)); //���ڿ� ��
		System.out.println(str1.equals(str3));
		
	}

	public static void printAge(int age) {
		System.out.println("���̴�: " + age + "�Դϴ�.");
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
