package generics;

public class BoxExample {
	public static void main(String[] args) {
		String str = new String("apple");
		Apple apple = new Apple();
		Orange oragne = new Orange();
		
		Box<String> box = new Box<String>();
		box.setBox(str);
		
		Box<Orange> orangeBox = new Box<Orange>();
		orangeBox.setBox(orange);
		
//		String newStr = (String) box.getBox();
//		Apple newApple = (Apple) box.getBox();
//		Orange newOrange = (Orange) box.getBox();
	}

}
