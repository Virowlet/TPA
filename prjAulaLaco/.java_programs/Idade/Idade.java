package prjAulaLaco;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i,id,ma,me;
		
		me = 0;
		ma = 0;
		i = 1;
		
		while (i<=5) {
			System.out.println("Insira a idade da " + i + "º pessoa:");
			id = ler.nextInt();
			if (id>=18) {
				System.out.println("A " + i + "º pessoa é maior de idade");
				ma++;
				
			}//fim do if
			else if(id<0) {
				System.out.println("idade inválida");
				
			}//fim do else if
			else {
				System.out.println("A " + i + "º pessoa é  menor de idade");
				me++;
				
			}//fim do else
			i++;
		}//fim do while
		System.out.println("Maiores de idade: " + me);
		System.out.println("Menores de idade: " + ma);
		ler.close();
	}//fim do metodo main
}//fim da class
