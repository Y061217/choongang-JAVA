import java.util.Scanner;
//Scanner 대신 system.in.read()를 쓸수 있지만 이 경우 Enter의 유니코드까지 함께 저장되기 때문에 따로 처리 주어야 한다.
public class UpDown {
	public static void main(String[] args) {
		int a = 65;
		System.out.println((char) a);
		int s = (int) (Math.random() * 100) + 1;
		/*
		 * Random r = new Random(); 
		 * int user = r.netxInt(10); 
		 * 결과 값 0~9 사이값 출력
		 */
		
		System.out.println(s);
		int chance = 9;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("숫자를 입력하세요");

			int user = sc.nextInt();
			
			if (user > s) {
				System.out.println("다운");
			} else if (user < s) {
				System.out.println("업");
			} else if (user == s) {
				System.out.println("정답입니다. 정답은 : " + s);
				sc.close();
				break;
			}

			System.out.println("남은 기회 : " + chance);
			if (chance == 0) {
				System.out.println("남은 기회가 없습니다.");
			}
			chance--;

		} while (chance >= 0);

	}
}
