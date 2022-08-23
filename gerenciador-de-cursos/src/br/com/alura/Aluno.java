package br.com.alura;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public Aluno(String nome, int numeroMatricula) {
		super();
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
}
