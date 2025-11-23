package prjAulaLaco;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i,n,t;
		
		System.out.println("Insira um número:");
		n = ler.nextInt();
		i = 1;
		while (i<=10) {
			t = i*n;
			System.out.println(n +" x " + i +" = " + t);
			i++;
		}//fim do while
		System.out.println("Tabuada do " + n + " :)");
		ler.close();
	}//fim do metodo main
}// fim da class

