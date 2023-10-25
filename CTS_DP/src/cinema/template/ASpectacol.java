package cinema.template;

public abstract class ASpectacol {
    public abstract void inchideUsaSala();
    public abstract void stingereLuminaSala();
    public abstract void pornireSpectacol();

    public void ruleazaSpectacol() {
        inchideUsaSala();
        stingereLuminaSala();
        pornireSpectacol();
    }
}
