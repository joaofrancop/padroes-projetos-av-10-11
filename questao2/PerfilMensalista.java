package questao2;

public class PerfilMensalista implements PerfilCobranca {
    public static final double VALOR_FIXO = 120.00;

    @Override
    public double calcularValor(int minutosPermanencia) {
        return VALOR_FIXO;
    }

    @Override
    public String getNomePerfil() {
        return "Mensalista";
    }
}
