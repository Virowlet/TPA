package prjAula01;

import java.util.Scanner;

public class Imc2 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		//declaracao de variaveis
		double altura,peso,imc;
		
		//atribuicao de valores
		System.out.println("INSIRA A ALTURA:");
		altura = ler.nextDouble();
		System.out.println("INSIRA O PESO:");
		peso = ler.nextDouble();
		
		//processamento
		imc = peso/(altura*altura);
		
		if (imc<18.5) {
			
			System.out.println("IMC = " + imc);
			System.out.println("Excesso de magreza");
			
		}//fim do if
		else if (imc>=18.5 && imc<25) {
			
			System.out.println("IMC = " + imc);
			System.out.println("Peso normal");
			
		
		}//fim do else if
		else if (imc>=25 && imc<30) {
			
			System.out.println("IMC = " + imc);
			System.out.println("Excesso de peso");
		
		}//fim do else if
		else if (imc >=30 && imc<35) {
			
			System.out.println("IMC = " + imc);
			System.out.println("Obesidade (grau 1)");
		
		}//fim do else if
		else if (imc>=35 && imc<=40) {
			
			System.out.println("IMC = " + imc);
			System.out.println("Obesidade (grau 2)");
		
		}//fim do else if
		else {
			
			System.out.println("IMC = " + imc);
			System.out.println("Obesidade (grau 3)");
		
		}//fim do else
		ler.close();
	}//fim do metodo main
}//fim do class
