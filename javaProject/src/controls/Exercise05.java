package controls;

public class Exercise05 {
	public static void main(String[] args) {
////		for (int i = 1; i <= 5; i++) {
////			for (int j = 1; j <= 5; j++) {
////				System.out.println("*");
////			}
////			System.out.println();
////		}
//		
//		exercise05();
//	}
//	
//	public static void exercise06() {
//		for (int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.println("*");
//			}
//			System.out.println();
//		}
//	}
//	
//	public static void exercise05() {
//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i + " * " + j + " = " + (i * j) + " ");
//			}
//		}
//		System.out.println(); // 자동줄바꿈. println에 줄바꿈이 설정되어 있기 때문에
//	}
		// 임의의 값 두 수를 35, 60
		// 35~60까지의 합을 구하는 프로그램 생성

//		int sum = 0;
//		for(int i=35; i<=60; i++) {
//			sum += i;
//		}
//		System.out.println("35부터 60까지의 합: " + sum);
//		

		int sNum = 44;
		int eNum = 67;
		int sum = getSumValue(sNum, eNum);
		System.out.println("두 수 사이의 합계: " + sum + "");
	}

	public static int getSumValue2(int n1, int n2) {
		int sum = 0;
		if (n1 < n2) {
			for (; n1 <= n2; n1++) {
				sum = sum + n1;
			}
		} else {
			for (; n1 >= n2; n2++) {
				sum = sum + n2;
			}
		}
		return sum;
	}

	public static int getSumValue(int n1, int n2) {
//			int startNo = (n1 > n2) ? n2:n1; //둘 중에 작은 수를 startNo에 넣겠다
//			int endNo = (n1 > n2) ? n1:n2; //둘 중에 큰 수를 endNo에 넣겠다 -이렇게 해도 됩니다요. 그렇게 해서 아래식에서 변수 이름 바꿔서 넣기

//		int sum = 0;
//		if (n1 > n2) {
//			for (int i = n1; i >= n2; i--) {
//				sum = sum + i;
//			}
//		} else {
//			for (int i = n1; i <= n2; i++) {
//				sum = sum + i;
//			}
//		} -이렇게 해도 됩니다. 작은 수와 큰 수를 if로 설정해서 sum하겠다.

		int sum = 0;
		for (int i = n1; i <= n2; i++) {
			sum = sum + i;
		}
		return sum; // 배운 정석으로 하였읍니다... 어렵다 어려워
	}
}
