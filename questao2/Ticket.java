package questao2;

public class Ticket {
    private final String placaVeiculo;
    private final int minutosPermanencia;
    private PerfilCobranca perfilCobranca;

    public Ticket(String placaVeiculo, int minutosPermanencia, PerfilCobranca perfilCobranca) {
        this.placaVeiculo = placaVeiculo;
        this.minutosPermanencia = minutosPermanencia;
        this.perfilCobranca = perfilCobranca;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public int getMinutosPermanencia() {
        return minutosPermanencia;
    }

    public void alterarPerfilCobranca(PerfilCobranca novoPerfil) {
        this.perfilCobranca = novoPerfil;
    }

    public double calcularValorAPagar() {
        return perfilCobranca.calcularValor(minutosPermanencia);
    }

    public String getNomePerfilAtual() {
        return perfilCobranca.getNomePerfil();
    }
}
