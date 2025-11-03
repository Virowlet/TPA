package prjVetores;

import java.util.Scanner;

public class VetorInvertido {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a[],b[],i;
		final int TAM=10;
		a = new int[TAM];
		b = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o " + (i+1) + "° valor do vetor A");
			a[i] = ler.nextInt();
		}
		System.out.print("B =[");
		for(i=9;i<TAM && i>=0;i--) {
			b[i] = a[i];
			System.out.print(b[i] + " ");
		}
		System.out.print("]");
	}
}
