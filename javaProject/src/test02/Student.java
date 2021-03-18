package test02;

public class Student {
	public static String name = "";
	public static int engScore = 0;
	public static int mathScore = 1;
	

	
	public Student(String name, int engScore, int mathScore) {
		this.name = name;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", engScore=" + engScore + ", mathScore=" + mathScore + "]";
	}
	
}
