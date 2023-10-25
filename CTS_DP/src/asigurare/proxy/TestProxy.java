package asigurare.proxy;

public class TestProxy {
    public static void main(String[] args) {
        IContract contract1 = new ProxyContract("RCA", "Manolache Marian");
        IContract contract2 = new ProxyContract("Casco", "Marinescu Maria");

        contract1.multiplicareContract();
        contract1.multiplicareContract();
        contract2.multiplicareContract();
        contract1.multiplicareContract();
        contract2.multiplicareContract();
    }
}
