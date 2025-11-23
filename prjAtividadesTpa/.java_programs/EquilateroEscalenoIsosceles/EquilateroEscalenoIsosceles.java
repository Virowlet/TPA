package prjAula01;

import java.util.Scanner;

public class EquilateroEscalenoIsosceles {

	public static void main(String[] args) {
	 Scanner ler = new Scanner (System.in);
	 
	 //declaracao de variaveis
	 double a,b,c;
	 
	 //atribuicao de valores
	 System.out.println("INSIRA O VALOR DO LADO A:");
	 a = ler.nextDouble();
	 System.out.println("INSIRA O VALOR DO LADO B:");
	 b = ler.nextDouble();
	 System.out.println("INSIRA O VALOR DO LADO C:");
	 c = ler.nextDouble();
	 
	 //processamento
	 
	 if (a>=b+c || b>=a+c || c>=a+b) {
		 System.out.println("Não é possível fazer um triângulo!");
	 }//fim do if
	 
	 else if (a==b && b==c ) {
		 System.out.println("Os lados formam um triângulo Equilátero!");
	 }//fim do else if
	 
	 else if(a!=b && b!=c && a!=c) {
		 System.out.println("Os lados formam um triângulo Escaleno!");
	 }//fim do else if
	 
	 else {
		 System.out.println("Os lados formam um triângulo Isósceles!");
	 }//fim do else
	 
	 ler.close();
	}//fim do metodo main
}//fim da classe
