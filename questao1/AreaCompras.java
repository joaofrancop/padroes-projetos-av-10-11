package questao1;

public class AreaCompras implements AreaInteressadaEstoque {
    private static final int LIMITE_ESTOQUE_BAIXO = 5;

    @Override
    public void notificarAlteracaoEstoque(String nomeProduto, int quantidadeAnterior, int quantidadeNova) {
        System.out.println("Compras: " + nomeProduto + ", quantidade " + quantidadeNova);
        if (quantidadeNova < LIMITE_ESTOQUE_BAIXO) {
            System.out.println("ALERTA Compras: estoque abaixo de " + LIMITE_ESTOQUE_BAIXO);
        }
    }

    @Override
    public String getNomeArea() {
        return "Compras";
    }
}
