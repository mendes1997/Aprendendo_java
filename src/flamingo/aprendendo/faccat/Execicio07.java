package flamingo.aprendendo.faccat;

import java.util.Scanner;

public class Execicio07 {
    //7) faça um algaritmo que leia a idade de uma pessoa expressa em anos , meses e dias e escreva
    //a idade dessa pessao expressa apenas em dias. considerar ano com 365 dias e mes com 30 dias.
    public static void main(String[] args) {

        Byte dias,meses, idade;
        int diasdeVida;

        Scanner SC = new Scanner(System.in);

        System.out.println("digite a sua idade para descobrir quantos dias voce viveu: ");
        idade = SC.nextByte();

        System.out.println("quantos meses adicionais?: ");
        meses = SC.nextByte();


        System.out.println("quantos dias adicionais? ");
        dias = SC.nextByte();

        diasdeVida = (idade * 365) + (meses + 30) + dias;

        System.out.printf("voce tem %d = anos = %d dias de vida.",idade,diasdeVida);



        SC.close();
    }
}
