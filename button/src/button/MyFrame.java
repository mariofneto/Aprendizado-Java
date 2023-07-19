package button;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	
	MyFrame(){
		JFrame frame = new JFrame();
		button = new JButton();
		button.addActionListener(this); // para funcionar o botão quando clicado
		button.setBounds(100,100,250, 100); // *bounds significa limites*
		button.setFocusable(false);
		button.setText("peido");
		button.setFont(new Font("Comic Sans", Font.BOLD, 25 ));
		button.setForeground(Color.green); // isso muda a cor do texto
		button.setBackground(Color.black); // isso muda a cor do botão
		
		this.setVisible(true);
		this.setLayout(null); // Se o layout for “null” os componentes da sua tela vão ser “independentes” e sua posição vai depender somente do método setBounds
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Aprendendo a usar buttons");
		this.add(button);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== button) {
			System.out.println("peidei...");
		}
		
	}
}
