package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio26 {
    public static void main(String[] args) {
        int statusPedido = 2;

        if (statusPedido == 1) {
            System.out.println("26: Pedido recebido");
        } else if (statusPedido == 2) {
            System.out.println("26: Pedido em preparação");
        } else if (statusPedido == 3) {
            System.out.println("26: Pedido enviado");
        } else if (statusPedido == 4) {
            System.out.println("26: Pedido entregue");
        } else {
            System.out.println("26: Status inválido");
        }
    }
}
