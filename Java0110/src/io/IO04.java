package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IO04 {
public static void main(String[] args) {
File file = new File("C:\\Temp\\fileWriter.txt"); //파일을 (생성하여) 선택
FileWriter fw = null;
try {
	fw = new FileWriter(file);
	
	fw.write("값을 입력 했습니다.\r\n");
	fw.write("저장 했습니다.");
	fw.flush(); //저장하기 : 출력 버퍼에 있는 값을 다 저장
	fw.close(); //닫기
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
