package exceptions;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass(); //여기서는 findClass가 존재하지 않는데
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

	public static void findClass() throws ClassNotFoundException { //이 밑에서 예외처리를 해 주면 오류x
		Class clazz = Class.forName("java.lang.String2");
	}
}
