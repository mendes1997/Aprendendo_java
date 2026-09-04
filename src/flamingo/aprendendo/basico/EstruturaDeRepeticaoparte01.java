package flamingo.aprendendo.basico;

import  java.util.Scanner;

public class EstruturaDeRepeticaoparte02 {
    static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("digite qual tabuada voce quer calcular: ");
        int numero = SC.nextInt();

        int i = 1;
        System.out.println("\n=== tabuada do " + numero + "===");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + "x" + i + "=" + resultado);

        }
        SC.close();
    }
}




