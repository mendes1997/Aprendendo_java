package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio16 {

        public static void main(String[] args) {
            double valorCompra = 250.0;

            if (valorCompra >= 200) {
                double valorFinal = valorCompra - (valorCompra * 0.10);
                System.out.println("16: Valor final com desconto: R$ " + valorFinal);
            } else {
                System.out.println("16: Valor original da compra: R$ " + valorCompra);
            }
        }
    }

