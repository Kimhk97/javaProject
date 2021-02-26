package references;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt(); // 값을 입력하도록 하는 메소드
			if(selectNo !=5 && scores == null) {
				System.out.println("학생수를 입력하세요.");
				System.out.println();
				continue;
			}

			if (selectNo == 1) {
				System.out.println("학생수> ");
				studentNum = scanner.nextInt(); //s.n에 입력한 값만큼 저장
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]> }");
					scores[i] = scanner.nextInt();
				}
//				System.out.print("scores[0]> ");
//				scores[0] = scanner.nextInt();
//				System.out.print("scores[1]> ");
//				scores[1] = scanner.nextInt();
//				System.out.print("scores[2]> ");
//				scores[2] = scanner.nextInt();
//				break;
			} else if (selectNo == 3) {
				for (int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
//				System.out.println("scores[0]> " + scores[0]);
//				System.out.println("scores[1]> " + scores[1]);
//				System.out.println("scores[2]> " + scores[2]);
			} else if (selectNo == 4) {
				int sum = 0;
				double avg = 0.0;
				int maxValue = 0;
				for (int i = 0; i<scores.length; i++) {
					sum += scores[i];
					if (scores[i] > maxValue) {
						maxValue = scores[i];
					}
				}
				avg = (double) sum / scores.length;
				System.out.println();

			} else if (selectNo == 5) {
				run = false;
			}
			System.out.println("프로그램 종료.");
		}
	}

}
