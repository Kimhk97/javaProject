package objects;

public class Person {
	String name;
	int age;
	double weight;
	double height;

	Person() { //기본 타입
	}

	Person(String name) { //string 타입
		this.name = name;
	}

	Person(String name, int age, double weight, double height) { //int, double 타입
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	void eat() {
		System.out.println("먹습니다.");
	}

	void sleep() {
		System.out.println("잡니다.");
	}

	void walk() {
		System.out.println("걷습니다.");
	}

	void introduce() {
		System.out.println("이름은 " + name + " 나이는 " + age + " 입니다.");
	}
}
