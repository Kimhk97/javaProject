package objects;

public class Cal {
	public static void main(String[] args) {
		// main에서 정의된 값을 실행시키겠다.
		showInfo("홍길동");
		showInfo("김길동");

		Student2 std = new Student2();
		std.setName("최길동"); // set: 값 설정 - get: 가져옴
		std.setEng(90);
		std.setMath(95);
		showInfo(std);
		Student2[] stds = new Student2[3];
		stds[0] = new Student2("임성원", 77, 88);
		stds[1] = new Student2("정준영", 79, 89);
		stds[2] = new Student2("도왕락", 82, 86);
		showInfo(stds);
	}

	public static void showInfo(Student2[] students) {
		for (Student2 std : students) {
			if (std != null)
				showInfo(std);
		}
	}

	public static void showInfo(Student2 student) {
		System.out.println(student.getName() + ", 안녕하세요.");
		System.out.println("영어점수는 " + student.getEng() + ", 수학점수는 " + student.getMath() + ", 점수합계는 "
				+ (student.getEng() + student.getMath()));
	}

	public static void showInfo(String name) { //리턴x
		System.out.println(name + ", 안녕하세요.");
	}
}
