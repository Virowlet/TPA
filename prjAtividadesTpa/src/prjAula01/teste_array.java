package prjAula01;

import java.util.Scanner;

public class teste_array {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int [] num = {1,2,3,4,5};

        System.out.println("Insira uma letra de a até e");
        String t = ler.next();
        char letra = t.charAt(0);

        switch (letra){
            case 'a':
                System.out.println(num[0]);
                break;
            case 'b':
                System.out.println(num[1]);
                break;
            case 'c':
                System.out.println(num[2]);
                break;
            case 'd':
                System.out.println(num[3]);
                break;
            case 'e':
                System.out.println(num[4]);
                break;
            default:
                System.out.println("Letra inválida ou maiúscula!");
        }
        ler.close();
    }
}
