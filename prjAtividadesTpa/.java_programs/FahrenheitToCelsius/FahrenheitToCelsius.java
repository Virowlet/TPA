package prjAula01;

import java.util.Scanner;

public class FahrenheitToCelsius {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		//declaracao de variaveis
		double grausF, grausC;
		
		//atribuicao de valores
		System.out.println("INSIRA OS GRAUS FAHRENHEIT:");
		grausF = ler.nextDouble();
		
		//processamento
		grausC = (grausF-32)*5/9;
		
		if (grausC<0) {
			
			System.out.println("Celsius = " + grausC);
			System.out.println("Frio Extremo");
			
		}//fim do if
		else if (grausC<=10) {
			
			System.out.println("Celsius = " + grausC);
			System.out.println("Frio");
			
		}//fim do else if
		else if (grausC<=20) {
			System.out.println("Celsius = " + grausC);
			System.out.println("Frio Moderado");
		}
		else if (grausC<=24) {
			
			System.out.println("Celsius = " + grausC);
			System.out.println("Clima Ameno");
			
		}//fim do else if
		else {
			
			System.out.println("Celsius = " + grausC);
			System.out.println("Calor");
			
		}//fim do else
		
		ler.close();
	}//fim do metodo main
}//fim da classe
