package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio42 {

        public static void main(String[] args) {
            double saldo = 80.0;
            double valorProduto = 100.0;
            boolean clienteVip = true;

            if (saldo >= valorProduto) {
                System.out.println("42: Compra aprovada");
            } else if (clienteVip) {
                System.out.println("42: Compra aprovada pelo crédito VIP");
            } else {
                System.out.println("42: Compra recusada");
            }
        }
    }

