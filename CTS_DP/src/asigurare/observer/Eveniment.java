package asigurare.observer;

public class Eveniment extends Mediatizabil{
    private boolean isMedia = false;

    public void anuntareMedia() {
        if(isMedia == false) {
            isMedia = true;
            this.notificareObservatori();
        } else {
            isMedia = false;
        }
    }

    public void anuntMedia() {
        System.out.println("Anunt Media de interes privind firma X");
        anuntareMedia();
    }
}
