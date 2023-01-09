package exception01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//try문 안에 여러 코드가 있을 경우 각 코드에 대응하는 catch문을 만들 수 있다.
public class Excep04 {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("c://Temp//temp.txt");
			
			while (true) {
				int data = fr.read();
				
			}
		} catch (FileNotFoundException e) {//filereader 대응
			//e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {//while문 대응
			//e.printStackTrace();
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}
}
