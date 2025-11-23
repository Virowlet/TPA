package prjAulaLaco;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int n2,n1,i,t,s;
		
		n1 = 1;
		n2 = 0;
		
		System.out.println("Insira a quantidade de termos:");
		t = ler.nextInt();
		
		i=0;
		do {
			s = n1+n2;
			System.out.println(s);
			n1=n2;
			n2=s;
			i++;
		}while(i<t);
		ler.close();
	}//fim do metodo main
}//fim da class