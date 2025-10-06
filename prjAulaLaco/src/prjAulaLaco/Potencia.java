package prjAulaLaco;
import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int b,i,r,e;
		
		System.out.println("INSIRA A BASE:");
		b = ler.nextInt();
		System.out.println("INSIRA O EXPOENTE:");
		e = ler.nextInt();
		
		i=0;
		r=1;

			if (e==0) {
				r=b;
			}//fim do if
			else {
				do {
					r = r*b;
					i++;
				}while(i<e);
			}//fim do else
		System.out.println("Potência = "+ r);
		ler.close();
	}//fim do metodo main
}//fim da class