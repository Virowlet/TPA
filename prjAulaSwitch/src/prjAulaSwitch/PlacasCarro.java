package prjAulaSwitch;

import  java.util.Scanner;

public class PlacasCarro {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		
		//declaracao de variaveis
		int p;
		
		//atribuicao de valores
		System.out.println("Insira o ultimo numero da placa");
		p = ler.nextInt();
		
		//processamento
		switch(p) {
			case 1:
			case 2:
				System.out.println("Não pode circular Segunda-Feira");
				break;
			case 3:
			case 4:
				System.out.println("Não pode circular Terça-Feira");
				break;
			case 5:
			case 6:
				System.out.println("Não pode circular Quarta-Feira");
				break;
			case 7:
			case 8:
				System.out.println("Não pode circular Quinta-Feira");
				break;
			case 9:
			case 0:
				System.out.println("Não pode circular Sexta-Feira");
				break;
			default:
				System.out.println("Número inválido");
	
		}// fim do switch
		ler.close();
	}// fim do metodo main
}// fim do class
