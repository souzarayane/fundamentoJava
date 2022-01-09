package conceitosBasicos;

import java.util.Scanner;

/*
 * Criar um programa que leia a temperatura em Celsius e converta 
 * para Fahrenheit.
 */

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double fahrenheit = scanner.nextDouble();
		
		double conversao = (fahrenheit * 1.8) + 32;

		System.out.printf("O valor de conversão de %.2f Celsius para Fahrenheit é: %.2f", fahrenheit, conversao);
		
		scanner.close();
	}

}
