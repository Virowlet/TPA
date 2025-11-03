package prjVetores;

import java.util.Scanner;

public class VetorPotência {

	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		
		int a[],i,j;
		final int TAM = 11;
		a = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o " + (i+1) + "° valor:");
			a[i] = ler.nextInt();
		}
		for(i=0;i<TAM;i++) {
			int r =1;
			for(j=0;j<a[i];j++) {
					r *= 2;
				}
			a[i] = r;
			System.out.println(a[i]);
		}
	}
}