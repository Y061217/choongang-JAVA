package inner;
/*
 * 익명 클래스
 * 클래스 명이 없는 클래스
 * 선언과 동시에 인스턴스를 생성하는 클래스
 * 클래스를 인수값으로 사용하는 클래스
 * 객체를 한 번만 사용할 경우 사용합니다.
 * 
 * 클래스의 선언부가 없기 때문에 이름이 없습니다.
 * -> 생성자가 없습니다.
 * 
 * 슈퍼 클래스의 이름이나 구현할 인터페이스를 구현하거나
 * 둘 이상의 인터페이스를 구현할 수 없습니다.
 * 오직 하나의 클래스나 인터페이스만 구현 가능합니다.
 * 
 * 코드블럭에 클래스 선언을 하는 점만 제외하고는
 * 생성자를 호출하는 것과 동일합니다.
 * 
 * 객체를 구성하는 new 예약어 뒤에 클래스의 {}블럭을 첨부하여 바디를 닫는 형식으로 구현됩니다.
 * new 슈퍼클래스 또는 인터페이스명(){};
 * 
 * 객체를 생성한 후에 {};즉, 메소드를 구현하는 블럭이 있고 블럭 끝에 세미콜론으로 마칩니다.
 * 
 * new 뒤에 오는 생성자명이 기존 클래스명이면 익명 클래스가 자동으로 클래스의 하위 클래스가 됩니다.
 * 
 * 인터페이스명일 경우, 인터페이스를 상속하는 부모클래스가 Object로 설정됩니다.
 */

class AM{
	public void method() {
		System.out.println("익명 클래스");
	}
}
public class Anonymous01 {

	public static void main(String[] args) {
		//AM am = new AM(); //일반적인 객체 생성
		AM am = new AM() { //자식클래스이지만 클래스명이 없습니다. 일회성으로만 쓸 수 있습니다.
			@Override
			public void method() {
				System.out.println("익명 클래스는 안드로이드 상에서 자바 이벤트 처리 시에 사용됩니다.");
			};
		};
		am.method();
		
		AM am1 = new AM();
		am1.method();
	}

}
