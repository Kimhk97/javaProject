package objects;

public class ObjectExample {
	public static void main(String[] args) {
		Student student = new Student(); //Student 타입에 student 변수를 삽입하여 new라는 키워드로 Student() 객체를 만듦. 기본 클래스 소환
		student.studentNo = "s12345";
		student.grade = 2;
		student.eng = 80;
		student.math = 85;
		student.study();
		student.run();
		student.introduce();
		
		Student student1 = new Student("s23456"); //()안은 매개값. 이건 문자열이라 String 소환
//		student1.studentNo = "s23456";
		student1.grade = 3;
		student1.eng = 76;
		student1.math = 88;
		student1.study();
		student1.run();
		student1.introduce();
		
		Student student2 = new Student(4, 70, 80); //정수 세 개가 매개값으로 있으므로 int 값 소환
		student2.studentNo = "s23459";
		student2.study();
		student2.run();
		student2.introduce();
	}

}
