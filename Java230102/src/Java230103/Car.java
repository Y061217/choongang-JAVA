package Java230103;

public class Car {
	private String model;
	private String color;
	private int speed;
	private int id;
	static int number = 0;
	
	//생성자
	public Car(String model, String color , int speed) {
		this.model=model;
		this.color=color;
		this.speed=speed;
		this.id=++number;
	}

	public static void main(String[] args) {
		Car c1 = new Car("현대", "흰색", 200);
		Car c2 = new Car("기아", "검정", 180);
		Car c3 = new Car("삼성", "은색", 150);
		Car c4 = new Car("쌍용", "곤색", 190);
		
		System.out.println(Car.number);
	}
}


