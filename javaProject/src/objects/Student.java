package objects;

public class Student { //class 이름의 첫 글자는 대문자로
	//속성(필드)
	String studentNo; //p21010101 같은 이름
	int grade;
	int math;
	int eng;
	
	//생성자: 필드값을 초기화할 때 사용.
	Student() { //instance?
		System.out.println("생성자를 호출합니다.");
	}
	
	Student(String studentNo) {
		this.studentNo = studentNo; //student() 값 안에 넣은 것이 studentNo 이 됨
	}
	Student(int grade, int eng, int math) { //student () 값 안에 넣은 것이 grade, eng, math가 됨
		this.grade = grade;
		this.eng = eng;
		this.math = math;
	}
	
	//기능(메소드)
	void study() {
		System.out.println("공부합니다.");
	}
	void run() {
		System.out.println("운동합니다.");
	}	
	void introduce() {
		System.out.println("학번: " + studentNo + ", 학년: " + grade + ", 영어점수: " + eng + ", 수학점수: " + math);
	}
}
