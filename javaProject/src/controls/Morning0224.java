package controls;

public class Morning0224 {
	public static void main(String[] args) {
//		String grade = "가";
		int x = (int) (Math.random() * 100) + 1;
		int y = (int) (Math.random() * 100) + 1;
//		double score = (x + y) / 2.0;
//
//		if (score >= 90) {
//			grade = "수";
//		} else if (score >= 80) {
//			grade = "우";
//		} else if (score >= 70) {
//			grade = "미";
//		} else {
//			grade = "가";
//		}

//		getAverage(x, y);
		String result = getAverage(x,y); //getAverage값을 result 변수로 다시 선언해서 넣어도 되고
		System.out.println("영어: " + x + " 수학: " + y + " 평균: " + result); //아니면 여기 그냥 바로 getAverage(x,y)로 넣어도 됨
//		System.out.println("평균 " + score + "은 " + grade);

	}

	public static String getAverage(int n1, int n2) { //getAverage라는 함수는 main에 내용이 길어지는 것을 방지하기 위해 임의로 우리가 설정한 함수. 
		//그러니까 main에는 변수만 설정하고, getAverage에서 계산식을 쭉 적어서 그 결과값(여기선 grade)을 main으로 리턴(getAverage(x,y))시키는 것!
		//그래서 결과적으로 main에는 영어점수, 수학점수 변수인 x, y만 선언하고 getAverage에서 계산한 후 결과값 grade를 리턴시켜서 출력할 수 있음! wow
		String grade = "";
		double avg = (n1 + n2) / 2.0;

		if (avg >= 90) {
			grade = "수";
		} else if (avg >= 80) {
			grade = "우";
		} else if (avg >= 70) {
			grade = "미";
		} else {
			grade = "가";
		}

		return grade;

	}
}
