package objects;

public class Student1Exam {
	public static void main(String[] args) {
		Student1 s1 = new Student1("홍길동", 90, 85);
		Student1 s2 = new Student1("김길동", 88, 85);
		Student1 s3 = new Student1("이길동", 76, 90);
		Student1 s4 = new Student1(); //private는 값을 못 읽어옴
		s4.setName("최길동");
		s4.setEng(-20);
		s4.setMath(90);
		System.out.println(s4.getMath()); //이렇게 하면 private된 math 변수 말고 getMath 메소드의 return 값을 불러올 수 있음.

		Student1[] students = new Student1[4];
//		students[0] = new Student1("홍길동", 90, 85); //s1
//		students[1] = new Student1("김길동", 88, 85); //s2
//		students[2] = new Student1("이길동", 76, 90); //s3
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;

		for (Student1 student : students) {
			student.showInfo();
		}
	}
}
