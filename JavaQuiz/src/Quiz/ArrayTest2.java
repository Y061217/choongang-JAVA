package Quiz;

public class ArrayTest2 {
public static void main(String[] args) {
	int sum = 0 ;
	int sum2 = 0;
	for (int i = 1; i < 10; i++) {
		sum += i;
		if(i % 2 ==0) {
			sum2 += i;
		}
	}
	System.out.println(sum);
	System.out.println(sum2);
	
	for (int i = 'b'-'a'; i < '!'; i++) {
		System.out.println(i);
	}
	
	
}
}
