package inner;
/*
 * 지역 클래스
 * 메소드 안에서 클래스를 선언합니다
 * 
 * 메소드 내부에서만 사용할 수 있습니다.
 * 
 * 메소드의 실행이 종료되면 지역 클래스도 메모리에서 소멸합니다.
 * 
 * 외부에서 인스턴스를 생성,호출할 수 없습니다.
 * 또한 static을 사용할 수 없습니다.
 * instance 변수 또는 메소드를 사용할 수 있습니다.
 * 
 * final이 붙은 지역 변수(상수)나 매개변수는 지역 클래스의 메소드에서 접근할 수 있습니다.
 * 지역 클래스는 상속할 수 없습니다.
 * 
 * 객체를 생성해서 사용해야 합니다.
 * 컴파일하면 외부클래스$숫자+지역클래스명.class로 표기됩니다.
 * 
 */
public class LocalClass {
	void method() {
		//class
		class LocalInner{
			void innerMethod() {
				System.out.println("메소드 속에서 작동합니다.");
			}
		}
		LocalInner li = new LocalInner();
		li.innerMethod();
	}
	
	public static void main(String[] args) {
		LocalClass is = new LocalClass();
		is.method();
	}
}
