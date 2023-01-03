package Java230103;

import Java230102.Humans;
import Java230102.OOP01;

public class human {
	//필드 : 변수
	public int age; //접근 지정자 있음
	String name; //접근 지정자 없음(기본값:?)
	//생성자 : 인스턴스를 발생시키는 코드
	//메소드 : 펑션, 기능, 동작, 동사형
	public static void main(String[] args) {
		//다른 패키지에 있는 클래스를 불러서 인스턴스 만들기
		Humans test = new Humans();
		test.show();
	}
	
	
}
