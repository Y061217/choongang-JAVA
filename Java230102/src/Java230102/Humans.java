package Java230102;

public class Humans {
	// 필드 : 변수
	public int age; // 접근 지정자 있음
	String name; // 접근 지정자 없음(기본값:?)
	// 생성자 : 인스턴스를 발생시키는 코드
	// 메소드 : 펑션, 기능, 동작, 동사형
	Animal ani;
	
	public int anyoneOpen; // 서로 다른 패키지여도 사용 가능
	protected int onlyInheritance; // 같은 패키지, 상속 관계에 사용 가능
	private String Own; // 다른 클래스에서 호출할 수 없음
	
	public void show() {
		ani = new Animal();
		// ani.name; 불러올 수 없음
		ani.setName("홍길동");
		System.out.println(ani.getName());
		System.out.println(ani.sleep());
	}
}

//private의 값을 저장,호출할 때 필요한 메소드 getter, setter
class Animal {
	private String name; // 다른 클래스에서 호출할 수 없음
	protected int count;
	public String sleep() {
		return "영영 모르겠쥐";
	}

	public String getName() {
		return name;
	}

	public void setName(String string) {
		this.name = string;

	}
}