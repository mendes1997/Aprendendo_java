package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio41 {
        public static void main(String[] args) {
            double nota = 6.5;
            int presenca = 80;

            if (nota >= 7.0 && presenca >= 75) {
                System.out.println("41: Aprovado");
            } else if (nota >= 5.0 && nota < 7.0) {
                System.out.println("41: Recuperação");
            } else {
                System.out.println("41: Reprovado");
            }
        }
    }

