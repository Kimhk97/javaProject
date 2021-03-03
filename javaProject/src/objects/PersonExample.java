package objects;

public class PersonExample {

//	Person(String name, int age, double height, double weight) {
//			this.name = name;
//			this.age = age;
//			this.weight = weight;
//			this.height = height;
//			}
//
//	void introduce() {
//		System.out.println("이름은 " + this.name + " 나이는 " + this.age + " 입니다.");
//	}


	public static void main(String[] args) {

//		문자열:이름, 정수:나이 int[], String[]
//		Person[] : String, int 타입으로 배열을 만들 수 있음
		new Person();
		Person[] persons = new Person[5];
		persons[0] = new Person("홍길동", 15, 175.5, 72.5);
		persons[1] = new Person("김길동", 25, 180.5, 82.5);
		persons[2] = new Person("이길동", 35, 172.5, 62.5);
		persons[3] = new Person("박길동", 45, 173.5, 70.5);
		persons[4] = new Person("최길동", 55, 174.5, 73.5);
		for (Person person : persons) {
			if (person.age > 20 && person.height > 180.0) {
				person.introduce();
			}
		}
	}
}

//		Person person1 = new Person();
//		person1.name = "홍길동";
//		person1.age = 30;
//		person1.weight = 70;
//		person1.height = 180;
//		person1.introduce(); //introduce 메소드에 맞게 return하여 값을 출력. 기능(메소드)을 불러와 값을 대입해 출력하는 것!
//		
//		Person person2 = new Person("김길동");
////		person2.age = 
////		person2.weight =
////		person2.height =
////		person2.introduce();
//		
