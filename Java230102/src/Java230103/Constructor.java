package Java230103;

public class Constructor {
//생성자
	/*
	 * 생성자는 클래스가 인스턴스화 되어질 때 실제 인스턴스를 생성해주는 코드를 말합니다.
	 * 
	 * 생성자는 그 외 아래와 같은 기능도 합니다.
	 * 1. 클래스의 객체 생성
	 * 2. 멤버 필드 초기화
	 * 3. 필요에 따라서 초기화 메소드를 실행
	 * 
	 * 생성자 없이 인스턴스를 만들 수 없습니다.
	 * 
	 * 생성자의 형식
	 * 생성자는 메소드와 유사하게 생겼지만 그 기능이 다르기 때문에 구별할 필요가 있습니다.
	 * 
	 * 1. 생성자의 이름은 반드시 클래스 이름과 같아야 합니다.
	 * 		만약 다를 경우에는 일반 메소드처럼 인식합니다.
	 * 2. 메소드가 아니기 때문에 리턴 타입이 없습니다.
	 * 기본생성자(Default Constructor)
	 * 자바에서는 모든 클래스마다 컴파일 시 기본 생성자를 제공합니다.
	 * 단, 클래스에 생성자가 하나라도 있다면 존재하는 생성자를 따릅니다.
	 *  
	 * 만약 하나 이상의 생성자를 정의하게되면 기본 생성자는 없습니다.
	 * 이를 이용해서 생성된 객체를 기본 객체라고 합니다.
	 * 또한 모든 필드 값은 기본값으로 초기화 됩니다.
	 * 
	 * 
	 */
	
	//사실 생략되어 있었음
	public Constructor() {
		// TODO Auto-generated constructor stub
		// 대문자로 시작
		// 클래스명과 동일
		// 반환 유형이 없음
		// 멤버필드 초기화 및 필요한 메서드 호출 역할
		System.out.println("두둥 등장");
	}	
	
	public static void main(String[] args) {
		// Constructor con = new Constructor();//기본 생성자
		Cl k = new Cl("안녕 만나서 반가워");
		k.age=10;
		
		k.sleep();
				

	}
}

class Cl {
	int age;
	String name;
	
	public Cl(String name) {
		this.name = "잠온데이";
	}
	public void sleep() {
		System.out.println(name);
	}
}
//오버로딩
	/*
	 * 같은 이름의 메소드 또는 생성자를 정의할 때 같은 지를 판별하는 요소로 적용되는 기준을 메소드 혹은 생성자 시그니처라고 합니다.
	 * 
	 * 이 시그니처는 파라미터의 수, 순서, 타입이 모두 같으면 같은 메소드/생성자로 인지합니다.
	 * 호출할 때 이와 호출하는 파라미터를 보고 해당 메소드/생성자를 호출합니다.
	 * 이렇게 같은 이름이지만 파라미터를 다르게 사용하는 기술을 오버로딩이라고 합니다 
	 */

class Calcx {
	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
		
	}
	public void add(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
		
	}
	public void add(double num1, double num2) {
		System.out.println(num1 + num2);
		
	}
}