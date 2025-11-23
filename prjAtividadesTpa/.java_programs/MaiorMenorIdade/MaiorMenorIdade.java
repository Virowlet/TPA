package prjAula01;

import java.util.Scanner;

public class MaiorMenorIdade {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		//declaracao de variaveis
		int anoNascimento,anoAtual,idade;
		
		//atribuicao de valores
		System.out.println("INSIRA SEU ANO DE NASCIMENTO:");
		anoNascimento = ler.nextInt();
		System.out.println("INSIRA O ANO ATUAL:");
		anoAtual = ler.nextInt();
		
		//processamento
		idade = anoAtual-anoNascimento;
		if (idade<18) {
			
			System.out.println("Idade = " + idade);
			System.out.println("Menor de idade");
			
		}//fim do if
		else {
			
			System.out.println("Idade = " + idade);
			System.out.println("Maior de idade");
		}//fim do else
		
		ler.close();
	}//fim do metodo main
}//fim da classe
