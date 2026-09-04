package flamingo.aprendendo.basico.repeticao;

public class exercicio08 {
    static void main(String[] args) {
            int quantidadeprodutos = 5;
            double valorproduto = 20;
            double totalcompra = 0;

            int contador = 1;

            while (contador <= quantidadeprodutos) {
                totalcompra = totalcompra + valorproduto;
                contador++;
            }


            System.out.println("quantidade  de produtos: "+ quantidadeprodutos);
            System.out.println("valor de cada produto: r$ " + valorproduto);
        System.out.println("total da compra : r$ " + totalcompra);

        }
    }



