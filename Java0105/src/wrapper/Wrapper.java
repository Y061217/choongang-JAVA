package wrapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//랩퍼클래스
/*
 * 자료구조 데이터가 어떻게 저장되는가?
 * 컬렉션은 참조값(레퍼런스 R타입)만 담을 수 있습니다.
 * 
 * P타입은 저장할 수 없습니다.
 * 그래서 랩퍼클래스로 변환 후 저장합니다.
 * 
 * 기본 자료형의 값을 컬랙션에 저장하기 위해서 사용합니다.
 * 모든 기본 자료형에 대해 그에 애응되는 랩퍼 클래스가 있습니다.
 * 
 * 기본 자료형의 값을 멤버 변수에 저장하고
 * 이 값 주변으로 값을 감싸고 있는 메소드가 있다고해서 랩퍼(Wrapper, 감싸다) 클래스라고 불립니다.
 * 
 * 기본 타입	랩퍼 클래스명
 * boolean	Boolean
 * char		Character
 * byte		Byte
 * short	Short
 * int		Integer
 * long		Long
 * float	Float
 * double 	Double
 * 
 * 프로모션? 
 * 
 */
public class Wrapper {
	public static void main(String[] args) {
		Byte b = new Byte((byte) 127); //원본
		Byte b2= 127; //축약
		
		Integer iNum = 127;//오토박싱 <-> 언박싱
		
		byte bNum = iNum.byteValue(); //캐스팅이 아닙니다.
		Short sNum = iNum.shortValue(); //Integer 클래스 내의 변환 메소드 입니다.
		float fNum = iNum.floatValue(); //
		
		iNum = Integer.MAX_VALUE;
		
		String r1 = Integer.toBinaryString(Byte.MAX_VALUE); //8비트 127
		String r2 = Integer.toBinaryString(Byte.MIN_VALUE); //32비트 -126
		String r3 = Integer.toBinaryString(Byte.MIN_VALUE/Byte.MAX_VALUE); //32비트 -0.99~
		String r4 = Integer.toBinaryString(Byte.MAX_VALUE/Byte.MIN_VALUE); //1비트  -1.007
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(Byte.MAX_VALUE/Byte.MIN_VALUE);
		
		
		System.out.println(Byte.MAX_VALUE / Byte.MIN_VALUE); 

		System.out.println(Byte.MIN_VALUE / Byte.MAX_VALUE);

//		System.out.println(Short.MAX_VALUE);
//		System.out.println(iNum);		
//		System.out.println(Long.MAX_VALUE);
//		System.out.println(Float.MAX_VALUE);
//		System.out.println(Double.MAX_VALUE);
		
		
		//오토박싱
		Integer iNum2 = 127;
		Integer iNum3 = new Integer(127);
		//형변환이 아닙니다. 기본 타입이 참조 타입으로 바뀝니다.
		
		//
		System.out.println(iNum2.equals(127));
		//같으면 true, 다르면 false
		System.out.println(iNum2.compareTo(127));
		//같으면 0 앞 숫자가 크면 1, 뒷 숫자가 크면 -1
		
		
		//오토언박싱
		int number = iNum2;
		System.out.println(number);
		//iNum2가 참조하고 있는 객체 안에 있는 int 값이
		//객체 밖으로 나와 number에 저장됨
		
		Object ob = 10;
		System.out.println(ob);
		
		int re = (int) ob;//ob는 R타입임
		System.out.println(re);
		
		re = (Integer) ob;
		re = ((Integer) ob).intValue();
		
		Set<Integer> lotto = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer,Integer> map;
		
	}
}
