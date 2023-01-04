package Java230104;

public class Human extends Animal{

	public static void main(String[] args) {
		Animal visiter = new Animal("john" , "male");
		Human t1 = new Human();
		t1.setSsn("123456-1");
		
		
		
	}

	private String ssn;
	
	void setSsn(String ssn) {
		// - 기호 빼기
		ssn = ssn.replaceAll("-", "");
		if(ssn.length() > 12) {
			this.ssn=ssn;
			System.out.println(this.ssn);
		} else {
			//모자란 자리수에 * 채워 넣기
			do {
				ssn +="*";
			}while(ssn.length() < 13);
			System.out.print(ssn);
		}
	}
	
}
