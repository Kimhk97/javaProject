package controls;

public class IfElseExample {
	public static void main(String[] args) {
		String grade = "F"; // grade 초기화 (그냥 String grade; 해도 상관없음)
		int score = 78;

		if (score >= 90) {
			grade = "A";
			if (score >= 95) //if절 안에 if-else절이 또 와도 상관x
				grade = "A+";
		} else if (score >= 80) { // 조건이 여러 개일 때
			grade = "B";
			if (score >= 85)
				grade = "B+";
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75)
				grade = "C+";
		} else {
			grade = "F";
		}
		System.out.println("점수 " + score + "는 " + grade + " 입니다");
	}

}
