package objects2.annotations;

public class Service {
	@PrintAnnotation() // field 선언 가능
	String name;

	@PrintAnnotation(value = "#") // method 선언 가능
	public void method1() {
		System.out.println("실행내용1");

	}

	@PrintAnnotation(value = "*", number = 20)
	public void method2() {
		System.out.println("실행내용2");

	}
	
	@PrintAnnotation()
	public void method3( ) {
		System.out.println("실행내용3");
		
	}
}
