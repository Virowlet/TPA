package prjAula02;

import java.util.Scanner;

public class MediaProva {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
	    double n1, n2, n3, n4, mi, ne, ex;
	    
	    System.out.println("INSIRA A 1a NOTA:");
	    n1 = ler.nextDouble();
	    System.out.println("INSIRA A 2a NOTA:");
	    n2 = ler.nextDouble();
	    System.out.println("INSIRA A 3a NOTA:");
	    n3 = ler.nextDouble();
	    System.out.println("INSIRA A 4a NOTA:");
	    n4 = ler.nextDouble();
	    
	    mi = (n1+n2+n3+n4)/4;
	    
	    if (mi<5) {
	    	System.out.println("Nota: "+ mi +" Reprovado" );
	    }//fim do if
	    else if (mi>=7) {
	    	System.out.println("Nota: "+mi +" Aprovado");
	    }//fim do else if
	    else {
	    	System.out.println("INSIRA A NOTA DE EXAME:");
		    ne = ler.nextDouble();
		    
		    ex = (mi+ne)/2;
		    
		    if (ex>=7) {
		    	System.out.println("Nota: "+ ex +" Aprovado em Exame");
		    }//fim do if
		    else {
		    	System.out.println("Nota: "+ ex +" Reprovado em Exameiqsu");
		    }//fim do else
		    
	    }//fim do else
	    ler.close();
	}//fim do metodo main
}//fim da class
