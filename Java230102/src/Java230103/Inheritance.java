package Java230103;
//상속 : 상위 클래스의 내용을 하위 클래스가 자신의 것처럼 사용하는 것.

//상위 클래스 / 부모 클래스 / 슈퍼 클래스
//하위 클래스 / 자식 클래스, 파생 클래스 /서브 클래스

//연결 : class 자식 클래스 extends 부모 클래스 {}
public class Inheritance {
	public static void main(String[] args) {
		Man one = new Man(27, "one");
		one.info();
		System.out.println();
		Dog joe = new Dog(1, "joe");
		joe.info();
		System.out.println();
		Hound gray = new Hound(2, "gray");
		gray.weight = 12;
		gray.color = "blk";
		gray.info();
		NewMan tw = new NewMan(27, "one", "123456-7891234");
		tw.myinfo();

	}
}

class Animal {
	int age;
	String name;

	public Animal(int age, String name) {
		System.out.println("새로운 개체를 생성합니다.");
		this.age = age;
		this.name = name;
	}

	public void info() {

		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age);
	}
}

class Man extends Animal {
	public Man(int age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("인간");
		super.info(); // 상위 클래스의 메소드 실행

	}
}

class NewMan extends Man {
	String ssn;
	public NewMan(int age, String name, String ssn) {
		super(age, name);
		// TODO Auto-generated constructor stub
		this.ssn=ssn;
	}
	
	public void myinfo() {
		
		System.out.println(ssn.substring(0,6));
	}
}

class Dog extends Animal {
	int weight;
	
	public Dog(int age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
	}
}

class Hound extends Dog {
	String color;

	public Hound(int age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println("체중 :" + weight);
		System.out.println("털색 :" + color);
	}

}
