package prjAula02;

import java.util.Scanner;

public class PorcenMenorMaior {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a1, a2, a3, a4, a5;
		double pMe, pMa, me, ma;
		
		System.out.println("INSIRA A IDADE DO PRIMEIRO ALUNO:");
		a1 = ler.nextInt();
		System.out.println("INSIRA A IDADE DO SEGUNDO ALUNO:");
		a2 = ler.nextInt();
		System.out.println("INSIRA A IDADE DO TERCEIRO ALUNO:");
		a3 = ler.nextInt();
		System.out.println("INSIRA A IDADE DO QUARTO ALUNO:");
		a4 = ler.nextInt();
		System.out.println("INSIRA A IDADE DO QUINTO ALUNO:");
		a5 = ler.nextInt();
		
		me = 0;
		ma = 0;
		
		if (a1<18) {
			me++;
		}//fim do if
		else {
			ma++;
		}// fim do else
		if (a2<18) {
			me++;
		}//fim do if
		else {
			ma++;
		}// fim do else
		if (a3<18) {
			me++;
		}//fim do if
		else {
			ma++;
		}// fim do else
		if (a4<18) {
			me++;
		}//fim do if
		else {
			ma++;
		}// fim do else
		if (a5<18) {
			me++;
		}//fim do if
		else {
			ma++;
		}// fim do else
		
	System.out.println("A quantidade de alunos menores de idade é: " + me);
	System.out.println("A quantidade de alunos maiores de idade é: " + ma);
	
	pMe = (me/5) * 100;
	pMa = (ma/5) * 100;
	
	System.out.println("A porcentagem de alunos maiores de idade é: " + pMa + "%");
	System.out.println("A porcentagem de alunos menores de idade é: " + pMe + "%");
	
	ler.close();
	}// fim do metodo main
	
}//fim da class
