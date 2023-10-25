package cinema.composite;

public interface INod {
    public void printeazaDescriere(String spatii);
    public void adaugaNod(INod nod);
    public void stergeNod(INod nod);
    public INod getNod(int i);
}
