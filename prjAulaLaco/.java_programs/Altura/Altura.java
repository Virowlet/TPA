package prjAulaLaco;

public class Altura {

	public static void main(String[] args) {
		
		double j,p;
		int i;
		
		i = 0;
		j = 134;
		p = 145;
		
		do {
			j = j+2.5;
			p = p+2.0;
			i++;
		}while(j<p);
		System.out.println(i + " Anos");
	}//fim do metodo main
}//fim da class