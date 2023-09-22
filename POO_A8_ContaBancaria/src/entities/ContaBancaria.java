package entities;

public class ContaBancaria {
	
	private int conta;
	private String nome;
	private double valor;
	
	public ContaBancaria(int conta, String nome, double valor) {
		this.conta = conta;
		this.nome = nome;
		this.valor = valor;
	}
	public ContaBancaria(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	

}
