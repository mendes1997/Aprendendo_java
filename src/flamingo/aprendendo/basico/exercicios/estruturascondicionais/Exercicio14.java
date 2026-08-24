package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio14 {

        public static void main(String[] args) {
            boolean emailCorreto = true;
            boolean senhaCorreta = true;

            if (emailCorreto && senhaCorreta) {
                System.out.println("14: Login realizado com sucesso.");
            } else {
                System.out.println("14: Email ou senha inválidos.");
            }
        }
    }

