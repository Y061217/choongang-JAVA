package DataBaseActivate;
/*
 * 가비지 컬랙션 Garbage Collection
 * 더 이상 사용하지 않는 변수나 객체를 제거하여 메모리 효율성을 개선합니다.
 * 
 * 특징
 * 1. 자동 메모리 관리
 * 2. 가비지 컬랙션은 사용자가 임의로 호출할 수 없다.
 * 3. 가비지 컬랙션은 객체입니다.
 * 4. 가비지 컬랙션의 대상은 살아있는 스레드가 더 이상 참조하지 안흔 객체입니다.
 * 5. 다른 참조 변수가 참조하고 있는 객체는 가비지 컬랙션의 대상이 될 수 없습니다.
 * 6. 객체에 할당된 메모리를 명시적으로 해제할 수 없다.
 * 7. 가비지 컬랙터가 객체를 어떠한 순서로 정리하는 지 알 수 없다.
 * 8. 가비지 컬랙터가 수행 되는 시점을 알 수 없다.
 * 9. 가비지 컬랙션은 JVM이 결정한다.
 * 
 * 
 * 가비지 컬랙션이 작동하는 조건
 * 1. 참조변수에 null이 저장될 경우
 * 		참조변수에 null이 저장,할당하는 경우 이 변수는 가비지 컬랙션에 의해 수거됩니다.
 * 2. 참조 변수에 다른 객체의 참조값을 할당하기
 * 		기존의 참조 변수에 있던 참조값으로는 기존의 객체에 접근할 수 없으므로 수거됩니다.
 * 
 * 요청하기
 * 
 */
public class GC {
	public static void main(String[] args) {
		String str = new String("HI");
		str = null;
		
		str = new String("HI");
		String str2 = new String("HI");
		
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
		
		str = str2;
		System.out.println(str==str2);//같은 데이터를 참조하기 때문에 true 반환
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str.contains(str2));
	}
}
