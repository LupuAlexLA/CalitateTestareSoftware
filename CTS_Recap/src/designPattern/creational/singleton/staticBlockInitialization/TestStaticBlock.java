package designPattern.creational.singleton.staticBlockInitialization;

public class TestStaticBlock {
    public static void main(String[] args) {
        Agentie primaAgentie = Agentie.getInstance("Niva", 1000, 2);
        Agentie aDouaAgentie = Agentie.getInstance("SIF", 10000, 20);

        System.out.println(primaAgentie.getNumeAgentie());
        System.out.println(aDouaAgentie.getNumeAgentie());
    }
}
