package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private final String nome;
    private int quantidadeEstoque;
    private final List<AreaInteressadaEstoque> areasInteressadas = new ArrayList<>();

    public Produto(String nome, int quantidadeInicial) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeInicial;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void incluirArea(AreaInteressadaEstoque area) {
        if (area != null && !areasInteressadas.contains(area)) {
            areasInteressadas.add(area);
        }
    }

    public void removerArea(AreaInteressadaEstoque area) {
        areasInteressadas.remove(area);
    }

    public void alterarQuantidadeEstoque(int novaQuantidade) {
        if (novaQuantidade == quantidadeEstoque) {
            return;
        }
        int quantidadeAnterior = quantidadeEstoque;
        quantidadeEstoque = novaQuantidade;
        for (AreaInteressadaEstoque area : areasInteressadas) {
            area.notificarAlteracaoEstoque(nome, quantidadeAnterior, quantidadeEstoque);
        }
    }
}
