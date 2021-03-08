package abstractClasses;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal animal = new Animal(); //Animal은 추상클래스. 추상클래스는 인스턴스 생성 불가능.
		Animal animal = new Bird("조류");
		animal.breathe();
		animal.sound();
		
		animal = new Cat("포유류");
		animal.breathe();
		animal.sound(); //cat클래스에 따로 overriding
		animal.showInfo();
	}

}
