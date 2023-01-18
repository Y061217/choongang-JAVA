package gui;

import java.awt.event.InputEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class Menu {
	JFrame jf = new JFrame("메뉴 만들기");
	JTextArea textArea = new JTextArea("입력하세요", 5, 10);
	JScrollPane jScrollPane = new JScrollPane(textArea);

	JMenuBar menubar = new JMenuBar();
	JMenu filemenu = new JMenu("File");
	JMenu helpmenu = new JMenu("Help");

public Menu() {
	filemenu.add(new JMenuItem("새파일 열기"));
	filemenu.getItem(0).setAccelerator(KeyStroke.getKeyStroke('N' , InputEvent.CTRL_MASK ^ InputEvent.ALT_MASK));
	filemenu.add(new JMenuItem("저장하기"));
	filemenu.add(new JMenuItem("다른 이름으로 저장하기"));
	filemenu.addSeparator(); //구분선
	filemenu.add(new JMenuItem("종료"));
	
	helpmenu.add(new JMenuItem("이 프로그램은"));
	helpmenu.add(new JMenuItem("만든이"));
	
	menubar.add(filemenu);
	menubar.add(helpmenu);
	
	jf.setJMenuBar(menubar);
	jf.add(jScrollPane,"Center");
	
	jf.setSize(300,600);
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
	new Menu();
}
}
