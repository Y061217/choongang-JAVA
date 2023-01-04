package Java230104;

public class InterZooKeeper {
	public void feed(Predetor pr) {
		System.out.println(pr.getName() + "에게 사료를 줍니다.");
	}
	
	
	public static void main(String[] args) {
		InterCat dd = new InterCat();
		dd.setName("디디");
		
		InterBird jinzu = new InterBird();
		jinzu.setName("진저");
		
		InterZooKeeper me = new InterZooKeeper();
		me.feed(jinzu);
		me.feed(dd);
		
	
		
	}
}
