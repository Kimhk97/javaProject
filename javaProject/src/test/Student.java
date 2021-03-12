package test;

public class Student {
	private int stuNum;
	private String name;
	private int age;
	

	public Student(int stuNum, String name, int age) {
		this.stuNum = stuNum;
		this.name = name;
		this.age = age;
	}
	
	public int getStuNum() {
		return stuNum;
	}
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
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
	
	@Override
	public String toString() {
		return "[학번: " + stuNum + ", 이름: " + name + ", 나이: " + age + "]";
	}
}
