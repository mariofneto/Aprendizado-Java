package gridLayout;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new GridLayout(5,2));
		frame.setBackground(Color.gray);
		
		for(int i = 1; i <= 9; i++) {
			frame.add(new JButton(""+i+"")); // para criar botao de 1 a 10
		}
		
		frame.setVisible(true);
		frame.setFocusable(true);
		
	}

}
