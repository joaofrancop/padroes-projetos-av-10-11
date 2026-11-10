package questao1;

public class AreaVendas implements AreaInteressadaEstoque {
    @Override
    public void notificarAlteracaoEstoque(String nomeProduto, int quantidadeAnterior, int quantidadeNova) {
        System.out.println("Vendas: " + nomeProduto + ", quantidade " + quantidadeNova);
        if (quantidadeAnterior == 0 && quantidadeNova > 0) {
            System.out.println("ALERTA Vendas: produto voltou ao estoque");
        }
    }

    @Override
    public String getNomeArea() {
        return "Vendas";
    }
}
