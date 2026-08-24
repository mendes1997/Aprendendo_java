package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio24 {
        public static void main(String[] args) {
            double temperatura = 22.0;

            if (temperatura < 15) {
                System.out.println("24: Frio");
            } else if (temperatura <= 25) {
                System.out.println("24: Agradável");
            } else if (temperatura <= 35) {
                System.out.println("24: Quente");
            } else {
                System.out.println("24: Muito quente");
            }
        }
    }

