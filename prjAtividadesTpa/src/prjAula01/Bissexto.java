package prjAula01;

import java.util.Scanner;
public class Bissexto {
    public static void main(String args[]){
	Scanner ler = new Scanner (System.in);
	int anoI,anoF,i,anoB=0;
	System.out.println("Insira o ano inicial");
	anoI = ler.nextInt();
	System.out.println("Insira o ano final");
	anoF = ler.nextInt();
	i = anoF-anoI;
	while(i>=0){
		if(anoI%4==0){
		   System.out.println(anoI +" é bissexto!");
                                anoB++;
		}
                            anoI++;
		i--;
	}
    System.out.println(anoB + "anos são bissextos!");
	ler.close();
    }
}


