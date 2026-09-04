package flamingo.aprendendo.basico.repeticao;

public class exercicio07 {
    static void main(String[] args) {
        int quantidadevendas = 8;
        double valorvenda = 50;
        double faturamentototal = 0;

        for (int i = 1; i <= quantidadevendas; i++) {
            faturamentototal =  faturamentototal + valorvenda;
        }
        System.out.println("quantidade  de vendas: "+ quantidadevendas);
        System.out.println("faturamento total: r$ " + faturamentototal);

    }
}
