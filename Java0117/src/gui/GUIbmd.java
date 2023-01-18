package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame extends JFrame {
	private JTextField nameTF;
	private JTextField heightTF;
	private JTextField weightTF;
	private JButton resultBtn;
	private JButton deleteBtn;
	private JLabel resultLb;

	public MyFrame() {
		setLayout(new GridLayout(5, 1));

		JPanel nameP = new JPanel();
		nameP.setLayout(new GridLayout(1, 2));
		nameP.add(new JLabel("이름"));
		nameTF = new JTextField();
		nameP.add(nameTF);
		add(nameP);

		JPanel heightP = new JPanel();
		heightP.setLayout(new GridLayout(1, 2));
		heightP.add(new JLabel("키"));
		heightTF = new JTextField();
		heightP.add(heightTF);
		add(heightP);

		JPanel weightP = new JPanel();
		weightP.setLayout(new GridLayout(1, 2));
		weightP.add(new JLabel("몸무게"));
		weightTF = new JTextField();
		weightP.add(weightTF);
		add(weightP);

		JPanel buttonP = new JPanel();
		buttonP.setLayout(new GridLayout(1, 2));
		resultBtn = new JButton("결과보기");
		deleteBtn = new JButton("초기화");

		buttonP.add(deleteBtn);
		buttonP.add(resultBtn);
		add(buttonP);

		resultLb = new JLabel("결과값이 여기에 나타납니다.");
		add(resultLb);

		// 이벤트리스너
		// 초기화 버튼을 눌렀을 때 동작할 리스너
		deleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				nameTF.setText("");
				heightTF.setText("");
				weightTF.setText("");
			}
		});// 삭제 버튼 리스너 끝.

		resultBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 이름, 키, 몸무게 저장하기
				String name = nameTF.getText();
				double ki = Double.parseDouble(heightTF.getText());
				double mon = Double.parseDouble(weightTF.getText());

				// 연산
				// 표준체중(kg) = (현재신장cm - 100) X 0.9
				// 비만도(%) = (현재체중 ÷표준체중) X 100
				double stdWeight = (ki - 100) * 0.9;
				double bimando = (mon / stdWeight) * 100;

				// 출력
				if (bimando > 120) {
					resultLb.setText(name + "님, 당신은 비만입니다.");
				} else if (bimando < 80) {
					resultLb.setText(name + "님, 당신은 저체중입니다.");
				} else {
					resultLb.setText(name + "님, 당신은 정상입니다.");
				}

			}
		});// 결과보기 버튼 리스터 끝.

	}
}

public class GUIbmd {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		frame.setSize(300, 600);
		frame.setTitle("비만도 계산 프로그램");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}