package arrayList01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AL02 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		//list.add(11.1);
		//list.add("미연");
		//list.add(new Scanner(System.in));
		System.out.println(list);
		
		//위와 같은 오용을 막기 위해 <>(제네릭)을 이용하여 값을 제한함
		//List list = new ArrayList(); -> List<Integer> list = new ArrayList<Integer>();
		
		
		//리스트를 새로 만들어주세요.
		//랜덤에서 숫자가 나오면
		//크기 순서대로 저장하는 메소드를 만들어주세요.
		//랜덤은 6번만 실행해주세요.
		
		list.clear();
		
		
		
		
		List<Integer> list2 = new ArrayList<Integer>();//배열 생성
		int q = 6; //6개의 랜덤한 수 생성하기
		while (list2.size() < q) {
			int n = (int) (Math.random() * 45) + 1;
			if (list2.indexOf(n) == -1) {//중복이 아닐 경우
				list2.add(n);//값 넣기
			}
		}
		//6개의 랜덤한 수 생성완료
		//6개의 배열의 값들을 정렬하기
		for (int i = 0; i < list2.size(); i++) {
			for (int j = i + 1; j < list2.size(); j++) {
				if (list2.get(i) > list2.get(j)) { //첫번째 배열의 값과 나머지 배열 값을 차례로 비교
					int c = list2.remove(j); //첫번째 배열값이 크다면 작은 값을 빈 변수에 저장
					list2.add(i, c); // 위치를 서로 바꿈
				}
			}
		}
		//6개의 배열의 값들을 정렬 완료
		System.out.println(list2);
		
		
		
	      List<Integer> lotto = new ArrayList<Integer>();
	      lotto.add((int)(Math.random()*45)+1);
	      do {
	         int n = (int)(Math.random()*45)+1;
	         int cnt=1;
	         if(lotto.indexOf(n)== -1) {
	            lotto.add(n);
	            for(int i=cnt; i<lotto.size();i++) {
	               if(lotto.get(cnt-1)>lotto.get(cnt)) {
	                  lotto.remove(cnt-1);
	               }
	               else {
	                  cnt++;
	               }
	            }
	         }
	      }while(lotto.size()<6);
	      System.out.println(lotto);
				
	      
	      //48~57 1~9
	      //65~90 영어대문자 A ~ Z
	      //annna-aaaaa-aaana-nanan-annaa
	      List<Integer> sr = new ArrayList<Integer>();
	      int num = 5*5; //20개의 랜덤한 수 생성하기
			while (list2.size() < num) {
				int n = (int) (Math.random() * 45) + 1;
				if (list2.indexOf(n) == -1) {//중복이 아닐 경우
					list2.add(n);//값 넣기
				}
			}
	}
}
