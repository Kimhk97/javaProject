package objects;

public class Student1 {
	private String name;
	private int eng;
	private int math;

	//private Student1 <- private를 사용하면 현재 있는 class 외 다른 class에서는 사용할 수 없음.
	Student1() {
		String name;
		int eng;
		int math;
	}

	Student1(String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
	}

	void showInfo() {
		System.out.println("이름: " + name + " 영어: " + eng + " 수학: " + math + " 합계: " + (eng + math));
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEng(int eng) {
		if (eng < 0) { //잘못된 값이 오지 않도록.
			this.eng = 0;
		} else {
			this.eng = eng;
		}
	}

	public void setMath(int math) {
		this.math = math;
		if (math < 0) { //잘못된 값이 오지 않도록.
			this.math = 0;
		} else {
			this.math = math;
		}
	}
	
	public int getEng() { //private 된 값을 반환하는 또 다른 public 메소드
		return this.eng;
	}
	
	public int getMath() { //private 된 값을 반환하는 또 다른 public 메소드
		return this.math;
	}
}
