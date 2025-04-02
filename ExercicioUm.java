package exercicios;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("Digite o número A: ");
		a = scanner.nextInt();
		System.out.println("Digite o número B: ");
		b = scanner.nextInt();
		System.out.println("Digite o número C: ");
		c = scanner.nextInt();
		
		if((a+b) > c) {
			System.out.println("A soma de A+B é maior do que C.");
		} else if ((a+b) < c) {
			System.out.println("A soma de A+B é menor do que C.");
		} else {
			System.out.println("A soma de A+B é igual a C.");
		}

	}

}
