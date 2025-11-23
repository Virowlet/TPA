package prjAulaLaco;

import java.util.Scanner;

public class ForIdadeAlturaPeso {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
			double a10e20, p, aMed, porcen40, a;
			int i, id, acima50, menorId, maiorId;
			 
			acima50 = 0;
			a10e20 = 0;
			aMed = 0;
			porcen40 = 0;
			menorId = 125;
			maiorId = 0;
			
			for(i=1;i<=25;i++) {
				System.out.println("Insira a idade da " + i + "a pessoa:");
				id = in.nextInt();
				System.out.println("Insira a altura da " + i + "a pessoa:");
				a = in.nextDouble();
				System.out.println("Insira o peso da " + i + "a pessoa:");
				p = in.nextDouble();
				if (id>=50) {
					acima50++;
				}
				else if(id>=10 && id<=20) {
					a10e20++;
					aMed = aMed + a;
				}
				if(p<40) {
					porcen40++;
				}
				if (id<=menorId) {
					menorId = id;
				}
				if (id>=maiorId) {
					maiorId = id;
				}
				in.close();
			}
			System.out.println("Quantidade de pessoas com idade acima de 50: " + acima50);
			if (a10e20==0) {
				System.out.println("Nenhuma pessoa com idade entre 10 e 20!");
			}
			else {
				aMed = aMed/a10e20;
				System.out.println("A média das alturas das pessoas com idade entre 10 e 20 anos: " + aMed);
			}
			porcen40 = (porcen40/25)*100;
			System.out.println("Porcentagem de pessoas com peso inferior a 40: " + porcen40 + "%");
			System.out.println("A menor idade registrada foi: " + menorId);
			System.out.println("A maior idade registrada foi: " + maiorId);
			in.close();
		}
}