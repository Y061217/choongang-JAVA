package Java230102;

public class OOP01 {
	public static void main(String[] args) {
		//인스턴스화 하기
		//데이터타입 변수명 = 10;
		int num = 10; // 기본 타입
		Human human = new Human(); //참조 타입
		Human human2 = new Human();
		Human human3 = human2;
		String str = new String("HI"); //참조 타입
		
		human.name="1호";
		human.age=1;
		human.sleep();
		System.out.println();
		human2.name="2호";
		human2.age=5;
		human2.milk();
		System.out.println();
		human3.name="2호의 일란성 쌍둥이";
		human3.play();
		
		System.out.println();
		Pet navi = new Pet();
		navi.age=1;
		navi.name="나비";
		navi.type="고양이";
		navi.info();
		System.out.println();
		
		Cal cal = new Cal();
		cal.add(2,7);

	}
}

class Human{
	
	int age;//인스턴스 변수, 멤버 필드
	String name;
	
	public void sleep() { //메소드 = 기능, 동사형
		System.out.printf("%s (%d세) \n자는 중이다.\n",name,age);
	}
	
	public void milk() {
		System.out.printf("%s (%d세) \n우유 먹는 중이다.\n",name,age);
		
	}
	
	public void play() {
		System.out.printf("%s (%d세) \n거실에서 뛰어다니고 있다.\n",name,age);
		
	}
	
}

class Pet{
	int age;
	String name;
	String type;
	public void info() {
		System.out.printf("이름 : %s , %d세 , %s",name,age,type);
		
	}
}

class Cal{
	public void add(int a,int b) {
		System.out.println(a+b);
		
	}
}