package prjVetores;

import java.util.Scanner;

public class VetorTabuada {

	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		
		final int TAM = 5;
		int a[], i,t,n;
		a = new int[TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o " + (i+1) + "° valor!");
			a[i] = ler.nextInt();
		}
		for(i=0;i<TAM;i++) {
		System.out.println("Tabuada do " + a[i]);
			for(n=1;n<=10;n++) {
				t = a[i] * n;
				System.out.println(a[i] + " x " + n + " = " + t);
			}
		}
	}
}
