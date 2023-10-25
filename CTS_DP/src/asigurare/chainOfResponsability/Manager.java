package asigurare.chainOfResponsability;

public class Manager extends Handler{
    @Override
    public void procesareCerere(Alerta alerta) {

        if(alerta.getGrad() <= 10) {
            System.out.println("Manager a procesat alerta " + alerta.getMesaj());
        } else {
            System.out.println("Manager nu a putut procesa alerta " +
                    alerta.getMesaj() + " si trimite mai departe");
            if(this.succesor != null) {
                this.succesor.procesareCerere(alerta);
            }
        }
    }
}
