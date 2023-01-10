package Quiz;

public class Stage {

	public static void main(String[] args) {
		int width, height, door, door_lr;
		width = (int) (Math.random() * 10) + 3; // 벽의 가로 길이
		height = (int) (Math.random() * 10) + 3; // 벽의 세로 길이
		door = 0; // 문의 y위치
		door_lr = 0; // 문의 x위치

		while (door == 0) {// 문의 y위치는 1~벽의 세로 길이-1 를 가질 수 있다.
			door = (int) (Math.random() * (height - 2)) + 1;
		}

		if ((int) (Math.random() * 2) + 1 == 1) { // 문의 x위치는 0 또는 벽의 가로 길이 -1 이다.
			door_lr = 0;
		} else {
			door_lr = width - 1;
		}

//	System.out.println("벽의 가로 길이" + width); //벽의 가로 길이
//	System.out.println("벽의 세로 길이" + height); //벽의 세로 길이
//	System.out.println("문의 y값"+door); //
//	System.out.println("문의 x값"+door_lr); //
//	문의 위치는 [벽의 가로길이-1][무작위]

		// 벽만들기
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (j == 0 && i == 0 || i == height - 1 && j == 0 || i == height - 1 && j == width - 1
						|| i == 0 && j == width - 1) {
					System.out.print("+");
				} else if (j == 0 || j == width - 1) {
					if (i == door && j == door_lr) {// 문 만들기
						System.out.print(" ");
					} else {
						System.out.print("|");
					}
				} else if (i == 0 || i == height - 1) {
					System.out.print("-");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
