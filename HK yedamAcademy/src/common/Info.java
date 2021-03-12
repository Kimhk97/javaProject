package common;

public class Info { // 게시판 정보
	private int studentNum;
	private String name;
	private int age;
	private String phoneNum;
	private int score;

	public Info() {
	};

	public Info(int studentNum, String name, int age, String phoneNum, int score) {
		this.studentNum = studentNum;
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum;
		this.score = score;
	}
	
	public Info(int studentNum, int score) {
		this.studentNum = studentNum;
		this.score = score;
	}


	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "학생정보 [학번: " + studentNum + ", 이름: " + name + ", 나이: " + age + ", 연락처: " + phoneNum + ", 점수: " + score
				+ "]";
	}
	
	public String toString1() {
		return "[학번: " + studentNum + ", 이름: " + name + ", 점수: " + score + "]";
	}
	
	public String toString2() {
		return "[학번: " + studentNum + ", 이름: " + name + "]";
	}
}
