package asigurare.chainOfResponsability;

public class BrokerAsigurari extends Handler{
    @Override
    public void procesareCerere(Alerta alerta) {
        if(alerta.getGrad() <= 5) {
            System.out.println("Broker Asigurari a procesat alerta " + alerta.getMesaj());
        } else {
            System.out.println("Broker Asigurari nu a putut procesa alerta " +
                    alerta.getMesaj() + " si trimite mai departe");
            if(this.succesor != null) {
                this.succesor.procesareCerere(alerta);
            }
        }
    }
}
