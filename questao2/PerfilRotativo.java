package questao2;

public class PerfilRotativo implements PerfilCobranca {
    public static final double VALOR_POR_HORA_INICIADA = 10.00;

    @Override
    public double calcularValor(int minutosPermanencia) {
        if (minutosPermanencia <= 0) {
            return 0.0;
        }
        int horasIniciadas = (minutosPermanencia + 59) / 60;
        return horasIniciadas * VALOR_POR_HORA_INICIADA;
    }

    @Override
    public String getNomePerfil() {
        return "Rotativo";
    }
}
