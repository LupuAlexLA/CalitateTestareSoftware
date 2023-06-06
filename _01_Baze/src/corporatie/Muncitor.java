package corporatie;

public class Muncitor <T extends Firma> {
    T orice;

    public Muncitor(T orice) {
        this.orice = orice;
    }

    public void legitimeazaMuncitor() {
        orice.lucreaza();
        System.out.println(orice);
    }
}
