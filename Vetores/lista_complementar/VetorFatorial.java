package prjVetores;

import java.util.Scanner;

public class VetorFatorial {

	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		
		int a[], b[],i,j;
		final int TAM = 15;
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o " + (i+1) + "° valor do vetor");
			a[i] = ler.nextInt();
		}
		System.out.print("B [");
		for(i=0;i<TAM;i++) {
			b[i] = 1;
			for(j=1;j<=a[i];j++) {
				b[i] = b[i] *j;
			}
		System.out.print(b[i] + ", ");
		}
		System.out.print("]");
	}
}
