package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio39 {

        public static void main(String[] args) {
            double valorCompra = 180.0;

            double valorFrete = (valorCompra >= 150) ? 0.0 : 20.0;

            System.out.println("39: Valor do frete: R$ " + valorFrete);
        }
    }

