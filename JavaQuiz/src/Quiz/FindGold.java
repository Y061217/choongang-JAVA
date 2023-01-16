package Quiz;

import java.util.Arrays;

public class FindGold {
	public static void main(String[] args) {
		int n = (int) (Math.random() * 16) + 1; // n값 무작위
		int p = (int) (Math.pow(2, n)); // 원소 x의 최대값 산출 요소 (거듭제곱) 2^n
		int x = (int) (Math.random() * p - 1); // 원소 x값 무작위
		int arr1[] = new int[n]; // 1번 지도의 십진수 값
		int arr2[] = new int[n]; // 2번 지도의 십진수 값
		String[] arr1_mode = new String[n]; // 1번 지도의 십진수 값을 이진수 변환
		String[] arr2_mode = new String[n]; // 2번 지도의 십진수 값을 이진수 변환
		String[] comp = new String[n]; // 1번 , 2번 지도의 값을 대응하여 빈공간 / 벽 구분

		for (int i = 0; i < n; i++) {
			x = (int) (Math.random() * p - 1);
			arr1[i] = x;
			x = (int) (Math.random() * p - 1);
			arr2[i] = x;
		}

		for (int i = 0; i < n; i++) {
			String t = Integer.toBinaryString(arr1[i]);

			arr1_mode[i] = String.format("%" + n + "s", t); // n개 자릿수를 강제로 형성 후 저장
		}

		for (int i = 0; i < n; i++) {
			String t2 = Integer.toBinaryString(arr2[i]);

			arr2_mode[i] = String.format("%" + n + "s", t2);
		}

		for (int i = 0; i < n; i++) {
			comp[i] = ""; // null 값 없애기
			for (int j = 0; j < n; j++) {
				if (arr1_mode[i].charAt(j) == '1' || arr2_mode[i].charAt(j) == '1') {
					comp[i] += "#";
				} else {
					comp[i] += " ";
				}
			}
		}
		System.out.println("n 값 : " + n);
		System.out.println("1번 지도 :\t" + Arrays.toString(arr1));
		System.out.println("2번 지도 :\t" + Arrays.toString(arr2));
		System.out.println("완성 지도 :\t" + Arrays.toString(comp));

	}

}
