package prjVetores;

import java.util.Scanner;

public class VetorSepararParImpar {

	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		
		final int TAM = 20;
		int a[],b[],i=0,j=0;
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o " + (i+1) + "° valor do vetor A:");
			a[i] = ler.nextInt();
		}
		for(i=0;i<TAM;i++) {
			if(a[i]%2==0) {
				b[j] = a[i];
				j++;
			}
		}
		for(i=0;i<TAM;i++) {
			if(a[i]%2!=0) {
				b[j] = a[i];
				j++;
			}
		}
		System.out.print("B =[");
		for(i=0;i<TAM;i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("]");
		System.out.print("Nas primeiras posições estão os números pares e em seguida ímpares!");
	}
}
