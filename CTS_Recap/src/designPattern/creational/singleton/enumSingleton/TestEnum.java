package designPattern.creational.singleton.enumSingleton;

public class TestEnum {
    public static void main(String[] args) {
        Agentie primaAgentie = Agentie.instanta;
        Agentie aDouaAgentie = Agentie.instanta;

        System.out.println(primaAgentie.getNumeAgentie());
        System.out.println(aDouaAgentie.getNumeAgentie());
    }
}
