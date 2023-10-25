package asigurare.decorator;

public class AsigurareCascoFurt extends DecoratorAsigurare{
    public AsigurareCascoFurt(AsigurareAuto asigurareAuto) {
        super(asigurareAuto);
    }

    @Override
    public String getComponenteAsigurare() {
        return super.getComponenteAsigurare() + ", asigurare risc avarii, asigurare furt";
    }

    @Override
    public float getCost() {
        return super.getCost() + 1000;
    }
}
