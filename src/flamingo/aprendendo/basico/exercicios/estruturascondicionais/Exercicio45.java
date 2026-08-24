package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio45 {
        public static void main(String[] args) {
            double valorCompra = 350.0;
            double percentualDesconto = 0.0;

            if (valorCompra <= 100) {
                percentualDesconto = 0.0;
            } else if (valorCompra <= 300) {
                percentualDesconto = 5.0;
            } else if (valorCompra <= 500) {
                percentualDesconto = 10.0;
            } else {
                percentualDesconto = 15.0;
            }


            double valorDesconto = valorCompra * (percentualDesconto / 100.0);
            double valorFinal = valorCompra - valorDesconto;


            System.out.println("45: Valor original: R$ " + valorCompra);
            System.out.println("45: Porcentagem de desconto: " + percentualDesconto + "%");
            System.out.println("45: Valor do desconto: R$ " + valorDesconto);
            System.out.println("45: Valor final da compra: R$ " + valorFinal);
        }
    }

