package modelo;

public class Aluno {

	private String nome;
	private String matricula;
	private String curso;
	private String cpf;
	private String dataNascimento;
	private Endereco endereco;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, 
				String matricula, 
				String curso, 
				String cpf, 
				String dataNascimento, 
				Endereco endereco) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public String getCurso() {
		return curso;
	}


	public String getCpf() {
		return cpf;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}
