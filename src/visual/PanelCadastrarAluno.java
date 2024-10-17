package visual;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCadastrarAluno extends JPanel {

	JLabel labelNome;
	JLabel labelMatricula;
	JLabel labelCurso;
	JLabel labelCpf;
	JLabel labelDataNasc;
	JLabel labelLogradouro;
	JLabel labelNumero;
	JLabel labelComplemento;
	JLabel labelBairro;
	JLabel labelCep;
	JLabel labelCidade;
	JLabel labelEstado;
	
	JTextField textFieldNome;
	JTextField textFieldMatricula;
	JTextField textFieldCurso;
	JTextField textFieldCpf;
	JTextField textFieldDataNasc;
	JTextField textFieldLogradouro;
	JTextField textFieldNumero;
	JTextField textFieldComplemento;
	JTextField textFieldBairro;
	JTextField textFieldCep;
	JTextField textFieldCidade;
	JTextField textFieldEstado;

	public PanelCadastrarAluno() {
		this.setLayout(null);
		this.setBackground(new Color(48, 48, 48));
		
		// Add all labels and text fields to the panel
		this.add(getLabelNome());
		this.add(getTextFieldNome());
		this.add(getLabelMatricula());
		this.add(getTextFieldMatricula());
		this.add(getLabelCurso());
		this.add(getTextFieldCurso());
		this.add(getLabelCpf());
		this.add(getTextFieldCpf());
		this.add(getLabelDataNasc());
		this.add(getTextFieldDataNasc());
		this.add(getLabelLogradouro());
		this.add(getTextFieldLogradouro());
		this.add(getLabelNumero());
		this.add(getTextFieldNumero());
		this.add(getLabelComplemento());
		this.add(getTextFieldComplemento());
		this.add(getLabelBairro());
		this.add(getTextFieldBairro());
		this.add(getLabelCep());
		this.add(getTextFieldCep());
		this.add(getLabelCidade());
		this.add(getTextFieldCidade());
		this.add(getLabelEstado());
		this.add(getTextFieldEstado());
	}

	// Labels
	public JLabel getLabelNome() {
		if(labelNome == null) {
			labelNome = new JLabel("Nome:");
			labelNome.setForeground(Color.white);
			labelNome.setSize(150, 25);
			labelNome.setLocation(50, 30);
		}
		return labelNome;
	}

	public JLabel getLabelMatricula() {
		if(labelMatricula == null) {
			labelMatricula = new JLabel("Matrícula:");
			labelMatricula.setForeground(Color.white);
			labelMatricula.setSize(150, 25);
			labelMatricula.setLocation(50, 80);
		}
		return labelMatricula;
	}

	public JLabel getLabelCurso() {
		if(labelCurso == null) {
			labelCurso = new JLabel("Curso:");
			labelCurso.setForeground(Color.white);
			labelCurso.setSize(150, 25);
			labelCurso.setLocation(50, 130);
		}
		return labelCurso;
	}

	public JLabel getLabelCpf() {
		if(labelCpf == null) {
			labelCpf = new JLabel("CPF:");
			labelCpf.setForeground(Color.white);
			labelCpf.setSize(150, 25);
			labelCpf.setLocation(50, 180);
		}
		return labelCpf;
	}

	public JLabel getLabelDataNasc() {
		if(labelDataNasc == null) {
			labelDataNasc = new JLabel("Data de Nascimento:");
			labelDataNasc.setForeground(Color.white);
			labelDataNasc.setSize(150, 25);
			labelDataNasc.setLocation(50, 230);
		}
		return labelDataNasc;
	}

	public JLabel getLabelLogradouro() {
		if(labelLogradouro == null) {
			labelLogradouro = new JLabel("Logradouro:");
			labelLogradouro.setForeground(Color.white);
			labelLogradouro.setSize(150, 25);
			labelLogradouro.setLocation(50, 280);
		}
		return labelLogradouro;
	}

	public JLabel getLabelNumero() {
		if(labelNumero == null) {
			labelNumero = new JLabel("Número:");
			labelNumero.setForeground(Color.white);
			labelNumero.setSize(150, 25);
			labelNumero.setLocation(50, 330);
		}
		return labelNumero;
	}

	public JLabel getLabelComplemento() {
		if(labelComplemento == null) {
			labelComplemento = new JLabel("Complemento:");
			labelComplemento.setForeground(Color.white);
			labelComplemento.setSize(150, 25);
			labelComplemento.setLocation(50, 380);
		}
		return labelComplemento;
	}

	public JLabel getLabelBairro() {
		if(labelBairro == null) {
			labelBairro = new JLabel("Bairro:");
			labelBairro.setForeground(Color.white);
			labelBairro.setSize(150, 25);
			labelBairro.setLocation(50, 430);
		}
		return labelBairro;
	}

	public JLabel getLabelCep() {
		if(labelCep == null) {
			labelCep = new JLabel("CEP:");
			labelCep.setForeground(Color.white);
			labelCep.setSize(150, 25);
			labelCep.setLocation(50, 480);
		}
		return labelCep;
	}

	public JLabel getLabelCidade() {
		if(labelCidade == null) {
			labelCidade = new JLabel("Cidade:");
			labelCidade.setForeground(Color.white);
			labelCidade.setSize(150, 25);
			labelCidade.setLocation(50, 530);
		}
		return labelCidade;
	}

	public JLabel getLabelEstado() {
		if(labelEstado == null) {
			labelEstado = new JLabel("Estado:");
			labelEstado.setForeground(Color.white);
			labelEstado.setSize(150, 25);
			labelEstado.setLocation(50, 580);
		}
		return labelEstado;
	}

	// Text Fields
	public JTextField getTextFieldNome() {
		if(textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setSize(150, 30);
			textFieldNome.setLocation(50, 50);
		}
		return textFieldNome;
	}

	public JTextField getTextFieldMatricula() {
		if(textFieldMatricula == null) {
			textFieldMatricula = new JTextField();
			textFieldMatricula.setSize(150, 30);
			textFieldMatricula.setLocation(50, 100);
		}
		return textFieldMatricula;
	}

	public JTextField getTextFieldCurso() {
		if(textFieldCurso == null) {
			textFieldCurso = new JTextField();
			textFieldCurso.setSize(150, 30);
			textFieldCurso.setLocation(50, 150);
		}
		return textFieldCurso;
	}

	public JTextField getTextFieldCpf() {
		if(textFieldCpf == null) {
			textFieldCpf = new JTextField();
			textFieldCpf.setSize(150, 30);
			textFieldCpf.setLocation(50, 200);
		}
		return textFieldCpf;
	}

	public JTextField getTextFieldDataNasc() {
		if(textFieldDataNasc == null) {
			textFieldDataNasc = new JTextField();
			textFieldDataNasc.setSize(150, 30);
			textFieldDataNasc.setLocation(50, 250);
		}
		return textFieldDataNasc;
	}

	public JTextField getTextFieldLogradouro() {
		if(textFieldLogradouro == null) {
			textFieldLogradouro = new JTextField();
			textFieldLogradouro.setSize(150, 30);
			textFieldLogradouro.setLocation(50, 300);
		}
		return textFieldLogradouro;
	}

	public JTextField getTextFieldNumero() {
		if(textFieldNumero == null) {
			textFieldNumero = new JTextField();
			textFieldNumero.setSize(150, 30);
			textFieldNumero.setLocation(50, 350);
		}
		return textFieldNumero;
	}

	public JTextField getTextFieldComplemento() {
		if(textFieldComplemento == null) {
			textFieldComplemento = new JTextField();
			textFieldComplemento.setSize(150, 30);
			textFieldComplemento.setLocation(50, 400);
		}
		return textFieldComplemento;
	}

	public JTextField getTextFieldBairro() {
		if(textFieldBairro == null) {
			textFieldBairro = new JTextField();
			textFieldBairro.setSize(150, 30);
			textFieldBairro.setLocation(50, 450);
		}
		return textFieldBairro;
	}

	public JTextField getTextFieldCep() {
		if(textFieldCep == null) {
			textFieldCep = new JTextField();
			textFieldCep.setSize(150, 30);
			textFieldCep.setLocation(50, 500);
		}
		return textFieldCep;
	}

	public JTextField getTextFieldCidade() {
		if(textFieldCidade == null) {
			textFieldCidade = new JTextField();
			textFieldCidade.setSize(150, 30);
			textFieldCidade.setLocation(50, 550);
		}
		return textFieldCidade;
	}

	public JTextField getTextFieldEstado() {
		if(textFieldEstado == null) {
			textFieldEstado = new JTextField();
			textFieldEstado.setSize(150, 30);
			textFieldEstado.setLocation(50, 600);
		}
		return textFieldEstado;
	}
}
