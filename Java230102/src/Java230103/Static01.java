package Java230103;

public class Static01 {
	//static : 공유 변수
	/*
	 * static은 정적이라는 의미가 있습니다.
	 * 자바에서는 동적과 정적이라는 개념으로 구분합니다.
	 * 정적은 클래스가 로드되는 시점을 이야기하고
	 * 동적은 로드된 클래스가 실행된 이후를 이야기합니다.
	 * 이 중 객체는 동적 데이터라고 해서 프로그램이 실행된 이후에 발생되는 대표적인 형태입니다.
	 * 
	 * 정적 멤버 : 인스턴스를 만들지 않고 사용할 수 있는 멤버
	 *			모든 객체를 통틀어서 하나만 생성되고 모든 객체가 그것을 공유합니다.
	 *			클래스명,멤버명으로 호출합니다.
	 *			클래스에 의지합니다.
	 *
	 * 인스턴스 멤버 : 인스턴스 생성 시 동시에 갖게 되는 자신의 변수 
	 * 			별도의 메모리 공간을 가지고 객체마다 각각 다른 값을 가짐
	 * 			인스턴스명.멤버명으로 호출합니다.
	 * 
	 */
	public static String print(String t) {
		return "입력한 값은 : "+t+"입니다.0";
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static 으로 선언했기 때문에 인스턴스 생성 없이 사용 가능
		System.out.println(print("메롱"));
		Calc2.add(1, 10);
		System.out.println(Calc2.num);

		
		//static으로 선언하지 않았기 때문에 별도로 인스턴스를 생성 해야함.
		Printing pr = new Printing();
		pr.print("배고파");
		
		//인스턴스를 생성하지 않을 시 오류가 발생
		//Printing.print1("뭐 먹지");
		Printing.print2("뭐 먹지");
		
		
		/*
		 * 주의사항
		 * 객체가 생성되지 않은 상태에서 호출되는 메소드입니다.
		 * 객체 안에서만 존재하는 인스턴스 변수들을 사용할 수 없습니다.
		 * 정적 변수와 지역 변수만 가능합니다.
		 * 
		 * 정적 메소드에서 인스턴스 메소드를 호출하면 에러가 납니다.
		 * 인스턴스 메소드도 객체가 생성되어야만 사용할 수 있기 때문입니다.
		 * 
		 * 정적 메소드에서 정적 메소드를 호출하는 것은 가능합니다.
		 * 정적 메소드는 this 키워드를 사용할 수 없습니다.
		 * 			:this 는 인스턴스 전용입니다.
		 * 
		 * final이 접한 상수는 수정 불가한 값이기 때문에 정적 필드로 선언하면 좋습니다.
		 */
	}
	
}

class Printing {
	public void print(String r) {
		System.out.println("입력한 값은 : "+r+"입니다.1");
	}
	
	public static void print2(String r) {
		System.out.println("입력한 값은 : "+r+"입니다.2");
	}
}

class Calc2 {
	public int number;
	public static int num;
	
	public static void add(int num1 , int num2) {
		System.out.println(num1+num2);;
		num = num1+num2;
	}
	
	public void div(int num1, int num2) {
		System.out.println(num1 / num2);
		number = num1 / num2;
		
	}
	
	
}