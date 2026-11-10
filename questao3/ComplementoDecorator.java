package questao3;

public abstract class ComplementoDecorator implements Bebida {
    protected final Bebida bebidaBase;

    protected ComplementoDecorator(Bebida bebidaBase) {
        this.bebidaBase = bebidaBase;
    }
}
