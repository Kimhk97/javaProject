package references;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = new int[3];
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt(); // 값을 입력하도록 하는 메소드

			if (selectNo == 1) {
				System.out.println("학생수> " + scores.length);
			} else if (selectNo == 2) {
				System.out.print("scores[0]> ");
				scores[0] = scanner.nextInt();
				System.out.print("scores[1]> ");
				scores[1] = scanner.nextInt();
				System.out.print("scores[2]> ");
				scores[2] = scanner.nextInt();
			}

			int a = scanner.nextInt();
			int b = 0;
			int c = 0;

			System.out.println("scores[0]> " + a);
			System.out.println("scores[1]> " + b);
			System.out.println("scores[2]> " + c);

//				int a = scanner.nextInt();
//				int b = scanner.nextInt();
//				int c = scanner.nextInt();

		}
	}

}
