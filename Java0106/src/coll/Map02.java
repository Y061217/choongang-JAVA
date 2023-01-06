package coll;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//import java.util.*; => 아래 코드에서 필요한 기능만 가져옴 전부가 가져오진 않음

//map (p746)
public class Map02 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub


		//id , pw
		Map<String, String> map = new HashMap<String, String>();
		map.put("고강동", "4421");
		map.put("Y", "0000");
		map.put("Admin", "amdin");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("아이디와 비밀번호를 입력하세요");
			System.out.print("아이디 : ");
			String id = sc.nextLine();

			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();

			System.out.println("입력하신 아이디는" + id);
			System.out.println("입력하신 암호는" + pw);

			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다");
					break;
				}
			} else {
				System.err.println("입력하신 아이디는 없는 아이디 입니다.");
				break;
			}

		}
		sc.close();

		System.out.println("탈출성공");
	}

}
