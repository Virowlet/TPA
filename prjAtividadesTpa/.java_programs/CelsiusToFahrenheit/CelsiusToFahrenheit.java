package prjAula01;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		//Declaracao de variaveis
		double grausF,grausC;
		
		//Atribuição de valores
		System.out.println("INSIRA A TEMPERATURA EM FAHRENHEIT:");
		grausF = ler.nextDouble();
		
		//Processamento
		grausC = (grausF-32)*5/9;
		
		if (grausC >= 22) {
			
			System.out.println("Temperatura = " + grausC);
			System.out.println("Calor");
			
		}//fim do if
		else if (grausC >= 15) {
			
			System.out.println("Temperatura = " + grausC);
			System.out.println("Ameno");
			
		}//fim do else if
		else {
			
			System.out.println("Temperatura = " + grausC);
			System.out.println("Frio");
			
		}//fim do else
		
		ler.close();
	}//Fim do metodo main
}//Fim da classe
