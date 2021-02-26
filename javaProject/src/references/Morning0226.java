package references;

import java.util.Scanner;

public class Morning0226 {
	public static void main(String[] args) {
		String[] names = { "임성원", "정준영", "도왕락" };
		int[] scores = { 88, 89, 90 };
		
		for(int i=0; i<3; i++) {
			System.out.println(names[i] + " 점수:" + scores[i]);
		}
		
		for (String name : names) {//names 배열에 들어있는 갯수만큼 name이라는 변수에 담아서 출력을 하겠다?
					}
		
		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
		}
			System.out.println("합계점수: " + sum);
		
		arrayCopy();
		morning0226();

	}

	public static void arrayCopy() {

		int[] oldAry = { 45, 55, 67 };
		int[] newAry = new int[3];
		for (int i = 0; i < oldAry.length; i++) {
			newAry[i] = oldAry[i]; // new의 값이 old와 같아짐
		}

		int[] newAry2 = new int[5];
		System.arraycopy(newAry, 0, newAry2, 0, 2); // 원본배열, 원본배열의 어느위치부터, 붙일배열, 붙일배열의 어느위치부터, 몇 개를(>=인덱스갯수)

		System.out.println(newAry2[0]);
		System.out.println(newAry2[1]);
		System.out.println(newAry2[2]);
		System.out.println(newAry2[3]); // 원본인 newAry의 배열갯수는 3개이기 때문에 3, 4는 기본값인 0을 유지하고 있음
		System.out.println(newAry2[4]);
	}

	// ----------------------------------------------------------------------

	public static void morning0226() {

		int[][] scores = new int[2][3]; // 2행의 3열 배열 -> 2 : scores[0], [1] 즉 인덱스 갯수 / 3 : 각 행의 열 갯수
//		int[][] scores = new int[2][]; //2행의 인덱스를 만들고 뒷 괄호를 배우면 각 인덱스별로 배열의 갯수를 다르게 설정할 수 있다
//		int[][] scores = { {90, 88, 87}, {88, 90} }; -> 이런식으로도 쓸 수 있다
		scores[0] = new int[] { 90, 88, 87 };
		scores[1] = new int[] { 88, 90, 92 };

		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			double avg = 0.0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j]; // 각 점수에 대한 합
			}
			if (i == 0) {
				avg = (double) (sum * 10 / scores[i].length) / 10.0; // 소수점 잘라내기... 이런 것도 현직에서는 해야하는 구나... 협업...^^
				System.out.println("영어의 평균: " + avg);
			} else if (i == 1) {
				avg = (double) sum / scores[i].length;
				System.out.println("수학의 평균: " + avg);
			} // 다차원 배열에서 반복하는 법.

			// (int) (sum * 10 / scores[i].length) / 10.0); 으로도 해보세욤. 소수점이 짤린답니다. 왜 그런지
			// 생각해보세용.

			// ----------------------------------------------------------------------

//		
//		int engScores[] = new int[3]; //배열과 값 선언! int 영어성적을 담을 수 있는 배열. engScores = 3개
//		int mathScores[] = new int[3]; //int 수학성적을 담을 수 있는 배열. mathScores = 3개
//		
//		int engSum = 0;
//		int mathSum = 0;
//		double engAvg = 0;
//		double mathAvg = 0;
//		
//		Scanner scanner = new Scanner(System.in); //사용자가 직접 입력할 수 있게 하는 것. import 꼭 합쉬댜!
//		
//		for (int i=0; i<engScores.length; i++) {
//			engScores[i] = scanner.nextInt();
//			for (int j=0; j<engScores.length; j++) {
//				engSum = engScores[j];
//				engAvg = engSum / 3.0;
//			}
//		}
//		
//		for (int i=0; i<mathScores.length; i++) {
//			mathScores[i] = scanner.nextInt();
//			for (int j=0; j<mathScores.length; j++) {
//				mathSum = mathScores[j];
//				mathAvg = mathSum / 3.0;
//			}
//			System.out.println("영어 평균: " + engAvg);
//			System.out.println("수학 평균: " + mathAvg);
//		}
//		

//		
//		
//		
//		
//		
		}

	}

}
