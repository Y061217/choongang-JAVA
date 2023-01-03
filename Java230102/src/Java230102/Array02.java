package Java230102;

import java.io.PrintStream;

public class Array02 {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 8, 13, 17, 20 };
		int def1; //이웃하는 수의 차
		int r = -1; //비어있는 임의의 변수
		int i = 0;
		do {
			def1 = arr[i] - arr[i + 1];
			if (def1 < 0) {
				def1 = -1 * def1;
			}
			if (r == -1) {
				r = def1;
			} else if (r > def1) {
				r = def1;
			}
			i++;
		} while (i < arr.length - 1);
		
		int def2 = 0; //이웃하는 수의 차
		for (int j = 0; j < arr.length - 1; j++) {
			def2 = arr[j] - arr[j + 1];
			if (def2 < 0) {
				def2 = def2 * -1;
			}
			if (r == def2) {
				System.out.printf("%d,%d \n", arr[j], arr[j + 1]);
			}
		}
		
	}
}

//System.out.printf("%d,%d",arr[i] , arr[i + 1]);