package learningJFrame;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
			
			ImageIcon image = new ImageIcon("atendimento-ao-cliente.png");
	
			
			JFrame frame = new JFrame();
			frame.setVisible(true); // precisa estar true para aparecer na tela
			frame.setSize(1280,720); // 420 de largura e 420 de altura
			frame.setTitle("Meu primeiro JFrame com Java"); // titulo do JFrame
			frame.setResizable(false); // nao deixa ajustar a largura
			frame.getContentPane().setBackground(new Color(80,80,80)); // primeiro pega o painel de conteudo e depois so adicionar a cor desejada
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para nao deixar a janela rodando em segundo plano
			
			JLabel label = new JLabel();
			frame.add(label);
			label.setSize(200,200);
			label.setText("sou eu aqui de novo!");
			label.setIcon(image);

	}

}
