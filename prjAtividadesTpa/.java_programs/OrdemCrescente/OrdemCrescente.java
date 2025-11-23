package prjAula01;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		//declaracao de variaveis
		int a,b,c;
		
		//atribuicao de valores
		System.out.println("INSIRA O NÚMERO A:");
		a = ler.nextInt();
		System.out.println("INSIRA O NÚMERO B:");
		b = ler.nextInt();
		System.out.println("INSIRA O NÚMERO C:");
		c = ler.nextInt();
		
		//processamento
		if (a<=b && b<=c) {
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
		}//fim do if
		else if (b<=a && a<=c) {
			
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
			
		}//fim do else if
		else if(b<=c && c<=a) {
			
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
			
		}//fim do else if
		else if (a<=c && c<=b) {
			
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
			
		}//fim do else if
		else if (c<=b && b<=a) {
			
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
			
		}//fim else if
		else {
			
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
			
		}//fim do else
		
		ler.close();
	}//fim do metodo main
}//fim da class
