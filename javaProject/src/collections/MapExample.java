package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 15); //put 메소드로 값 삽입
		map.put("김민수", 20);
		map.put("김현경", 25);
		
		Integer result = map.get("홍길동"); //get메소드는 Integer 타입을 리턴
		
		Set<String> set = map.keySet(); //key에 해당되는 값을 set컬렉션에 담겠다
		Iterator<String> iter = set.iterator(); //iterator 반복자... 순번대로 넣어줌
		while(iter.hasNext()) {
			String key = iter.next();
			Integer val = map.get(key);
			System.out.println("key: " + key + ", val: " + val); //set은 무작위. 그래서 순서도 늘 바뀜
		}
			
		
		Map<Integer, String> sMap = new HashMap<>();
		String sResult = sMap.get(10); //이 때 get메소드는 String 타입을 리턴 (어쨌든 Value값에 맞게 리턴해 줌)
	}

}
