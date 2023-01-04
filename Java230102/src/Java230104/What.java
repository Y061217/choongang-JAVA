package Java230104;

/**
 * 싱클톤 패턴
 * 하나의 클래스로 하나의 인스턴스를 발생시켜봅시다
 * @author user
 *
 */
public class What {
	public static void main(String[] args) {
//		Human h1 = new Human();
//		Human h2 = new Human();
		Human01 h3 = Human01.getInstance();
		
	}
}

class Human01{
	
	private static Human01 human = new Human01();
	
	private Human01() {
		
	}
		
	public static Human01 getInstance() {
		return human;
	}
}