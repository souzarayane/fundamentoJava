package conceitosBasicos;

import java.util.Scanner;

/*
 * Criar um programa que leia o valor da base e da altura 
 * de um tri�ngulo e calcule a �rea.
 */

public class Exercicio05 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor da base: ");
		double base = scanner.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		double altura = scanner.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.printf("A �rea do tri�ngulo �: %.2f",area);
		
		scanner.close();

	}

}
