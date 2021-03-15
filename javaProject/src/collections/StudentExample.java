package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentExample {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(1, "홍길동"), 90); // 학생번호, 이름, 점수
		map.put(new Student(2, "김민수"), 85);
		map.put(new Student(1, "홍길동"), 92); // 겹치더라도 따로 할당되어서 출력됨. 왜? new 키워드를 사용했으니까.
		//하지만 hashCode와 boolean을 이용해서 중복값을 제거!

		Set<Student> set = map.keySet();
		Iterator<Student> iter = set.iterator(); // 반복된 요소들을 뽑아내는 반복자
		while (iter.hasNext()) { //hasNext -> 값이 있는지 없는지를 판단 
			Student student = iter.next(); // 반복자가 가지고 있는 key의 타입 선언
			System.out.println(student);
		}
	}
}
