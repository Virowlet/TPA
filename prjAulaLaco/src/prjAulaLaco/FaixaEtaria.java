package prjAulaLaco;

import java.util.Scanner;

public class FaixaEtaria {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		 double id,f1,f2,f3,f4,f5,t;
		 int i;
		 f1 = 0;
		 f2 = 0;
		 f3 = 0;
		 f4 = 0;
		 f5 = 0;
		 t = 0;
		 do {
			 System.out.println("Insira uma idade:");
			 id = ler.nextInt();
			 if(id<=15) {
				 f1++;
				 t++;
			 }//fim do if
			 else if(id<=30) {
				 f2++;
				 t++;
			 }//fim do else if
			 else if(id<=45) {
				 f3++;
				 t++;
			 }//fim do else if
			 else if(id<=60) {
				 f4++;
				 t++;
			 }//fim do else if
			 else {
				 f5++;
				 t++;
			 }//fim do else
			 do {
				 System.out.println("Deseja continuar a execução? 1-Sim 2-Não");
				 i = ler.nextInt();
			 switch(i) {
			 case 1:
				 i = 1;
				 break;
			 case 2:
				 i = 2;
				 break;
		     default:
		    	 System.out.println("Inválido");
		    	 i = 0;
		    	 break;
			 }//fim do switch
			 }while(i==0);
		 }while(i==1);
		 System.out.println("Quantidade:");
		 System.out.println("1a Faixa etária = " + f1);
		 System.out.println("2a Faixa etária = " + f2);
		 System.out.println("3a Faixa etária = " + f3);
		 System.out.println("4a Faixa etária = " + f4);
		 System.out.println("5a Faixa etária = " + f5);
		 
		 f1 = (f1/t)*100;
		 f2 = (f2/t)*100;
		 f3 = (f3/t)*100;
		 f4 = (f4/t)*100;
		 f5 = (f5/t)*100;
		 
		 System.out.println("Porcentagem:");
		 System.out.println("1a Faixa etária = " + f1 + "%");
		 System.out.println("2a Faixa etária = " + f2 + "%");
		 System.out.println("3a Faixa etária = " + f3 + "%");
		 System.out.println("4a Faixa etária = " + f4 + "%");
		 System.out.println("5a Faixa etária = " + f5 + "%");
		 
		 ler.close();
	}//fim do metodo main
}//fim da class
