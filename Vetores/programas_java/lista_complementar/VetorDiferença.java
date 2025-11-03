package prjVetores;

import java.util.Scanner;

public class VetorInterseção {

	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		
		final int TAM = 10;.
		int i,a[],b[],c[],j;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o " + (i+1) + "° valor do vetor A");
			a[i] = ler.nextInt();
		}
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o " + (i+1) + "° valor do vetor B");
			b[i] = ler.nextInt();
		}
		System.out.print("C [");
		for(i=0;i<TAM;i++) {
			for(j=0;j<TAM;j++) {
				if(a[i]==b[j]) {
					c[i] = a[i];
				}
			}
			if(c[i]==0) {
				System.out.print("");
			}
			else {
				System.out.print(c[i] + " ");
			}
		}
		System.out.println("]");
	}
}

