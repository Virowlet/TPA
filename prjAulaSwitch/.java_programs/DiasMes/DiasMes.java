package prjAulaSwitch;

import java.util.Scanner;

public class DiasMes {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		//declaracao de variaveis
		int m;
		
		//atribuicao de valores
		System.out.println("Insira o valor numerico que representa o mes");
		m = ler.nextInt();
		
		//processamento
		switch(m) {
		   case 2:		   
			   System.out.println("Tem 28 dias");
			   break;
		   case 1:
		   case 3:
		   case 5:
		   case 7:
		   case 8:
		   case 10:
		   case 12:
			   System.out.println("Tem 31 dias");
			   break;
		   case 4:
		   case 6:
		   case 9:
		   case 11:
			   System.out.println("Tem 30 dias");
		       break;
		   default:
			   System.out.println("Mês invalido");
			   
		}// fim do switch
		ler.close();
	}// fim do metodo main

}// fim da class
