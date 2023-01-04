package Java230104;
// 추상화 클래스를 상위 클래스로 둔 경우, 하위 클래스는 자신도 추상화하거나, 추상화 메소드를 오버라이딩 해야합니다.
public class Cat extends No2 {

	@Override
	void methodName() {
		// TODO Auto-generated method stub
		//추상화된 메소드를 오버라이딩하여 인스턴스화 할 수 있게 합니다.
		//추상화된 메소드가 여러개일 경우 모두 오버라이딩 해주어야 정상적으로 하위 클래스를 사용할 수 있습니다.
		//불필요한 메소드도 강제로 오버라이딩 해야 하는 문제를 해결하기 위해 인터페이스 기능이 등장합니다.
		System.out.println("오버라이딩 전에는 추상 메소드 였지만 지금은 아닙니다.");
	}
	
	public static void main(String[] args) {
		Cat r1 = new Cat();
		r1.methodName();
	}

}
