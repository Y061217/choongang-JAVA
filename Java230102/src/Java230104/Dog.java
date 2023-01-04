package Java230104;

import java.util.HashSet;
import java.util.Set;

import Java230102.Humans;

public class Dog extends Humans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humans ni = new Humans();
		ni.age = 10;
		ni.anyoneOpen = 4; // public 변수
		Dog adog = new Dog();
		
		Set<Integer> lotto = adog.lotto();
		System.out.println(lotto);
		
		System.out.println(adog.lotto());
	}

	public Set<Integer> lotto(){
		Set<Integer> lotto = new HashSet<Integer>(); //중복 제거
		while (lotto.size() < 6) {
			lotto.add(	(int) (Math.random()*45)+1	);
		}
		return lotto;
	}
}
