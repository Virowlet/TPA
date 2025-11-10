package prjVetores;

import java.util.Scanner;

public class VetorParesde0AteElemento {
	
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		
		final int TAM = 10;
		int a[],i,j;
		a = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o " + (i+1) + "° valor do vetor A:");
			a[i] = ler.nextInt();
		}
		for(i=0;i<TAM;i++) {
			System.out.print(a[i] + "( ");
			for(j=0;j<=a[i];j++) {
				if(j%2==0) {
					System.out.print(j + " ");
				}
			}
			System.out.println(" )");
		}
	}

}
