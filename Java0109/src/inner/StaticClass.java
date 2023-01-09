package inner;
/*
 * 정적 클래스
 * Static의 성질을 갖고 있기 때문에 객체 생성 없이 사용 가능합니다.
 * 클래스의 Static 변수처럼 사용됩니다.
 * 외부 클래스와 내부 클래스는 다르게 작동합니다.
 * 외부 클래스와 내부 클래스의 멤버가 private라도 접근 가능합니다.
 * 경로만 지정되면 단독으로 활용할 수 있습니다.
 */

public class StaticClass {
	private static int outMember = 10;

	public static class Inner {
		public static void innerMethod() {
			System.out.println("정적 클래스입니다.");

		}

		public void innerMethod2() {
			outMember = 1;
			System.out.println(outMember);
		}
	}

	public static void main(String[] args) {
		Inner.innerMethod(); // 객체 생성 없이 작동
		StaticClass.Inner.innerMethod(); // 객체 생성 없이 작동
		Inner id = new Inner();
		id.innerMethod2(); // static이 아니기 때문에 객체 생성해야함
	}

}
