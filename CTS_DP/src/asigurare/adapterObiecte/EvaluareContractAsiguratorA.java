package asigurare.adapterObiecte;

public class EvaluareContractAsiguratorA implements IEvaluareContractAsiguratorA {
    @Override
    public void analizaContractA(int costTotalAchizitii) {
        System.out.println("Metoda analiza Contract de catre Firma A");
        double costAsigurare = 0;
        costAsigurare = costTotalAchizitii * 0.05;
        System.out.println("Costul aferent contractului este " + costAsigurare);
    }
}
