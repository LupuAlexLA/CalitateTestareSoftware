package cinema.command;

public class Film implements IClip{
    @Override
    public void play() {
        System.out.println("Filmul a pornit");
    }

    @Override
    public void stop() {
        System.out.println("Filmul s-a terminat");
    }

    @Override
    public void pause() {
        System.out.println("Filmul e in pauza");
    }

    @Override
    public void resume() {
        System.out.println("Filmul a fost reluat");
    }
}
