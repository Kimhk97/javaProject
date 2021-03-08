package abstractClasses;

public abstract class Animal {
	String species;

	public Animal() { // 기본생성자

	}

	public Animal(String species) {
		this.species = species;
	}

	public void showInfo() {
		System.out.println("종류는 " + this.species);
	}

	public void breathe() {
		System.out.println("숨을 쉰다.");
	}

	public abstract void sound(); // 추상메소드.

}
