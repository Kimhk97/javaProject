package controls;

public class Morning0226 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("i의 값: " + i); // 반복문 중첩가능
			for (int j = 0; j < 10; j++) { // i가 한 번 반복되는 동안 j가 10번 반복됨 (i-1당 j-0~9 반복)
				System.out.println("j의 값: " + j + " ");
			}
		}

	}
}
