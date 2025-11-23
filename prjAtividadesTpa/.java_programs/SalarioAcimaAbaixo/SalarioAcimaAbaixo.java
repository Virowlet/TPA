package prjAula01;

import java.util.Scanner;

public class SalarioAcimaAbaixo {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		//declarcao de variaveis
		double salario;
		
		//atribuicao de valores
		System.out.println("Insira seu salário:");
		salario = ler.nextDouble();
		
		//processamento
		if (salario < 1302.00) {
			
			System.out.println("Abaixo do salário mínimo");
			
		}//fechamento do if
		else {
			
			System.out.println("Acima do salário mínimo");
			
		}//fechamento do else
		
		ler.close();
	}//fim do metodo main
}//fim da classe
