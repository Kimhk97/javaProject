package references;

import java.util.Scanner;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[] intArys = new int[10];

//		Scanner scn = new Scanner(System.in);

		int sum = 0;
		double avg = 0;
		int cat = 0;
		for (int i = 0; i < intArys.length; i++) {
			intArys[i] = (int) (Math.random() * 100) + 1;
			sum += intArys[i];
			avg = sum / 10.0;
//
			if (intArys[i] % 2 == 0) {
				cat += intArys[i];
			}
//		while (true) {
//			System.out.println("배열의 위치 입력: ");
//			int loc = scn.nextInt();
//			if (loc < 0) {
//				break;
//			}
//			System.out.println(loc + "위치의 배열값은: " + intArys[loc]);
//		}
		}

		System.out.println("숫자의 합: " + sum);
		System.out.println("숫자의 평균: " + avg);
		System.out.println("짝수의 합: " + cat);
	}
}
