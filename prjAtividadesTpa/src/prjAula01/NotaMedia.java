package prjAula01;

import java.util.Scanner;

public class NotaMedia {

	public static void main(String[] args) {
	 Scanner ler = new Scanner (System.in);
	 
	 //declaracao de variaveis
	 double nota1,nota2,media,mediaE,notaE;
	 
	 //atribuicao de valores
	 System.out.println("INSIRA A PRIMEIRA NOTA:");
	 nota1 = ler.nextDouble();
	 System.out.println("INSIRA A SEGUNDA NOTA:");
	 nota2 = ler.nextDouble();
	 
	 //Processamento
	 media = (nota1+nota2)/2;
	 
	 if (media<3) {
		 System.out.println("Nota média = " + media);
		 System.out.println("Reprovado");
	 }//fim do if
	 
	 else if (media>=3 && media<6) {
		 System.out.println("Nota média = " + media);
		 System.out.println("Em exame");
		 System.out.println("INSIRA A NOTA DE EXAME:");
		 notaE = ler.nextDouble();
		 mediaE = (media+notaE)/2;
		 
		 if (mediaE>=6) {
			 System.out.println("Nota média = " + mediaE);
			 System.out.println("Aprovado");	 
		 }//fim do if
		 else {
			 System.out.println("Nota média = " + mediaE);
			 System.out.println("Reprovado");
		 }//fim do else
		 
	 }//fim do else if
	 
	 else {
		 System.out.println("Nota média = " + media);
		 System.out.println("Aprovado");
	 }//fim do else
	 
	 ler.close();
	}//fim do metodo main
}//fim da class
