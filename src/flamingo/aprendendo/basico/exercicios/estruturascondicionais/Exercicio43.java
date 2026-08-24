package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio43 {
        public static void main(String[] args) {
            int idade = 20;
            boolean temCarteirinhaEstudante = true;

            if (idade < 12 || temCarteirinhaEstudante) {
                System.out.println("43: Ingresso com preço de meia-entrada.");
            } else {
                System.out.println("43: Ingresso com preço de inteira.");
            }
        }
    }

