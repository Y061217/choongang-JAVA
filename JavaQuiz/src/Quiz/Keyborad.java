package Quiz;

public abstract class Keyborad implements Instrument {
	String material = "나무와 플라스틱, 그리고 금속 현으";
	String action = "건반을 눌러서 연주";
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.printf("키보드는(은) %s로 만들어져 있으며 %s합니다.",material,action);
	}


}
