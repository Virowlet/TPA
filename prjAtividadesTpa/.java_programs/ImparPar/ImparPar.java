package prjAula01;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		//declaracao de variaveis
		int numero;
		
		//atribuicao de valores
		System.out.println("INSIRA UM NÚMERO:");
		numero = ler.nextInt();
		
		//Processamento
		if (numero%2==0) {
			
			System.out.println("Par");
			
		}//fim do if
		else {
			
			System.out.println("Impar");
			
		}//fim do else
		
		ler.close();
	}//fim do metodo main
}//fim da classe
