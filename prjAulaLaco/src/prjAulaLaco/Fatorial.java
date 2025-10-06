package prjAulaLaco;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int n,i,f;
		
		i = 1;
		f = 1;
		
		System.out.println("INSIRA O NÚMERO:");
		n = ler.nextInt();
		
		do {
			f = f*i;
			i++;
		}while(i<=n);
		System.out.println(n + "! = "  + f);
		ler.close();
	}//fim do metodo main
}// fim da class
