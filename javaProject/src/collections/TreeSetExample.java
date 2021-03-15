package collections;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample { // 비교하여 작은 값부터 출력
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		Integer score = null;

		score = scores.first();
		System.out.println("가장 낮은 점수: " + score);

		score = scores.last();
		System.out.println("가장 높은 점수: " + score + "\n"); //"\n"은 한 줄 띄우기

		score = scores.lower(new Integer(95));
		System.out.println("95점 아래 점수: " + score);

		score = scores.higher(new Integer(95));
		System.out.println("95점 위의 점수: " + score + "\n");

		score = scores.floor(new Integer(95));
		System.out.println("95점이거나 바로 아래 점수: " + score);

		score = scores.ceiling(new Integer(85));
		System.out.println("85점이거나 바로 위의 점수: " + score + "\n");

		while (!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
		}

		Iterator<Integer> iter = scores.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		scores.descendingIterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		NavigableSet<Integer> nset = scores.descendingSet();
		for (Integer i : nset) {
			System.out.println(i);
		}
	}
}
