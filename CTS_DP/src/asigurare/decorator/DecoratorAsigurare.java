package asigurare.decorator;

public abstract class DecoratorAsigurare extends AsigurareAuto{
    protected final AsigurareAuto asigurareAuto;

    public DecoratorAsigurare(AsigurareAuto asigurareAuto) {
        this.asigurareAuto = asigurareAuto;
    }

    @Override
    public String getComponenteAsigurare() {
        return asigurareAuto.getComponenteAsigurare();
    }

    @Override
    public float getCost() {
        return asigurareAuto.cost;
    }
}
