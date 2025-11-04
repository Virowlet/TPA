package prjVetores;

import java.util.Scanner;

public class VetorParImpar {

	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		
		final int TAM = 10;
		int a[],b[],i;
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o " + (i+1) + "° valor do vetor A:");
			a[i] = ler.nextInt();
		}
		System.out.print("B = [");
		for(i=0;i<TAM;i++) {
			if(a[i]%2==0) {
				b[i] = 1;
			}
			else {
				b[i] = 0;
			}
			System.out.print(b[i] + " ");
		}
		System.out.print("]");
	}
}
