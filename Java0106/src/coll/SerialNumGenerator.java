package coll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//리스트 순서가 있으며 중복을 허용
//set 순서가 있으나 중복을 허용 하지 않음
//map 순서가 없고 중복을 허용 하지 않음

public class SerialNumGenerator {
	
    //48~57 1~9
    //65~90 영어대문자 A ~ Z
    //annna-aaaaa-aaana-nanan-annaa
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		//add(E) : 마지막 배열번호에 저장
		//add(index, E) : 해당 배열번호에 저장
		list.add(150);
		System.out.println(list);
		
		//remove(index); : 해당 배열번호 값 추출
		//clear(); : 
		
		//set(index, E) : 해당 배열번호 값 교체
		
		int count = list.indexOf(150);//E가  있는 index
		System.out.println(count);
		
		//해당 값이 있는 지?
		System.out.println(list.contains(150));
		System.out.println(list.contains(50));
		
		//배열번호에 있는 값을 반환
		Integer value = list.get(0);
		System.out.println(value);
		
		//비어있는지 확인
		System.out.println(list.isEmpty());
		
		//[150,1,2,3,4,5,6,7,8,9,10]
		for (int i = 1; i < 11; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		//iterator
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {// 해당 이터레이션이 다음 요소를 가지고 있으면 true 마지막 요소면 false 반환
			// it.next(); //다음 요소를 반환함
			System.out.println(it.next());
		}
	
		

		//메인
		RdVal rdVal = new RdVal();
		rdVal.WhatPattern("annna-aaaaa-aaana-nanan-annaa",5);//(시리얼 형식 a=문자 n=숫자, 뽑을 횟수)
	}
 		
}

class RdVal{
	
	
	char num() {
		char n = (char)((int) (Math.random() * 10) + 48);
		return n;
	} 

	char alpha() {
		char d = (char)((int) (Math.random() * 26) + 65);
		return d;
		} 
	
	void WhatPattern(String pattern , int n){

		for (int k = 1; k <= n; k++) {
			char[] serial = pattern.toCharArray();
			for (int i = 0; i < serial.length; i++) {
				char s = serial[i];
				if (s == 'a') {
					serial[i] = alpha();
				} else if (s == '-') {
					serial[i] = '-';
				} else {
					serial[i] = num();
				}
			}

			System.out.println(serial);
		}
	}
}
