package coll;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set interface
//순서가 없음 , 중복도 없음
public class Set01 {
	
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(10);
		
		System.out.println(
		  set + "\n" 
		+ set.size() + "\n"
		+ set.isEmpty() + "\n"
		+ set.remove(10) + "\n"
		+ set.toArray()
		);
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
		}
		
		//로또 만들어주세요
		//1game
		set.clear();
		
//		for (int i = 0; i < 7; i++) {
//			set.add((int)(Math.random()*45)+1);
//			
//		}
		while (set.size() < 6) {
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);
	}
}
