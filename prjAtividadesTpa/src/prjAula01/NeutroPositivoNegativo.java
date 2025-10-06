package prjAula01;

import java.util.Scanner;

public class NeutroPositivoNegativo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		//Declaracao de variáveis
		double numero;
		
		//atribuicao de valores
		System.out.println("INSIRA UM NÚMERO:");
		numero = ler.nextDouble();
		
		//processamento
		if (numero == 0) {
			
			System.out.println("Neutro");
			
		}//fim do if
		else if (numero < 0) {
			
			System.out.println("Negativo");
			
		}//fim do else if
		else {
			
			System.out.println("Positivo");
			
		}//fim do else
		
		ler.close();
	}// fim do metodo main
}//Fim da classe