package flamingo.aprendendo.basico.repeticao;

import java.util.Scanner;

public class exercicio10 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        {
            int opcao;

            do {
                System.out.println("1 - cadastrar usuario");
                System.out.println("2 - lista usuario");
                System.out.println("3 - sair");

                System.out.println("digite uma opcao: ");
                opcao = scanner.nextInt();

            } while (opcao != 3);
            System.out.println("sistema encerrado");


            scanner.close();


        }
    }

}