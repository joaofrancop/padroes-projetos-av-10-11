package questao1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Questao 1 - Monitor de Estoque\n");

        Produto notebook = new Produto("Notebook Gamer", 12);

        AreaCompras compras = new AreaCompras();
        AreaVendas vendas = new AreaVendas();
        AreaAuditoria auditoria = new AreaAuditoria();

        notebook.incluirArea(compras);
        notebook.incluirArea(vendas);
        notebook.incluirArea(auditoria);

        notebook.alterarQuantidadeEstoque(8);
        System.out.println();
        notebook.alterarQuantidadeEstoque(3);
        System.out.println();
        notebook.alterarQuantidadeEstoque(3);
        System.out.println("(mesma quantidade, sem notificacao)\n");
        notebook.alterarQuantidadeEstoque(0);
        System.out.println();
        notebook.alterarQuantidadeEstoque(15);
        System.out.println();

        System.out.println("Removendo area Vendas");
        notebook.removerArea(vendas);
        notebook.alterarQuantidadeEstoque(2);
    }
}
