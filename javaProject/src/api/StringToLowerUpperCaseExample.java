package api;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";

		System.out.println(str1.equals(str2)); //str1과 str2는 같은가? 문자열이 달라서 f

		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2)); //toLowerCase한 str1과 str2는? 둘 다 소문자이므로 t

		System.out.println(str1.equalsIgnoreCase(str2)); //모든 조건을 무시한 str1과 str2는? 당연히 t

	}

}
