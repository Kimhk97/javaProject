package collections.exercise;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			int score = map.get(key);
			totalScore += score;
			if (maxScore < score) {
				maxScore = map.get(key);
				name = key;
			}
		}

		System.out.println("평균점수: " + totalScore / map.size());
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);

		// -------------또 다른 내용... 아 진짜 짜증나죽겠네

		String str;
		System.out.println("b".compareTo("a")); // b와 a를 비교해서 같으면 0. 다르면 -1 or 1
		TreeSet<String> tSet = new TreeSet<>();
		tSet.add("a");
		tSet.add("b");
		tSet.add("c");
		tSet.first();
		tSet.last();
	}
}
