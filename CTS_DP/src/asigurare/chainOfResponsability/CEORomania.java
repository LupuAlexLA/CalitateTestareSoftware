package asigurare.chainOfResponsability;

public class CEORomania extends Handler{
    @Override
    public void procesareCerere(Alerta alerta) {
        System.out.println("CEO Romania a procesat alerta " + alerta.getMesaj());
    }
}
