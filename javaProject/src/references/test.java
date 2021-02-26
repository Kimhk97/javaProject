package references;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		int engScores[] = new int[3]; // 배열과 값 선언! int 영어성적을 담을 수 있는 배열. engScores = 3개
		int mathScores[] = new int[3]; // int 수학성적을 담을 수 있는 배열. mathScores = 3개

		int engSum = 0;
		int mathSum = 0;
		double engAvg = 0;
		double mathAvg = 0;

		Scanner scanner = new Scanner(System.in); // 사용자가 직접 입력할 수 있게 하는 것. import 꼭 합쉬댜!

		for (int i = 0; i < engScores.length; i++) {
			engScores[i] = scanner.nextInt();
			for (int j = 0; j < engScores.length; j++) {
				engSum = engScores[j];
				engAvg = engSum / 3.0;
			}
		}

		for (int i = 0; i < mathScores.length; i++) {
			mathScores[i] = scanner.nextInt();
			for (int j = 0; j < mathScores.length; j++) {
				mathSum = mathScores[j];
				mathAvg = mathSum / 3.0;
			}
			System.out.println("영어 평균: " + engAvg);
			System.out.println("수학 평균: " + mathAvg);
		}

	}

}
