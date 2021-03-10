package exceptions;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		
		if(args.length == 2) { //배열을 읽기 전에 배열 길이를 조사하면 오류를 안 만들 수 있음.
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1); //data에 실행 매개값 주지 않아 범위를 벗어났기 때문에 else로 넘어감
		System.out.println("args[1]: " + data2);
		} else {
			System.out.println("[실행 방법]");
			System.out.println("java ArrayIndexOutOfBoundsExceptionExample");
			System.out.println("값1 값2");
		}
			
//		String data1 = args[0];
//		String data2 = args[1];
//		
//		System.out.println("args[0]: " + data1); //data에 실행 매개값을 주지 않아서 오류 발생
//		System.out.println("args[1]: " + data2);
	}
}
