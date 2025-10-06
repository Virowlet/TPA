package prjAula01;

import java.util.Scanner;

public class SalarioIRPF {

	public static void main(String[] args) {
	 Scanner ler = new Scanner (System.in);
	 
	 //declaracao de variaveis
	 double salario,desconto;
	 
	 //atribuicao de valores
	 System.out.println("INSIRA O SALÁRIO:");
	 salario = ler.nextDouble();
	 
	 //processamento
	 if (salario<=1434.59) {
		 System.out.println("Sem desconto!");
	 }//fim do if
	 
	 else if (salario<=2150.00) {
		 desconto = (salario*7.5/100)-107.59;
		 System.out.println("Desconto IRPF = " + desconto);
	 }//fim do else if
	 
	 else if (salario<=2866.70) {
		 desconto = (salario*15/100)-268.84;
		 System.out.println("Desconto IRPF = " + desconto);
	 }//fim do else if
	 
	 else if (salario<=3582.00) {
		 desconto = (salario*22.5/100)-483.84;
		 System.out.println("Desconto IRPF = " + desconto);
	 }//fim do else if
	 
	 else {
		 desconto = (salario*27.5/100)-662.94;
		 System.out.println("Desconto IRPF = " + desconto);
	 }//fim do else
	 
	 ler.close();
	}//fim do metodo main
}//fim da class
