package prjAula01;

import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
	 Scanner ler = new Scanner (System.in);
		
		//declaracao de variaveis
		double a,b,c,delta,raiz1,raiz2;
		
		//atribuicao de valores
		System.out.println("INSIRA O VALOR DE A:");
		a = ler.nextDouble();
		System.out.println("INSIRA O VALOR DE B:");
		b = ler.nextDouble();
		System.out.println("INSIRA O VALOR DE C:");
		c = ler.nextDouble();
		
		//processamento
		delta = (b*b)-4*a*c;
		raiz1 = (-b + Math.sqrt(delta))/(2*a);
		raiz2 = (-b - Math.sqrt(delta))/(2*a);
		
		if (delta<0) {
			System.out.println("Não existe raíz real!");
		}//fim do if
		
		else if (delta == 0) {
			System.out.println("Só existe uma raíz real = " + raiz1);
		}//fim do else if
		else {
			System.out.println("Existem duas raizes reais = ");
			System.out.println(raiz1 + " e " + raiz2);
		}//fim do else
		ler.close();
	}//fim do metodo main
}//fim da class
