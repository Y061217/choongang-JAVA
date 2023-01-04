package Quiz;

import java.util.Scanner;

public class Askii {
    public static void main(String[] args) {
        System.out.println("조회할 문자를 입력하세요");
        Scanner sc = new Scanner(System.in);
        String insp = sc.next();
        for (int i = 0; i < insp.length(); i++) {
            char trg= insp.charAt(i);
            System.out.printf("%s는 아스키코드로 %d입니다\n",trg,(int)trg);
            
        }
        sc.close();
    }
}
