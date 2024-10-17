package visual;

import javax.swing.JFrame;

public class Frame extends JFrame {
	
	public Frame() {
		super();
		this.setVisible(true);
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Frame f = new Frame();
		PanelCadastrarAluno pcn = new PanelCadastrarAluno();
		f.setContentPane(pcn);
		f.repaint();
		f.validate();
	}

}
