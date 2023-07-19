package flowLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100,250));
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.gray);
		
		for(int i = 1; i <= 9; i++) {
			panel.add(new JButton(""+i+"")); // para criar botao de 1 a 10
		}
		
		frame.add(panel);
		frame.setVisible(true);
		frame.setFocusable(true);
		
	}

}
