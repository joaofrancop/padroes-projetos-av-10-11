package questao1;

public class AreaAuditoria implements AreaInteressadaEstoque {
    @Override
    public void notificarAlteracaoEstoque(String nomeProduto, int quantidadeAnterior, int quantidadeNova) {
        System.out.println("Auditoria: " + nomeProduto + " de " + quantidadeAnterior + " para " + quantidadeNova);
    }

    @Override
    public String getNomeArea() {
        return "Auditoria";
    }
}
