package inner;
/*
 * 멤버클래스와 static 클래스는 외부 클래스의 멤버 변수와 같은 위치에 선언됩니다.
 * 또한 멤버 변수와 같은 성질을 가집니다.
 * 
 * 정적 class가 아닌 경우는 멤버 클래스로 간주됩니다.
 * 
 * 인스턴스 변수는 클래스 내에서 선언되지만 메소드 밖에서
 * 
 * 
 * 내부 클래스는 외부 클래스의 멤버를 사용할 수 있지만(상속)
 * 외부 클래스는 내부 클래스의 멤버를 사용할 수 없습니다.
 * 
 * 또한 정적 메소드 내에서는 내부 클래스의 객체 선언은 할 수 없습니다.
 */
public class MemberClass {
	private int OutMember = 11;
	private static int outStatic = 7;
	
	public class MemberInner{
		int innerMember = 111;
		
		public void method() {
			OutMember = 12;
			outStatic = 8;			
			//private int innerMemeber2 = 999;
			System.out.println(OutMember);
			System.out.println(outStatic);
		}
	}
	
	//외부 메소드
	void outMethod() {
		System.out.println(OutMember);
		System.out.println(outStatic);
		//System.out.println(innerMember); 내부 클래스에 있는 인스턴스 변수는 호출 불가
		MemberInner inner = new MemberInner();
		inner.method();
		inner.innerMember=11;
	}
	
	public static void main(String[] args) {
		MemberClass i1 = new MemberClass();
		i1.outMethod();

	}
}
