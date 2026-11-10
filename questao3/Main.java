package questao3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Questao 3 - Pedido de Cafe\n");

        Bebida pedido1 = new Espresso();
        pedido1 = new Leite(pedido1);
        pedido1 = new Calda(pedido1);
        imprimirPedido(pedido1);

        Bebida pedido2 = new Cha();
        pedido2 = new Chantilly(pedido2);
        imprimirPedido(pedido2);

        Bebida pedido3 = new Espresso();
        pedido3 = new Leite(pedido3);
        pedido3 = new Leite(pedido3);
        pedido3 = new Chantilly(pedido3);
        imprimirPedido(pedido3);
    }

    private static void imprimirPedido(Bebida pedido) {
        System.out.println(pedido.getDescricao() + " = R$ " + String.format("%.2f", pedido.getPreco()));
        System.out.println();
    }
}
