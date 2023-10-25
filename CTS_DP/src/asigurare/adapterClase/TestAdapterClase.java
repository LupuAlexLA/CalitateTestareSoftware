package asigurare.adapterClase;

public class TestAdapterClase {
    public static void main(String[] args) {
        int[] costuriAchizitii = new int[] {1000, 2000, 20000, 1000, 5000};
        Contract contract = new Contract("XYX S.A.", 5, costuriAchizitii);

        IEvaluareContractAsiguratorB evaluareContractB = new AdaptorEvaluareContract();
        evaluareContractB.analizaContractB(contract);
    }
}
