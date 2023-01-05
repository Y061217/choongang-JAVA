package Quiz;

public class Percussion implements Instrument {
	String material = "나무와 가죽 또는 금속으";
	String action = "악기에 충격을 가해 연주";
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.printf("퍼커션는(은) %s로 만들어져 있으며 %s합니다.",material,action);
	}
	public static void main(String[] args) {
		Percussion pearl = new Percussion();
		pearl.play();
	}
}
