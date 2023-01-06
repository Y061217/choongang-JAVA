package coll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Set02 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("콰이어트플레이스");
		set.add("콰이어트플레이스2");
		set.add("미드소마");
		set.add("콰이어트플레이스2");
		set.add("미드소마");
		set.add("미드소마");
		set.add("유전");
		
		System.out.println(set.size());
		System.out.println(set);
		
		
		//List로 변환하기
		List<String> list = new ArrayList<String>(set);
		Collections.sort(list);
		System.out.println(list +"\n" +list.get(1));
		
		for (String string : list) {
			System.err.println(string);
		}
		
		for (int i = 0; i < list.size(); i++) {
			String string = list.get(i);
			System.out.println(string);
			
		}
	}
	
}
