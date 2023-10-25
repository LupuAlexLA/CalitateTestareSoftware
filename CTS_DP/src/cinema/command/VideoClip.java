package cinema.command;

public class VideoClip implements IClip{
    @Override
    public void play() {
        System.out.println("Videoclipul a fost pornit");
    }

    @Override
    public void stop() {
        System.out.println("Videoclipul s-a terminat");
    }

    @Override
    public void pause() {
        System.out.println("Videoclipul este in pauza");
    }

    @Override
    public void resume() {
        System.out.println("Videoclipul a fost reluat");
    }
}
