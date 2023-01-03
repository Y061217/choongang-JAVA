package Java230103;

public class AppleMain {
public static void main(String[] args) {
	AppleSeller seller = new AppleSeller();
	AppleConsumer con = new AppleConsumer();
	
	
	con.buyApple(seller, 3000);
	seller.SellerStatus();
	con.tellBuyer();
	
	
}
}
