package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio23 {

        public static void main(String[] args) {
            double salario = 2500.0;

            if (salario <= 1500) {
                System.out.println("23: Salário baixo");
            } else if (salario <= 3000) {
                System.out.println("23: Salário médio");
            } else if (salario <= 7000) {
                System.out.println("23: Salário bom");
            } else {
                System.out.println("23: Salário alto");
            }
        }
    }

