package lambdaExpression;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) { //int score를 scores 값에 담아놓고 반복처리. (아마 배열 크기만큼?)
			result = operator.applyAsInt(result, score); // 람다식 실행
		}
		return result;
	}

	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin((a, b) -> {
			if (a >= b)
				return a;
			else
				return b;
		});
		System.out.println("최대값: " + max);

		// 최소값 얻기
		int min = maxOrMin((a, b) -> {
			if (a <= b)
				return a;
			else
				return b;
		});
		System.out.println("최소값: " + min);
	}
}
