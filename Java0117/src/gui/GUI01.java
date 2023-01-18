package gui;
//그래픽 유저 인터페이스
//CLI = 커맨드 라인 인터페이스

import java.awt.Button;
import java.awt.Frame;

/*
 * AWT 실행 운영체제의 특징을 따라 화면을 구성합니다.
 * 		운영체제 마다 다른 화면을 보여줌
 * 
 * 
 * SWING 자바 영역에서 사용하는 look and feel을 적용하여
 * 		모든 운영체제가 같은 모습을 가지게 함
 * 
 * FX	RIA를 디자인하고 만들어 테스트, 디버그, 배포까지 가능한 일련의
 * 		그래픽과 미디어의 통합
 * 
 * 용어
 * Container	컨테이너	:	자바에서 창 역할
 * 							한개 이상의 컨테이너 위에 컨테이너가 올라가서 화면을 구성
 * 							frame, window, panel, dialog, applet
 * 
 * Component	컴포넌트	:	실제로 컨테이너 위에 올려서 화면을 구성
 * 							Button, TextFieid, TextArea, List
 * 
 * LayoutManager	레이아웃	:	컴포넌트의 자리 배치 방법
 * 								FlowLayout, BoardLayout, GridLayout
 * 
 * 상속을 받을 때는 많이 사용하는 요소를 상속받는 것이 유리
 * 화면 생성을 프로그램 초기에 이뤄져야 하므로 주로 생성자에서 작업
 * 
 */
public class GUI01 {
	Frame frame = new Frame();
	Button button = new Button();
	
	public void createFrame() {
		frame.add(button);
		frame.setSize(300, 600);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		GUI01 gui01 = new GUI01();
		gui01.createFrame();
	}
}
