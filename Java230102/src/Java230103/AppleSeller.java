package Java230103;
//사과장수
public class AppleSeller {
//필요한 정보는?
	//사과 수
	int appleEa = 100;
	//사과 가격
	final int APPLE_PRICE = 1000; //상수로 선언
	//가지고 있는 돈
	int poketMoney = 0;
	
	//생성자
	
//필요한 메소드는?
	//사과를 판매하는 행동
	public int saleApple(int cost) {
		//cost 받은 돈
		int num = cost / APPLE_PRICE;
		poketMoney += cost;
		appleEa -= num;
		return num;
	}
	//자신의 정보를 말하는 행동
	public void SellerStatus() {
		System.out.println("남은 사과는" + appleEa + "개 입니다.");
		System.out.println("현재까지의 매출은" +poketMoney+ "원 입니다.");
	}
}

