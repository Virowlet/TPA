package prjVetores;

import java.util.Scanner;

public class VetorBusca {

	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		
		final int TAM = 10;
		int i,a[],b,l;
		a = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o " + (i+1) + "° valor do vetor A:");
			a[i] = ler.nextInt();
		}
		System.out.println("Qual número deseja buscar no vetor A?");
		b = ler.nextInt();
		for(i=0;i<TAM;i++) {
			if(b==a[i]) {
				l = i;
				System.out.println(b+" está sim armazenado no vetor, no índice " + l);
			}
		}
	}
}
