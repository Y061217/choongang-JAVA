package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOption extends JFrame{
	public JOption() {
		super("JOption을 사용한 예제");
		JOptionPane.showConfirmDialog(this, "성공했습니다.");
		
		System.out.println(JOptionPane.showConfirmDialog(this,"선택하세요"));
		
		System.out.println(JOptionPane.showInputDialog(this, "name: "));
		
		setSize(300,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new JOption();
	}
}
