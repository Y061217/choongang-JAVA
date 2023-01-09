package inner;
//중첩 클래스 : 클래스 속에 클래스
//두 클래스가 밀접한 관련이 있을 때 서로 묶어주기위함 바늘과 실?
//내부 클래스는 외부에 노출되지 않습니다.(은닉)
//캡슐화,코드 복잡성을 줄여줄 수 있다.
/*
 * 종류
 * 1. static class
 * 		외부 클래스의 멤버 변수 선언 위치에 선언합니다.
 * 		외부 클래스의 static 멤버처럼 사용됩니다.
 *		주로 외부 클래스의 static 멤버에서 사용될 목적으로 만듦
 * 
 * 2. member class
 * 		외부 클래스의 멤버 변수 선언 위치에 선언
 * 		외부 클래스의 인스턴스 멤버처럼 사용합니다.
 * 		주로 외부 클래스의 인스턴스 멤버들과 관련된 작업에 사용
 * 
 * 3. local class
 *		외부 클래스의 메소드나 초기화 블럭 안에서 선언
 *		선언된 영역 내부에서만 사용가능합니다. 		
 * 
 * 4. anonymous class
 * 		클래스 선언과 객체의 생성을 동시에 하는 이름없는 클래스
 * 		일회용입니다.
 */

class AAA{}
class BBB{AAA aaa = new AAA();}
class CCC{class InnerClass{}}

public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}