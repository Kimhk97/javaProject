package lambdaExpression;

interface MyFunctionalInterface {
	void run(); //구현해야 할 메소드가 하나만 있는 인터페이스.
}

class MyFunctionClass implements MyFunctionalInterface {
	@Override
	public void run() {
		System.out.println("run을 실행합니다.");
	}
}

public class FunctionalExample {
	public static void main(String[] args) {
		MyFunctionalInterface mif = new MyFunctionalInterface() {
			@Override
			public void run() {
				System.out.println("run()를 실행합니다.");
			}
		};
		mif.run();

		mif = () -> { // 간단하게 인터페이스 객체 구현 방법. 람다표현식.
			System.out.println("run() 메소드를 실행합니다.");
		};
		mif.run();
	}
}
