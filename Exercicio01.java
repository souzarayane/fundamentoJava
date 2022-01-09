package conceitosBasicos;

import java.util.Scanner;

//Criar um programa que leia a temperatura em Fahrenheit
//e converta para Celsius.

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit ");
		double celsius = scanner.nextDouble();
		
		double conversao = (celsius - 32) / 1.8;
		
		System.out.printf("A conversão %.2f para Celsius é %.2f", celsius, conversao);
		
		scanner.close();
		
	}

}
