package entities;

public class Retangulo {
	
	public double base;
	public double altura;
	
	public double area() {
		double area = base * altura;
		return area;
	}
	
	public double perimetro() {
		return 2 * base + 2 * altura;
	}
	
	public double diagonal() {
		return Math.sqrt((base * base) + (altura * altura));
	}
	
	public String toString() {
		return "AREA = " + String.format("%.2f%n", area()) 
		+ "PERIMETRO = " + String.format("%.2f%n", perimetro())
		+ "DIAGONAL = " + String.format("%.2f%n", diagonal());
	}

}
