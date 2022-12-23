package ch01;
//식별자
//데이터형 선언 변수명 선언 = 대입할 문자 or 숫자 ;
public class Print2 {
	public static void main(String[] args) {
		String name = "박보검";
		int age = 29;
		System.out.println("안녕하시렵니까");
		System.out.println("살려주시라요");
		System.out.printf("이름 : %s" , name + "\n" );
		System.out.printf("취미 : %s" ,"침대보 갈기\n");
		System.out.printf("나이 : %d\n" , age);
		System.out.printf("%s : %s" ,"일검" ,"이검\n" );
		System.out.print(0.1+0.2); 
		// 부동 소수형 실수 연산은 처음부터 끝까지 근사값임 메모리에 무한대로 담을 수 없기때문에
		
	}

}
