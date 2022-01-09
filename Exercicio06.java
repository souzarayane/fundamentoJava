package conceitosBasicos;

import java.util.Scanner;

/*
 * Criar um programa que resolve equa��es do segundo grau (ax2 + bx + c = 0) 
 * utilizando a f�rmula de Bhaskara. 
 * Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
 */

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("A equa��o de 2� grau tem a f�rmula: ax� + bx + c = 0");
		
		double a = 1D;
		double b = 12D;
		double c = -13D;
		
		double delta = Math.pow(b, 2) - (4 * a * c);
		
		System.out.printf("O valor de delta �: %.2f", delta);
		
		scanner.close();

	}

}
