package questao3;

public class Leite extends ComplementoDecorator {
    public static final double PRECO = 1.50;

    public Leite(Bebida bebidaBase) {
        super(bebidaBase);
    }

    @Override
    public String getDescricao() {
        return bebidaBase.getDescricao() + ", Leite";
    }

    @Override
    public double getPreco() {
        return bebidaBase.getPreco() + PRECO;
    }
}
