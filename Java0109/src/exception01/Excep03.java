package exception01;

public class Excep03 {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,7,8,9};
	
	try {
	for (int i = 0; i < arr.length+1; i++) {
		System.out.println(arr[i]);
	}
	} catch (ArrayIndexOutOfBoundsException e){
		System.out.println("배열의 길이를 초과한 번호입니다");
	} 
	try {
		System.out.println(arr[5] / 0);
	}
	catch (ArithmeticException e) {
		System.out.println("0으로 나눌 수 없습니다.");
		
	}
	
	
	System.out.println("프로그램 종료2");
	
	//트렌젝션 : 묶음, 여러 명령을 하나로 묶어서 처리
	//5개의 명령 중
	//4개만 성공 1개는 실패 시 다시 시작을 가능하게 해줌
	/*
	 * 예시.
	 * 상품 발송 메소드
	 * 		try{
	 * 			package();
	 * 			bill();
	 * 			delivery_card();
	 * 			post();
	 * 		}
	 * 		catch(){
	 * 			모두 취소();
	 * 		}
	 * }
	 * 
	 * 포장() throw 예외{
	 * 		포장 명령어
	 * 		}
	 */
	
	
}
}
