package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍길동", 10); //collection 추가
		map.put("김민수", 20);
		map.remove("홍길동"); //collection에서 삭제 (key 값, key값-value 값 삭제 선택 가능)

		//
		Integer result = map.get("홍길동");
		System.out.println("Key: 홍길동" + ", val: " + result);
		if (map.containsKey("홍길동")) { // 키값 중에 홍길동이 있으면 value를 가져온다
			System.out.println("key: 홍길동" + ", val: " + result);
		}

		// 반복자
		Set<String> set = map.keySet(); // key값을 set하여 담아냄
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Integer val = map.get(key);
			System.out.println("key: " + key + ", val: " + result);
		}

		// key와 value값을 함께 가져옴 (Map.Entry<String, Integer>
		Set<Entry<String, Integer>> entSet = map.entrySet(); // key와 value를 담아냄
		Iterator<Entry<String, Integer>> entIter = entSet.iterator();
		while (entIter.hasNext()) {
			Entry<String, Integer> ent = entIter.next();
			String key = ent.getKey(); // key를 가져옴
			Integer val = ent.getValue(); // value를 가져옴
			System.out.println("key: " + key + ", val: " + val);
		}
	}
}
