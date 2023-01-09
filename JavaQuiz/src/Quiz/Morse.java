package Quiz;

import java.util.Arrays;
import java.util.Scanner;
//모스부호로 변경하기
public class Morse {
	public static void main(String[] args) {
		System.out.println("모스부호로 변경할 문장을 입력하세요");
		System.out.print("입력 : >");
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		char[] toChar = null;
		System.out.println(user);
		user = user.toUpperCase(); //대문자로 바꾸기
		System.out.println(user);
		//user = user.toLowerCase(); //소문자로 바꾸기
		toChar = user.toCharArray();
		System.out.println(Arrays.toString(toChar));
		
		for (char c : toChar) {
			System.out.println(c);
		}
		
		
		sc.close();
		
		
		
		
		
		
	}
}
