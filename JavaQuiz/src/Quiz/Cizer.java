package Quiz;

import java.util.Scanner;

public class Cizer {
    public static void main(String[] args) {
        int num=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("암호를 만들 문장을 입력하세요.");
        String kwrds = sc.next();
        System.out.println("암호값을 입력하세요");
        num = sc.nextInt();

        char[] kwrd_isol = new char[kwrds.length()];

        for (int i = 0; i < kwrds.length(); i++) {
            char kwrd = kwrds.charAt(i);
            kwrd_isol[i] = kwrd;
             
        }
        
        
        char total = 0;
        System.out.print("암호는 : ");
        for (char c : kwrd_isol) {
            total = (char)((int)c + num);
            System.out.print(total);
        }

        


        
        
        sc.close(); 

        
        
    }
}
