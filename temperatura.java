package fundamentos;

import java.util.Scanner;

public class temperatura2 {

	public static void main(String[] args) {

		// (°F - 32) x 5/9 = °C ----> Formula do Exercício de conversão de temperaturas

		// define o F
		double f = 0;

		// define o 32
		final double tempf = 32;

		// define o 5/9
		final double tempdiv = (5 / 9.0);

		// define um novo valor para f
		f = 15;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a Temperatura em Farenheit: ");
		int far = entrada.nextInt();

		f = far;

		// define (F - 32)
		double fa = f - tempf;

		// define o resultado da conversão de Farenheits (°F) para Celcius (C°)
		double c = fa * tempdiv;

		System.out.printf("A conversão de %s°F para Celcius(°C) é de: %.2f°C", f, c);

	}

}
