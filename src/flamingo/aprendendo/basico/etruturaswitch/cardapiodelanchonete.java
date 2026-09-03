package flamingo.aprendendo.basico.etruturaswitch;

public class cardapiodelanchonete {

        public static void main(String[] args) {
            int opcaoLanche = 1;
            int quantidade = 2;
            double valorTotal = 0.0;
            String nomeItem = "";

            switch (opcaoLanche) {
                case 1:
                    nomeItem = "Hambúrguer";
                    valorTotal = quantidade * 25.00;
                    break;
                case 2:
                    nomeItem = "Pizza";
                    valorTotal = quantidade * 40.00;
                    break;
                case 3:
                    nomeItem = "Batata frita";
                    valorTotal = quantidade * 18.00;
                    break;
                case 4:
                    nomeItem = "Refrigerante";
                    valorTotal = quantidade * 8.00;
                    break;
                case 5:
                    nomeItem = "Suco";
                    valorTotal = quantidade * 10.00;
                    break;
                default:
                    System.out.println("Opção inválida");
                    return;
            }

            System.out.println("Item escolhido: " + nomeItem);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Total do pedido: R$ " + valorTotal);
        }
    }

