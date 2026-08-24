package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio44 {

        public static void main(String[] args) {
            boolean emailCorreto = true;
            boolean senhaCorreta = true;
            boolean contaAtiva = true;

            if (!contaAtiva) {
                System.out.println("44: Conta bloqueada");
            } else if (emailCorreto && senhaCorreta) {
                System.out.println("44: Login realizado");
            } else {
                System.out.println("44: Dados inválidos");
            }
        }
    }

