package asigurare.decorator;

public class AsigurareRCA extends AsigurareAuto{
    public AsigurareRCA(String denumire, float cost) {
        this.denumire = denumire;
        this.cost = cost;
    }

    @Override
    public String getComponenteAsigurare() {
        return "asigurare RCA obligatorie, asigurare carte verde";
    }

    @Override
    public float getCost() {
        return this.cost;
    }
}
