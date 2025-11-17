package prjVetores;

import java.util.Scanner;

public class VetorMaiorMenor {

	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		
		final int TAM = 10;
		int a[],b[],c[],i;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o " + (i+1) + "° valor do vetor A:");
			a[i] = ler.nextInt();
		}
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o " + (i+1) + "° valor do vetor B:");
			b[i] = ler.nextInt();
		}
		System.out.print("C = [");
		for(i=0;i<TAM;i++) {
			if(a[i]==b[i]) {
				c[i] = 0;
			}
			else if(a[i]>b[i]) {
				c[i] = 1;
			}
			else {
				c[i] = -1;
			}
			System.out.print( c[i] + " ");
		}
		System.out.println("]");
	}
}