package prjAula01;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		//declaracao de variaveis
		int anoNasc,anoAtual,idade;
		
		//atribuicao de valores
		System.out.println("INSIRA O ANO DE NASCIMENTO:");
		anoNasc = ler.nextInt();
		System.out.println("INSIRA O ANO ATUAL:");
		anoAtual = ler.nextInt();
		
		//processamento
		idade = anoAtual-anoNasc;
		
		if (idade < 10) {
			
			System.out.println("Sua idade é = " + idade);
			System.out.println("Criança");
			
		}//fim do if
		else if (idade >=10 && idade< 18) {
			
			System.out.println("Sua idade é = " + idade);
			System.out.println("Adolescente");
			
		}//fim do else if
		else if (idade >=18 && idade <60) {
			
			System.out.println("Sua idade é = " + idade);
			System.out.println("Adulto");
			
		}//fim do else if
		else {
			
			System.out.println("Sua idade é = " + idade);
			System.out.println("Idoso");
			
		}//fim do else
	
		ler.close();
	}//fim do metodo main
}//fim da classe
