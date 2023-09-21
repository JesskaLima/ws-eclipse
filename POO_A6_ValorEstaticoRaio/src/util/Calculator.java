package util;

/*Fazer um programa para ler um valor numerico qualquer
 * e daí mostrar quanto seria o valor de uma circunferencia
 * e do volume de uma esfera para o raio daquele valor.
 * Informar também o valor de PI com duas casas decimais.
 * 
 * exemplo:
 * Enter radius: 3.0
 * Circunference: 18.84
 * Volume: 113.04
 * PI value: 3.14*/

public class Calculator {
	public static final double PI = 3.14;
	
	public static double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
