package flamingo.aprendendo.faccat;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        //8) Escreva um algoritmo para ler o  numero total de eleitores de um municipio,
        //o numero de votos brancos nulos e validos. calcular e  escrever o porcentual
        //que cada um representa em relacão ao total de eleitores

        Scanner SC = new Scanner(System.in);
        int totalEleitores,  votosbrancos, votosnulos, votosvalidos;
        double pecentualbranco,percentualnulos, percentualvalidos;

        System.out.print("digite o total de eleitores: ");
        totalEleitores = SC.nextInt();

        System.out.print("digite total de votos brancos: ");
        votosbrancos = SC.nextDouble();

        System.out.print("digite o total de votos nulos: ");
        votosnulos = SC.nextDouble();

        System.out.print("digite o total de votos validos: ");
        votosvalidos = SC.nextDouble();

        pecentualbranco = (votosbrancos / totalEleitores) * 100;
        percentualnulos = (votosnulos / totalEleitores) * 100;
        percentualvalidos =(votosvalidos / totalEleitores) * 100;

        System.out.printf("""
                ========total de %f votos ========
                | votos brancos = %f%%           |
                 votos nulos = %f%%              |
                 votos validos = %f%%            |
                
                ====================================
                """,totalEleitores,pecentualbranco,percentualnulos,percentualvalidos);

        SC.close();
    }
}
