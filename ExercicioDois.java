package exercicios;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int codigoitem;
		int quantidade;
		int valortotal = 0;
		
		System.out.println("Digite um código de produto: ");
		codigoitem = scanner.nextInt();
		System.out.println("Digite a quantidade comprada do produto: ");
		quantidade = scanner.nextInt();
		
		switch(codigoitem) {
		case 1: valortotal = quantidade * 10;
		break;
		case 2: valortotal = quantidade * 15;
		break;
		case 3: valortotal = quantidade * 18;
		break;
		case 4: valortotal = quantidade * 12;
		break;
		case 5: valortotal = quantidade * 8;
		break;
		case 6: valortotal = quantidade * 13;
		break;
		default: System.out.println("Você não inseriu um código válido!");
		
		
		}
		
		System.out.println("Valor total: " + valortotal + " reais");

	}

}
