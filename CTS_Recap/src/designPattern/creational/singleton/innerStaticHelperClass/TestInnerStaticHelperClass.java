package designPattern.creational.singleton.innerStaticHelperClass;

public class TestInnerStaticHelperClass {
    public static void main(String[] args) {
        Agentie primaAgentie = Agentie.getInstanta("Niva", 1000, 4);
        Agentie aDouaAgentie = Agentie.getInstanta("NivaS", 100, 2);

        System.out.println(primaAgentie.getNumeAgentie());
        System.out.println(aDouaAgentie.getNumeAgentie());
    }
}
