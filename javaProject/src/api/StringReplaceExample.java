package api;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA"); //.replace -> 찾아바꾸기
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
