package faccatjailson;

import java.util.Scanner;

public class sucessor {
    static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
        System.out.println("programar suscessor");
        System.out.println("digite um valor para saber o seu sucesso");
        int numero = sc.nextInt();
        int sucessor = numero + 1;

        System.out.println("o numero do valor digitado é: " + sucessor);

        sc.close();
    }
}





