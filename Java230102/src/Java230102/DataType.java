package Java230102;

import java.util.Iterator;

public class DataType {
	public static void main(String[] args) {
		//p타입 데이터 소문자로 작성합니다.
		/*
		 * 정수 타입
		 * 	byte
		 * 	short
		 *  int
		 *  long
		 * 
		 * 실수 타입
		 * 	float
		 * 	double
		 * 
		 * 문자 타입
		 * 	char
		 * 논리 타입
		 * 	boolean
		 */
		byte bNum = 127; //초기화 = 리터럴
		bNum = (byte)200;
		System.out.println(bNum);
		short sNum = bNum;
		System.out.println(sNum);
		bNum = (byte) sNum;
		System.out.println(sNum);
		sNum = (short)32768;
		System.out.println(sNum);
		int iNum = sNum + bNum +125652;
		System.out.println(iNum);
		//자바에서 사용하는 모든 숫자는 int를 기본으로 사용합니다.
		long lNum = 922337203608575806L; //표식자 'L' , 'F' , 'D'
		System.out.println(lNum);
		
		iNum = (int)lNum;
		sNum = (short)iNum;
		bNum = (byte)sNum;
		System.out.println(iNum);
		System.out.println(sNum);
		System.out.println(bNum);
		
		//실수
		float fNum = 3.14F; //실수 기본타입은 double
		double dNum = fNum;
		System.out.println(fNum);
		System.out.println(dNum);
		fNum = (float) dNum;
		System.out.println(fNum);
		iNum = (int) fNum;
		System.out.println(iNum);
		dNum = (double)iNum;
		System.out.println(dNum);
		// byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
		
		char ch = '가';
		System.out.println(ch);
		ch = 'A';
		System.out.println(ch);
		ch = '@';
		System.out.println(ch);
		ch = '火';
		System.out.println(ch);
		ch = 64;
		for (int i = 65; i < 91; i++) {
			System.out.print((char)i);
			
		}
		System.out.println();
		int iNum02 = 0xc; //16진법
		System.out.println(iNum02);
		iNum02 = 014; //8진법
		System.out.println(iNum02);
		iNum02 = 0b1100; //2진법 0, 1, 10, 11, 100, 101, 110, 111
		System.out.println(iNum02);
		iNum02 = 12; // 10진법
		System.out.println(iNum02);
		
		System.out.println(Integer.toBinaryString(12));
		System.out.println(Integer.toOctalString(12));
		System.out.println(Integer.toHexString(12));
		
		//블리언 = 참, 거짓
		boolean bool = false;
		bool = true;
		System.out.println(bool == !!true);
	}
}
