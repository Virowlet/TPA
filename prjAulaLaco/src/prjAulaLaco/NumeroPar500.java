package prjAulaLaco;


public class NumeroPar500 {
	public static void main(String[] args) {
		
		int i;
		
		i=1;
		
		do {
			if (i%2==0) {
				System.out.print(i);
			}
			else {
				System.out.print(" ");
			}
			i++;
		}while(i<=500);
	}//fim do metodo main
}//fim da class
