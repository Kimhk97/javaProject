package api;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";

		int location = subject.indexOf("프로그래밍");
		System.out.println(location);

		if (subject.indexOf("자바") != -1) { //-1은 특정 문자열이 포함되어 있지 않다는 뜻인데, 포함되지 않은 게 아니면 = 포함되어 있으면
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
	}

}
