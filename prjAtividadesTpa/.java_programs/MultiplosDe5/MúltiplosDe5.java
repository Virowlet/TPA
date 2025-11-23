package prjAula01;


public class MúltiplosDe5 {

	public static void main(String[] args) {
		
		int i,s;
		s = 0;
		
		for(i=0;i<=400;i++) {
			if(i%5==0) {
				s = s+i;
			}
		}
		System.out.println("Somatória = " + s);

	}

}
