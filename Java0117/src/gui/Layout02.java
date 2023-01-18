package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//border
//기본적인 틀이 존재합니다.
//추가할때 위치를 적어줘야 합니다. 기입하지 않으면 Center
//위치값은 동서남북 중앙 순
public class Layout02 {
	JFrame frame = new JFrame("보더레이아웃");
	JButton jbtn1 = new JButton();
	JButton jbtn2 = new JButton();
	JButton jbtn3 = new JButton();
	JButton jbtn4 = new JButton();
	JButton jbtn5 = new JButton();
	
	public Layout02() {
		frame.add(jbtn1,BorderLayout.NORTH);
		frame.add(jbtn2,BorderLayout.SOUTH);
		frame.add(jbtn3,BorderLayout.WEST);
		frame.add(jbtn4,BorderLayout.EAST);
		frame.add(jbtn5,BorderLayout.CENTER);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Layout02();
	}
}
