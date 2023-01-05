package enum01;
//Enum : 열거 데이터 타입
/*
 * 열거한 데이터만 쓸 수 있습니다. 사용자의 입력 범위를 제한할 수 있습니다.
 * 중복 값은 가질 수 없습니다.
 * enum은 클래스명하고 중복할 수 없습니다. 
 */

enum Week{
	MON,TUE,WED,THU,FRI,SET,SUN;
}
public class Enum01 {
	public static void main(String[] args) {
		Week week = Week.FRI; 
		System.out.println(week);
		
		var number = 10;
		//값으로 데이터타입을 추론합니다. 지역변수로만 가능
		//꼭 초기화 후 사용, null 초기화 안됨, 배열은 사용 불가
		System.out.println(number);
		
		var name = "ㅇㅇ";
		String str = name;
	}

}
