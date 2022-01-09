package conceitosBasicos;

import java.util.Scanner;

/*
 * Criar um programa que leia um valor e 
 * apresente os resultados ao quadrado e ao cubo do valor.
 */

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		double valor = scanner.nextDouble();

		double quadrado = Math.pow(valor, 2);
		System.out.println("O quadrado do valor digitado é " + quadrado);
		
		double triplo = Math.pow(valor, 3);
		System.out.printf("O triplo do valor digitado é: " + triplo);
		
		scanner.close();
	}

}
