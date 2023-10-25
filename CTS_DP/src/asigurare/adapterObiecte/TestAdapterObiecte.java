package asigurare.adapterObiecte;

public class TestAdapterObiecte {
    public static void main(String[] args) {
        int[] costuriAchizitii = new int[] {1000, 2000, 20000, 1000, 5000};
        Contract contract = new Contract("XYX S.A.", 5, costuriAchizitii);

        EvaluareContractAsiguratorA evaluareAsiguratorA = new EvaluareContractAsiguratorA();
        AdaptorEvaluareContract evaluareContract = new AdaptorEvaluareContract(evaluareAsiguratorA);

        evaluareContract.analizaContractB(contract);
    }
}
