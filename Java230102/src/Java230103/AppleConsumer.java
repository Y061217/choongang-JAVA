package Java230103;
//사과가 먹고 싶은 사람
public class AppleConsumer {
//필요한 정보는?
	//가진 돈
	int conMoney = 12500;
	//구매한 사과의 갯수
	int buyApple = 0;
	
	
//메소드
	//사과를 사는 행동
	//내 정보를 말하는 행동
	public void tellBuyer() {
		System.out.println("구매한 사과는"+buyApple+"개 입니다.");
		System.out.println("남은 돈은"+conMoney+"원 입니다.");
	}
	
	public void buyApple(AppleSeller seller,int cost) {
		buyApple += seller.saleApple(cost);
		conMoney -= cost;
		
	}
}
