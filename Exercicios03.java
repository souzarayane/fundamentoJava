package conceitosBasicos;

import java.util.Scanner;

/*
 * Criar um programa que leia o peso e a altura do 
 * usuário e imprima no console o IMC.
 */

public class Exercicios03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		double peso = scanner.nextDouble();
		
		System.out.println("Digite sua altura: ");
		double altura = scanner.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.printf("Seu IMC é: %.2f", imc);

		scanner.close();
	}

}
