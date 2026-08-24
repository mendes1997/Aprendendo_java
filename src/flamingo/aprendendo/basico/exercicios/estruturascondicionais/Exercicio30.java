package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio30 {
        public static void main(String[] args) {
            int tipoCliente = 3;
            double valorCompra = 200.0;
            double desconto = 0.0;

            if (tipoCliente == 1) {
                desconto = 0.0;
            } else if (tipoCliente == 2) {
                desconto = 0.05;
            } else if (tipoCliente == 3) {
                desconto = 0.10;
            } else if (tipoCliente == 4) {
                desconto = 0.15;
            } else {
                System.out.println("30: Tipo de cliente inválido.");
                return; // Encerra o programa se o tipo for inválido
            }

            double valorFinal = valorCompra - (valorCompra * desconto);
            System.out.println("30: Valor final com desconto: R$ " + valorFinal);
        }
    }

