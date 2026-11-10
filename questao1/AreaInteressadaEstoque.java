package questao1;

public interface AreaInteressadaEstoque {
    void notificarAlteracaoEstoque(String nomeProduto, int quantidadeAnterior, int quantidadeNova);

    String getNomeArea();
}
