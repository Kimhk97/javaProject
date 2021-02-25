package references;

public class ArrayExample1 {
	public static void main(String[] args) {
		int[] intArys = new int[5]; // 기본값 0을 5개 선언하여 인덱스를 0~4 붙임
		for (int i = 0; i < intArys.length; i++) {
			intArys[i] = (int) (Math.random() * 10) + 1; // 1~10 중에 랜덤으로 5개 뽑아냄
			System.out.println(intArys[0]);
			System.out.println(intArys[1]);
			System.out.println(intArys[2]);
			System.out.println(intArys[3]);
			System.out.println(intArys[4]);
		}
		int maxValue = 0;
		for (int i = 0; i < intArys.length; i++) {
			if (maxValue < intArys[i]) {
				maxValue = intArys[i];
			}
		}
		System.out.println("최대값: " + maxValue); //1~10개 뽑아낸 랜덤 중에 최대값 뽑아냄

	}

}
