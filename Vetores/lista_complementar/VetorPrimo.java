package prjVetores;

import java.util.Scanner;

public class VetorPrimo {

	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);

		final int TAM = 10;
		int a[],i,j,p;
		a = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o " + (i+1) + "° valor do vetor A:");
			a[i] = ler.nextInt();
		}
		for(i=0;i<TAM;i++) {
			p=0;
			System.out.print(a[i]);
			for(j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					p++;
				}
			}
			if(p==2) {
				System.out.println(" É Primo");
			}
			else {
				System.out.println(" Não é primo");
			}
		}
	}
}
