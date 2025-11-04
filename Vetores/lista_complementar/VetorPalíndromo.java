package prjVetores;

import java.util.Scanner;

public class VetorPalíndromo {

	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		
		int a[],b[],i,j=0,p=0;
		final int TAM=10;
		a = new int[TAM];
		b = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o " + (i+1) + "° valor do vetor A");
			a[i] = ler.nextInt();
		}
		for(i=9;i<TAM && i>=0;i--) {
			b[i] = a[j];
			j++;
		}
		for(i=0;i<TAM;i++) {
			if(b[i]==a[i]) {
				p++;
			}
			else {
				p=0;
			}
		}
		if(p==10) {
			System.out.println("É palíndromo!");
		}
		else {
			System.out.println("Não é palíndromo!");
		}
	}
}
