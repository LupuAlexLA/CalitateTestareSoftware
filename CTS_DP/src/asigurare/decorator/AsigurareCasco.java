package asigurare.decorator;

public class AsigurareCasco extends DecoratorAsigurare{
    public AsigurareCasco(AsigurareAuto asigurareAuto) {
        super(asigurareAuto);
    }

    @Override
    public String getComponenteAsigurare() {
        return super.getComponenteAsigurare() + ", asigurare risc avarii";
    }

    @Override
    public float getCost() {
        return super.getCost() + 500;
    }
}
