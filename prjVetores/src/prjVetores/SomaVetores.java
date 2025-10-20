package prjVetores;

import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a[],b[],c[],i;
		final int TAM=10;
		a = new int[TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o " + (i+1) + "° valor do vetor A");
			a[i] = ler.nextInt();
		}
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o " + (i+1) + "° valor do vetor B");
			b[i] = ler.nextInt();
			c[i] = a[i] + b[i];
		}
		System.out.print("B =[");
		for(i=0;i<TAM;i++) {
			System.out.print(c[i] + " ");
		}
		System.out.print("]");
	}
}
