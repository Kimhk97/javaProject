package exceptions;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2"); //클래스 존재 x
		} catch(ClassNotFoundException e) { //예외 : 만약 클래스가 발견되지 않으면
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

}
