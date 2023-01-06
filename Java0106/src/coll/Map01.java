package coll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map; //dictionary
import java.util.Set;

public class Map01 {

	public static void main(String[] args) {
		//E T K V
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//저장 put(Key , Value)
		map.put("아메리카노", 1400);
		map.put("라떼", 2200);
		map.put("콜드브루", 3400);
		map.put("에스프레소", 1000);
		map.put("아메리카노", 1500);
		
		System.out.println(map);
		//중복되는 키 값을 허용하지 않으며 덮어씌우게 됩니다.
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("한식", "비빔밥");
		map2.put("중식", "볶음밥");
		map2.put("일식", "덮밥");
		map2.put("양식", "Bread");
		System.out.println(map2);
		
		//출력 get(key) // 키가 없으면 null 반환
		System.out.println(map.get("아메리카노"));
		System.out.println(map2.get("한식"));
		
		// 키 값 확인 Boolean 반환
		System.out.println(map2.containsKey("한식")); 
		System.out.println(map.containsValue(1000));
		
		//지우기
		System.out.println(map.remove("콜드브루"));
		System.out.println(map);
		System.out.println(map.size());
		
		//map -> set -> list(순차적으로 뽑기)
		//map -> set (iterator) 출력
		Set<String> maptoset = map.keySet(); //키값만 추출해서 Set 타입으로 저장함
		System.out.println(maptoset);
		List<String> settolist = new ArrayList<String>(map.keySet());
		System.out.println(settolist);
		for (int i = 0; i < settolist.size(); i++) {
			System.out.print("키값 \t");
			System.out.println(settolist.get(i));
			System.out.print("벨류값\t");
			Integer val = map.get(settolist.get(i));			
			System.out.println(val);
		}
		List<String> settolist2 = new ArrayList<String>(map2.keySet());
		for (int i = 0; i < settolist2.size(); i++) {
			System.out.print("키값 \t");
			System.out.println(settolist2.get(i));
			System.out.print("벨류값\t");
			String val = map2.get(settolist2.get(i));			
			System.out.println(val);
			
		}
		
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.print("K :" + key);
			System.out.println("V :" + map.get(key));
			
		}
		
		
	}
}
