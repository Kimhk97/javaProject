package lambdaExpression;

interface MyFuncInterface {
	int run(int a, int b);
}

public class FunctionalExample3 {
	public static void main(String[] args) {
		MyFuncInterface mfi = (a, b) -> a + b; //람다표현식으로 간단하게 표현
		
		int result = mfi.run(10, 20);
		System.out.println("실행결과는 " + result);
		
		mfi = (num1, num2) -> num1 * num2; //선언방식에 따라 기능을 다르게 구현. int a, b만 고정
		result = mfi.run(10, 20);
		System.out.println("실행결과는 " + result);
		
		mfi = (aa, bb) -> {
			return (aa * bb) / 2;			
		};
		result = mfi.run(10, 20);
		System.out.println("실행결과는 " + result);
	}
}
