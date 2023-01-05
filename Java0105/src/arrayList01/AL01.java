package arrayList01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AL01 {
	public static void main(String[] args) {
		// <> 제네릭 JAVA 1.5 에서 추가됨
		// 내부의 데이터 타입(Element)을 지정
		ArrayList<Integer> list = new ArrayList<Integer>();
		// 배열의 갯수가 자동으로 조정된다.
		// 값 추가 .add();
		
		list.add(150);
		list.add(200);
		list.add(300);
		list.add(90);
		list.add(75);
		System.out.println(list);
		
		//배열의 갯수 조회 size
		System.out.println(list.size());
		
		//하나씩 출력 .get(index)
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (Integer w : list) {
			System.out.println(w);
		}
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 1; i <= 20/2; i++) {
			list2.add(i*2);
		}
		System.out.println(list2);
		
		int a = list2.remove(0);//삭제가 아닌 빼옴
		System.out.println(list2);
		System.out.println(a);
		
		System.out.println(list.size());
		list.clear();
		
		
		for (int i = 1; i <= 20; i++) {
			list.add(i);
			if(i%2==1) {
				list.remove(list.size()-1);
			}
		}
		System.out.println(list);
		
		for (int i = 1; i <= 20; i++) {
			if(i%2==1) {
				list.add(i-1, i);
			}
		}
		System.out.println(list);
		
		//값의 유무 확인
		list.isEmpty();//true or false
		
		//무작위로 섞음
		Collections.shuffle(list);
		System.out.println(list);
		
		//index번호부터 index번호까지 추출
				list.subList(0, 10);
				System.out.println(list.subList(4, 14));
				
		//오름차순으로 정렬
		Collections.sort(list);
		System.out.println(list);
		
		//내림차순으로 정렬
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		//탐색 값 위치 반환
		list.indexOf(30);
		System.out.println(list.indexOf(19));
		System.out.println(list.indexOf(30));
		//없다면 -1 있다면 index번호 반환
		
		
	}
}
