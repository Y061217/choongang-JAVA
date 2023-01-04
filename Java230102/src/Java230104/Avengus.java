package Java230104;

public class Avengus {
	public static void main(String[] args) {
		IronMan ironMan = new IronMan();
		Hulk hulk = new Hulk();
		Thor thor = new Thor();
		
		ironMan.attack();
		hulk.attack();
		thor.attack();
		
		//한꺼번에 실행
		Hero[] team1 = new Hero[3];
		team1[0] = ironMan;
		team1[1] = hulk;
		team1[2] = thor;
		
		for (Hero hero : team1) {
			
			hero.defence();
		}
		
		
		
		team1[0].defence(); // 상위 클래스인 hero에 있는 메소드
		//team1[0].callJavis(); // 상위 클래스인 hero에 없는 메소드이기 때문에 실행 불가
		ironMan.callJavis(); // 
		((IronMan)team1[0]).callJavis(); //숫자를 자르는 캐스팅과 비슷하지만 메모리에서 휘발되는 게 아니라 숨겨진다.
		
		/*
		 * 다형성
		 * 다형성은 동적 바인딩을 지원해야 합니다.
		 * 
		 * 런타임 때 최종 타입이 결정되는 것
		 * 
		 * 다형성의 한계 : 상위 클래스에 만들어진 메소드에 한해 가능
		 */
	}
}
