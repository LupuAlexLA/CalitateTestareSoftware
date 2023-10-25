package asigurare.adapterObiecte;

public class AdaptorEvaluareContract implements IEvaluareContractAsiguratorB{

    IEvaluareContractAsiguratorA evaluareAsiguratorA;

    public AdaptorEvaluareContract(IEvaluareContractAsiguratorA evaluareAsiguratorA) {
        this.evaluareAsiguratorA = evaluareAsiguratorA;
    }

    @Override
    public void analizaContractB(Contract contract) {
        int total = 0;
        for(int i = 0; i < contract.getNrMasini(); i++) {
            total += contract.getCostAchizitie()[i];
        }
        evaluareAsiguratorA.analizaContractA(total);
    }
}
