package io;

//자바입출력
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IO01 {
	public static void main(String[] args) {
		FileReader fr = null; // 문자 기반 입력 스트림 최상위 클래스인 Reader
		BufferedReader br = null; // 위 Reader를 상속받아서 만들어진 리더들

		try {
			fr = new FileReader("c:\\Temp\\temp.txt");
			br = new BufferedReader(fr);
			String line = null;
			// line = 문자열을 읽어서 출력하기 위해서 만듦 한문장씩 읽기 때문에 조금 더 빠르다.
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 마지막에 사용한 객체부터 닫아줍니다.
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
