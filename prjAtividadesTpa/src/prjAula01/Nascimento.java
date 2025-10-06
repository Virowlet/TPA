package prjAula01;

import java.util.Scanner;

public class Nascimento {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int dataNas,anoAtual,id,i;
    
        do {
        	System.out.println("coloque o ano de nascimento");
            dataNas = in.nextInt();
            System.out.println("coloque o ano atual");
            anoAtual = in.nextInt();
            id = anoAtual-dataNas;
            System.out.println("A idade é:" + id);
            System.out.println("DESEJA CONTINUAR?");
            i = in.nextInt();
            in.close();
        }while(i!=0);
	}

}
