package Java230102;

public class Java01 {//Java01 클래스 
	public static void main(String[] args) {//main 메소드
		System.out.println("Hi");//명령문
		//호출
		//클래스명 객체명 = new 클래스의 생성자 메소드();
		//객체명.메소드(); or 객체명.변수명
		Apple app = new Apple();
		app.info();
		
		//호출 = 같은 클래스 내의 메소드 호출
		//메소드명();
		print(1,"배고파");
		
	}
	public static void print(int num, String name) {//print method(파라미터(매개변수)) 메소드끼리는 서로 중첩될 수 없습니다.
		System.out.println("첫번째 파라미터는 int 타입으로 값은 " + num +" 입니다.");
		System.out.println("두번째 파라미터는 String 타입으로 값은 " + name +" 입니다.");

	}
}

//클래스 : 대문자로 시작
//			AppleKorea 첫머리의 글자를 대문자로 표기합니다. = 파스칼 표기법
//메소드 : 소문자로 시작 메소드()
//		appleKorea 소문자로 시작하지만 뒤에 오는 단어는 대문자로 표기합니다. = 카멜 표기법
//변 수 : 소문자로 시작 뒤에 오는 단어 첫글자 대문자로 표기합니다. = 카멜 표기법
//		 클래스 밖에 선언하면 에러가 발생합니다.
//상 수 : 모두 대문자, _붙여서 연결합니다. =APPLE_KOREA = 스네이크 표기법

class Apple{
	//인스턴스 변수
	//클래스 변수
	//class berry{} 클래스끼리 중첩할 수 있지만, 현재는 권장하지는 않습니다. 단독으로 사용해주세요.
	Apple() {//클래스 , 메소드 , 변수 , 명령문을 작성할 때 가독성을 위해 들여쓰기를 잘 지켜주세요. 
			 //정렬 단축어(ctrl + shift + f)를 적극 활용하세요.
	
	}
	public static void info(){
		//지역 변수 = 메소드 속에서 생성된 변수는 해당 메소드 밖에서 쓸 수 없습니다. 또한 값을 대입(초기화)하여야만 사용할 수 있습니다.
		//지역 변수는 인스턴스 변수, 클래스 변수와 색이 다릅니다.
		int ap; //선언만 할 경우 에러가 발생합니다.
		ap = 12; //초기화 라고 지칭합니다.
		int alpha = 100; // 명령문, 선언문가 끝날 때는 ';' 를 작성합니다.
		int APPLE_KOREA = 7; // 선언 + 초기화를 동시에 할 수 있습니다. 
		System.out.println("중요한 건 꺾이지 않는 마음..!");
		System.out.println(alpha);
		
		int ap01 = ap; // = 대입하다 <---- 값의 흐름
		System.out.println(ap01);
		
	}
}