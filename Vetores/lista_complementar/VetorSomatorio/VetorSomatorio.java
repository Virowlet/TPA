package prjVetores;

import java.util.Scanner;

public class VetorSomatorio {

	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		
		final int TAM = 10;
		int a[],b[],i,j;
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o " + (i+1) + "° valor do vetor A:");
			a[i] = ler.nextInt();
		}
		System.out.print("B = [");
		for(i=0;i<TAM;i++) {
			for(j=i;j<TAM;j++) {
				if(j==0) {
					b[i] = a[j];
				}
				else {
					b[i] += a[j];
				}
			}
			System.out.print(b[i] + ", ");
		}
		System.out.print("]");
	}
}
