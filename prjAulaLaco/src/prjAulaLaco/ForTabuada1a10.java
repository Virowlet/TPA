package prjAulaLaco;

public class ForTabuada1a10 {

	public static void main(String args[] ) {
		
		int i,p,n;
		
		for(i=1;i<=10;i++) {
			for(n=1;n<=10;n++) {
				p = i*n;
				System.out.println(i + " x " + n + " = " + p);
			}
			System.out.println("----------------");
		}
	}
}
