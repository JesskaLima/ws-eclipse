package entities;

public class Funcionarios {
	
	public String name;
	public double salarioBruto;
	public double imposto;
	
	
	public double salarioLiquido() {
		double salario = salarioBruto - imposto;
		return salario;
	}
	
	public void aumentoSalario(double porcentagem) {
		double aumento = salarioLiquido() * porcentagem;
		return aumento;
		
	}

}
