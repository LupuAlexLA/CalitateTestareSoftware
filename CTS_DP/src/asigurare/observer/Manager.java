package asigurare.observer;

public class Manager implements Observator{
    @Override
    public void procesare() {
        System.out.println("Apelare director firma");
    }
}
