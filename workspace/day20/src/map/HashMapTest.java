package map;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		
		HashMap<String, Integer>map = new HashMap<>();
		
//		map 데이터 추가
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		
		System.out.println(map);
		System.out.println(map.put("A", 10)); //key값 이용하여 value값 수정
		System.out.println(map);
		
//		key 값으로 value 조회
		System.out.println(map.get("B"));
		
		System.out.println(map.size()); //HashMap의 크기 (길이)
		System.out.println(map.keySet()); //key 값들만 따로 모아줌
		System.out.println(map.values());
		
		
	}
}
