package prjVetores;

import java.util.Scanner;

public class VetorMedia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a[],i,soma=0;
		final int TAM=10;
		a = new int[TAM];
	
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o " + (i+1) + "° valor do vetor A");
			a[i] = ler.nextInt();
				soma += a[i];
			}
			
		int m = soma/10;
		System.out.println("Média =" + m);
		}
		
	}
