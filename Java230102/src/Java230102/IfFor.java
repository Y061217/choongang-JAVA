package Java230102;

//제어문
	//반복문 for, foreach, while, do~while
	//조건문 if, switch
	public class IfFor {
		public static void main(String[] args) {
			for (int i = 1; i < 6; i++) {
				for (int w = 1; w < 11; w++) {
					System.out.print("★");

				}
				System.out.println();
			}
			int w = 0;
			while (true) {
				System.out.print(w);
				w++;
				if (w == 10) {
					break;
				}
			}
			System.out.println();
			do {
				System.out.println("딱 한번은 실행해준다.");
			} while (false);
			int[] arr = new int[10];
			for (int j : arr) {
				System.out.print(j);
			}

			for (int i = 0; i < arr.length; i++) {

			}
			
			//if
			if (true==true) {
				if (true == true) {

				} else if (false) {
				} else {
				}

			} else if (false || true && false) {

			} else {

			}
			///////////////////////////////////
			//스위치
			System.out.println();
			String swi = "4";
			switch (swi) {
			case "1":
				System.out.println("1일때");
				break; //탈출 명령어
			case "4":
				System.out.println("4일때");
				break;
			case "0":
				System.out.println("0일때");
				break;

			default:
				System.out.println("디폴트");
				break;
			}

		}
	}
