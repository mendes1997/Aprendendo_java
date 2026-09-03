package flamingo.aprendendo.basico.etruturaswitch;

public class Postodecombostivel {
        public static void main(String[] args) {
            int tipoCombustivel = 1;
            double litros = 10.0;
            double valorTotal = 0.0;
            String nomeCombustivel = "";

            switch (tipoCombustivel) {
                case 1:
                    nomeCombustivel = "Gasolina";
                    valorTotal = litros * 5.89;
                    break;
                case 2:
                    nomeCombustivel = "Etanol";
                    valorTotal = litros * 3.99;
                    break;
                case 3:
                    nomeCombustivel = "Diesel";
                    valorTotal = litros * 6.19;
                    break;
                default:
                    System.out.println("Tipo de combustível inválido");
                    return;
            }

            System.out.println("Combustível escolhido: " + nomeCombustivel);
            System.out.println("Litros abastecidos: " + litros);
            System.out.println("Valor total: R$ " + valorTotal);
        }
    }



