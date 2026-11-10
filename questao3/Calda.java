package questao3;

public class Calda extends ComplementoDecorator {
    public static final double PRECO = 1.80;

    public Calda(Bebida bebidaBase) {
        super(bebidaBase);
    }

    @Override
    public String getDescricao() {
        return bebidaBase.getDescricao() + ", Calda";
    }

    @Override
    public double getPreco() {
        return bebidaBase.getPreco() + PRECO;
    }
}
