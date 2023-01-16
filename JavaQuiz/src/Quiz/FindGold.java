package Quiz;

import java.util.Arrays;

public class FindGold {
	public static void main(String[] args) {
		int n = (int)(Math.random()*16)+1; // n값 무작위
		int p = (int)(Math.pow(2, n)); // 원소 x의 최대값 산출 요소 (거듭제곱) 2^n
		int x = (int)(Math.random() * p-1); // 원소 x값 무작위
		
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		
		int arr1_mode[] = new int[n*n];
		int arr2_mode[] = new int[n*n];
		
		System.out.println(n);
		System.out.println(p);
		System.out.println(x);
		
		for (int i = 0; i < arr1.length; i++) {
			x = (int)(Math.random() * p-1);
			arr1[i]=x;
		}
		for (int i = 0; i < arr2.length; i++) {
			x = (int)(Math.random() * p-1);
			arr2[i]=x;
		}
		System.out.println("Arr1 배열 : "+Arrays.toString(arr1));
		System.out.println("Arr2 배열 : "+Arrays.toString(arr2));
		
		System.out.println("Arr1 배열(2진수) :");
		for (int i : arr1) {
			String t = Integer.toBinaryString(i);
			System.out.printf("%"+n+"s\n",t);
		}
		
		
		System.out.println("Arr2 배열(2진수) :");
		
		for (int i : arr2) {
			String t = Integer.toBinaryString(i);
			System.out.printf("%"+n+"s\n",t);
		}
		
		
	}

}
