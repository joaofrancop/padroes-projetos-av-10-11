package questao2;

public class PerfilConveniado implements PerfilCobranca {
    public static final int MINUTOS_GRATUITOS = 30;
    public static final double VALOR_POR_HORA_INICIADA = 10.00;
    public static final double DESCONTO_PERCENTUAL = 15.0;

    @Override
    public double calcularValor(int minutosPermanencia) {
        if (minutosPermanencia <= MINUTOS_GRATUITOS) {
            return 0.0;
        }
        int minutosCobrados = minutosPermanencia - MINUTOS_GRATUITOS;
        int horasIniciadas = (minutosCobrados + 59) / 60;
        double valorHoraComDesconto = VALOR_POR_HORA_INICIADA * (1.0 - DESCONTO_PERCENTUAL / 100.0);
        return horasIniciadas * valorHoraComDesconto;
    }

    @Override
    public String getNomePerfil() {
        return "Conveniado";
    }
}
