package is_a_has_a;

//클래스의 관계
//is a, has a 관계가 있습니다.
/*
 * is a : ~은 ~이다.
 * 
 * has a : ~은 ~을 가지고 있다.
 */
public class Is {
	class Human {
		String name;
		int age;
		int gender;
	}

//이 상속관계에서는 학생이 사람을 상속 받고 있습니다.
//'학생은 사람이다' 라는 관계가 성립하고 이를 is a 관계라고 합니다.
	class Student extends Human {
		int number;
		String major;
	}
	
	

//has a : 거너는 총을 가지고 있습니다.
//경찰 클래스 속에 총 클래스의 객체를 멤버로 가지고 있는 경우
	public static void main(String[] args) {
		System.out.println("시작"); 
		Gunner dante = new Gunner();
		dante.gun.name = "ivory";
		dante.gun.bullet = 12;
//		dante.gun.name = "evony";
//		dante.gun.bullet = 12;
//		System.out.println(dante.gun.name);
	}
}

class Gunner {
	Gun gun;
}

class Gun {
	String name;
	int bullet;
}