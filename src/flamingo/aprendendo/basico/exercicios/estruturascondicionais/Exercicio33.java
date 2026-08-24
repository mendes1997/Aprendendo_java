package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio33 {
        public static void main(String[] args) {
            double saldo = 150.00;
            double valorProduto = 100.00;

            String resultado = (saldo >= valorProduto) ? "Compra aprovada" : "Saldo insuficiente";

            System.out.println(resultado);
        }
    }

