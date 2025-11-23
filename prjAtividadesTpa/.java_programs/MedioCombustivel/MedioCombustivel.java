package prjAula01;

import java.util.Scanner;

public class MedioCombustivel {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		//declaracao de variaveis]
		double distancia, capaci, gastoM;
		
		//atribuicao de valores
		System.out.println("INSIRA A DISTÂNCIA PERCORRIDA PELO VEÍCULO EM QUILÔMETROS:");
		distancia = ler.nextDouble();
		System.out.println("INSIRA A CAPACIDADE DO TANQUE DO VEÍCULO EM LITROS:");
		capaci = ler.nextDouble();
		
		//Processamento
		gastoM = distancia/capaci;
		
		if (gastoM>=10) {
			
			System.out.println("O gasto médio é: " + gastoM + " Km/L");
			System.out.println("Econômico");
			
		}//fim do if
		else {
			
			System.out.println("O gasto médio é: " + gastoM + " Km/L");
			System.out.println("Não econômico");
			
		}//fim do else
		
		ler.close();
	}//fim do metodo main
}//fim da classe
