package Quiz;

public class Guitar implements Instrument {
	String material = "나무";
	String action = "현을 이용";
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.printf("기타는 %s로 만들어져 있으며 %s합니다.",material,action);
	}
	public static void main(String[] args) {
		Guitar fender = new Guitar();
		fender.play();
		
	}
	}


