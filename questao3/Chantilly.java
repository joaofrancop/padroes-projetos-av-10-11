package questao3;

public class Chantilly extends ComplementoDecorator {
    public static final double PRECO = 2.00;

    public Chantilly(Bebida bebidaBase) {
        super(bebidaBase);
    }

    @Override
    public String getDescricao() {
        return bebidaBase.getDescricao() + ", Chantilly";
    }

    @Override
    public double getPreco() {
        return bebidaBase.getPreco() + PRECO;
    }
}
