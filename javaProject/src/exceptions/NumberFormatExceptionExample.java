package exceptions;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		//Integer : 포장클래스. 이걸 이용하면 문자열string이 숫자int로 바뀌어 출력됨
		int value1 = Integer.parseInt(data1); //100은 숫자 100으로 바뀔 수 있음
		int value2 = Integer.parseInt(data2); //하지만 a100은 문자열이 포함되어 있어 오류가 발생함
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
	}

}
