package api;

public class StringSplitExample {
	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		
		String[] names = text.split("&|,|-"); //구분자로 해서 부분 문자열 추출
		
		for(String name : names) {
			System.out.println(name);
		}
	}

}
