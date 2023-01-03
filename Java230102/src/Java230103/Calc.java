package Java230103;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Calc calc = new Calc();
		//int rsl = calc.add(12, 20);
		int rsl = calc.minus(12, 20);
		System.out.println(rsl);
		String pr = calc.print("맥주");
		System.out.println(pr);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		sc.close();
		int[] arr = calc.makeArray(i1,i2);
//		for (int i : fin) {
//			System.out.print(i);
//		}
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public int add(int num, int num2) {
		int result = num + num2;
		return result;
	}
	
	public int minus(int num, int num2) {
		int result = num - num2;
		return result;
	}
	
	String print(String name) {
		return "입력하신 이름은 " + name +" 입니다.";
	}
	
	public int[] makeArray(int i1, int i2) {
		int[] arr = new int[i2-i1+1];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i1+i;
		}
		return arr;  
	}

	}
