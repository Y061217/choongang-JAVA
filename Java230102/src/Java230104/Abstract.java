package Java230104;

public class Abstract {
	/*	추상화란 특정 클래스를 상속 용도로만 사용하기 위해 등장했습니다.
	 *  즉, 인스턴스화(실제화)하지 않는 성질의 클래스입니다.
	 *  
	 *  자바 객체지향프로그래밍을 따르기 때문에 이 추상화라는 개념을 클래스에
	 *  적용시키면 자신의 인스턴스를 발생시킬 수 없는 형태가 됩니다.
	 *
	 * 	결론, 인스턴스화 할 필요는 없지만 상속 개념에서 중요한 위치를 가지게 될 때
	 * 	보통 추상 클래스로 선언하여 사용합니다.
	 *
	 *	추상화 선언 규칙은 다음과 같습니다.
	 *	1. 클래스의 정의된 메소드 중 추상 메소드가 하나라도 있다면
	 *		해당 클래스는 추상 클래스로 선언되어야 합니다.
	 *		반대로 추상 메소드가 없더라도 해당 클래스를 추상화할 수 있습니다.
	 *	2. 추상 메소드는 중괄호가 없는 형태를 취합니다.
	 *		메소드의 중괄호가 없고 abstract라는 키워드가 앞에서 수식됩니다.
	 *		abstract void methodName();
	 *	3. 추상 클래스는 자신의 인스턴스를 만들 수 없습니다.
	 *		하지만 생성자, 메소드, 필드는 모두 선언/정의 할 수 있으며 상속을 통해만 구현됩니다.
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		No1 no1 = new No1();
//		No2 no2 = new No2(); 
		// 추상화 클래스이기 때문에 인스턴스화 할 수 없습니다.
		Normal normal = new Normal();
	}
	
}

//추상 메소드는 없지만 클래스를 추상화 한 경우
abstract class No1{
	void methodName() {
	};
}
//추상 메소드가 있기 때문에 클래스를 추상화 한 경우
abstract class No2{
	abstract void methodName();
	
}

class Normal{
	public Normal() {
		// TODO Auto-generated constructor stub
		System.out.println("일반적인 클래스를 생성했습니다.");
	}
}