package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO03 {
public static void main(String[] args) {
	//URL 경로 상에 있는 파일을 읽는 기능 FileInputStream
	//URL 경로 상에 있는 파일을 저장하는 기능 FileOutputStream
	/* FileOutputStream은 Byte배열로 써야합니다. getBytes()
	 * 줄바꿈 명령어는 \r\n입니다
	 * 
	 * FileWriter를 이용하면 문자열(String)을 그대로 쓸 수 있습니다.
	 */
	FileOutputStream fos = null;
	
	try {
		fos = new FileOutputStream("c:\\Temp\\output.txt");
		for(int i = 0; i < 10; i++) {
			String data = i + "번째 줄입니다.\r\n";
			fos.write(data.getBytes());
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
}
