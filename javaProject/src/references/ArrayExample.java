package references;

public class ArrayExample {
	public static void main(String[] args) {
//		int score1 = 90;
//		int score2 = 91;
//		int score3 = 92;
//		int score4 = 93;
//		int score5 = 94; 인덱스는 0부터 시작한다는 걸 기억하자! 예를 들어 5개면 인덱스는 0~4.
//		
		int sum = 0;
		double avg = 0;

		int[] scores = new int[5]; // 배열 선언 규칙. scores 묶음에 새로운 정수 5개를 담겠다.는 뜻
		scores[0] = 90; // []안에 값은 인덱스라고 합니다. (값에 붙여준 이름표 같은 거)
		scores[1] = 91;
		scores[2] = 92;
		scores[3] = 93;
		scores[4] = 94; // 이건 위에꺼랑 똑같은 거 같은뎅... 아래걸로 고고
		System.out.println(scores[0]);
		System.out.println(scores[1]);

		scores[0] = 80; // 인덱스 값을 바꿀 수도 있음
		System.out.println("변경 후: " + scores[0]);

		System.out.println("----for----");
		sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(scores[i]); // 인덱스 값을 i처럼 선언하겠다. 첫번째값부터 다섯번째값까지에 0부터 4까지의 인덱스를 붙이겠다.
			sum = sum + scores[i];
		}
		avg = sum / 5.0;

		System.out.println("-----------");

		int[] scores2 = { 90, 91, 92, 93, 94 }; // score2라는 묶음을 선언하고 {}안에 값을 적어줌.
		System.out.println(scores2[3]);
		System.out.println(scores2[4]);

		double[] averages = { 1, 2, 3, 4, 5 }; // 선언방식 익혀둘 것!
		System.out.println(averages.length);
		double d1 = averages[0]; // =1
		averages[3] = 4.5;
		for (int i = 0; i < averages.length; i++) { // .length는 배열의 크기... 즉 갯수. 여기선 5개.
			System.out.println(averages[1]);
		}

		String[] strs = { "Hello", "Good", "Nice", "20" }; // 배열은 동일한 타입의 자료를 담을 수만 있으므로 string에 전부 문자열이어야 함
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]); //strs 묶음의 i값
			
		}
	}
}
