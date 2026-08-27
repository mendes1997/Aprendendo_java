package flamingo.aprendendo.faccat;
import java.util.Scanner

public class Exercicio06 {
    //6 escreva um algoritimo para ler as dimesões de um retangulo (base e altura),calcular e
    // escrever do retangulo
    static void main(String[] args) {
        double altura, base,area;
        Scanner SC = new Scanner(System.in);

        System.out.println("didie a base do retangulo:");
        base = SC.nextDouble();

        System.out.println("digite a altura do retangulo:");
        altura = SC.nextDouble();

        area = base * altura;

        System.out.printf("A area do retangulo = %.2f" , area);
        SC.close();
    }

}
