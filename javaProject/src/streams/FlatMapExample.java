package streams;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList("java8 lambda", "stream mapping");
		inputList1.stream()
		.flatMap(data -> Arrays.stream(data.split(" "))) //시키는 대로 재생성해서 stream
		.forEach(word -> System.out.println(word)); //word별로 뽑아내

		System.out.println();

		List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60");
		inputList2.stream()
			.flatMapToInt(data -> {
			String[] strArr = data.split(","); //뽑아내서 재생성
			int[] intArr = new int[strArr.length];
			for (int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		}).forEach(number -> System.out.println(number)); //숫자별로 뽑아내
	}
}
