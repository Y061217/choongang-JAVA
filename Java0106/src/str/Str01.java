package str;

import java.util.Arrays;
import java.util.List;

public class Str01 {
	public static void main(String[] args) {
		String str = "100";
		String str2 = new String("100");
		
		char ch = 'A';
		str += ch + 150;
		
		System.out.println(str);
		
		int num = 100 + 150;
		str2 = "A" + 127;
		System.out.println(str2);
		
		str2 = 1 + 2 + 3 + "A";
		System.out.println(str2);
		
		str2 = "2" + 1 + 2 + 3 + "A";
		System.out.println(str2);
		
		str2 = "2" + (1 + 2 + 3) + "A";
		System.out.println(str2);
		
		str2 = "안녕";
		char[] hi = str2.toCharArray();
		str2.toString();
		System.out.println(Arrays.toString(hi));
		
		List<String> hiList = Arrays.asList(str2);
		System.out.println(hiList);
		
//		String str21 = new String(hi , 1, 2);
//		System.out.println(str21);
//		
//		str21 = "fjwjkfdsjviojkfjkdslfjlkdsjvsdjfksdf";
//		System.out.println("j가 몇 개");
		
		String str3 = new String("Hi5");
		System.out.println(Character.isAlphabetic('H')); //알파벳인지 확인
		System.out.println(Character.isAlphabetic(str3.charAt(0)));
		int i = 0; 
		System.out.println(Character.isAlphabetic(str3.charAt(i)));
		System.out.println(Character.isDigit('H')); //숫자인지 확인
		System.out.println(Character.isUpperCase('H')); //대문자인지 확인
		System.out.println(Character.isLowerCase('i')); //소문자인지 확인
				
		str3 = str3.concat("입니다."); //concat : 이어 붙이기
		System.out.println(str3);
		
		System.out.println(str3.endsWith("니다.")); //해당 문자열로 끝나는지 확인
		
		String email = "email@domain.com";
		System.out.println(email.endsWith(".com"));
		
		String str01 = new String("hi");
		str2 = new String("hi");
		System.out.println(str01 == str2);
		System.out.println(str01.equals(str2));
		//불변성, immortal 한번 값을 만들어 놓으면 수정 불가
		//값을 비교 하고 싶을 때는 equals
		
		StringBuffer sb = new StringBuffer(str01);
		sb.append("추가합니다");
		sb.toString();
		System.out.println(sb);
		
		String str4 = email.substring(0,7);
		System.out.println(str4);
		String ser = email.substring(email.indexOf("@")+1,email.length());
		String ser2 = email.substring(0,email.indexOf("@"));
		System.out.println("도메인 : " + ser);
		System.out.println("아이디 : "+ ser2);
		
	}
}
