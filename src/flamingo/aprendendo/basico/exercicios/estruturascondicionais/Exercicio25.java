package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio25 {
        public static void main(String[] args) {
            int xp = 6000;

            if (xp < 1000) {
                System.out.println("25: Iniciante");
            } else if (xp <= 4999) {
                System.out.println("25: Intermediário");
            } else if (xp <= 9999) {
                System.out.println("25: Avançado");
            } else {
                System.out.println("25: Lendário");
            }
        }
    }

