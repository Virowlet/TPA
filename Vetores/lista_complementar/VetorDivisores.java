package prjVetores;

import java.util.Scanner;

public class VetorDivisores {
	
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		
		final int TAM = 10;
		int a[],i,j;
		a = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o " + (i+1) + "° valor do vetor A:");
			a[i] = ler.nextInt();
		}
		System.out.println("Os divisores de cada elemento são:");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i] + "( ");
			for(j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					System.out.print(j + " ");
				}
			}
			System.out.println(" )");
		}
	}

}
