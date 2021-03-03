package objects2;

import objects.Student; //objects 패키지의 Student 클래스를 import

public class MethodExample {
	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) { //args는 arguments (매개값을 넣는만큼 커짐)
			System.out.println("매개값[" + i + "]: " + args[i]);
		}

		Calculator cal = new Calculator();
		double result = cal.getArea(3.5);

		MethodExample me = new MethodExample(); // MethodExample 클래스의 me 인스턴스에 담아서
		me.sum(10, 20); // me에 sum을 담아서 하겠다

		MethodExample.sum2(10, 20);

		Calculator.getRect(4.5, 2); // Calculator의(.) getRect 함수에 바로 변수를 넣고 사용할 수 있다. (Static 필수)

		Book b1 = new Book("", "", "", 100);
		Student s1 = new Student(); // public이어야 함 + 그리고 꼭 저장해!!
		s1.run();
		s1.study();
	}

	public int sum(int a, int b) {
		return a + b;
	}

	public static int sum2(int a, int b) {
		return a + b;
	}

}
