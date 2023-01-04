package Java230104;

/*
 * 인터페이스 : 다른 언어에서 찾아보기 힘든 자바의 고급 기능입니다.
 * 
 * 추상 클래스입니다. 추상 클래스의 특징 
 * 1. 추상 클래스는 추상 메소드와 일반 메소드를 가지고 있습니다. 
 * 2. 하지만 인터페이스는 추상메소드로만 구성됩니다. 
 * 3. 인터페이스는 다중 상속이 가능합니다
 *		여러개의 인터페이스 메소드를 하나의 클래스에서 사용할 수 있습니다.
 * 		일반적인 클래스는 1상위 1하위 규칙을 따릅니다.
 * 
 * 인터페이스 속 메소드는 public abstarct 메소드명으로 선언 변수는 static final로 선언 인터페이스 다중 상속이 가능
 * 
 * interface AAA{
 *  static final int NUMBER = 100; 
 *  public abstarct void print(); 
 *  }
 * 
 * class Cat implements AAA{
 *  AAA에 미구현된 내용을 구현  
 * 	@override
 *  public void print(){
 *   구현됨
 *   } 
 *  }
 * 	
 *  인터페이스는 객체로 만들 수 없습니다. 인스턴스화 불가
 *  
 *  상속과 인터페이스의 차이
 *  상속 : class A extends B{}
 *  		B라는 클래스를 상속 받아 사용함
 *  
 *  인터페이스 : class A implements B{}
 *  		B라는 인터페이스의 기능을 사용함
 *    		권한 상속 : 
 *    		인터페이스만 가져오기
 *			비어있는 것을 가져와서 그 속을 커스텀함
 *
 */
public class Inter01 {

}



interface PrtSum{
	public void Prt_hi(); //추상 메소드
	public void Prt_bye();
}

//인터페이스 연결해봅시다.
class Start extends Object implements PrtSum{
	//extends Object 는 생략 가능합니다.
	@Override //인터페이스의 메소드는 모두 추상메소드이기 때문에 반드시 오버라이딩이 필요합니다.
	public void Prt_hi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Prt_bye() {
		// TODO Auto-generated method stub
		
	}
	
	
}