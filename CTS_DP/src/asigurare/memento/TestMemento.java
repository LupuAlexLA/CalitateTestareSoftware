package asigurare.memento;

public class TestMemento {
    public static void main(String[] args) {
        Broker broker = new Broker();
        Contract contract = new Contract("Ionescu Dorel");

        //salvare versiuni de contracte de catre broker
        contract.adaugaClauzeContractuale("Clauza 1");
        System.out.println(contract);
        contract.adaugaClauzeContractuale("Clauza 2");
        System.out.println(contract);
        broker.adaugareVersiune(contract.salvare());

        contract.adaugaClauzeContractuale("Clauza 3");
        System.out.println(contract);
        broker.adaugareVersiune(contract.salvare());

        //recuperare ultimele doua versiuni de contract salvate
        contract.refacereVersiuneContractAnterior(broker.recuperareUltimaVersiuneContract());
        System.out.println(contract);

        contract.refacereVersiuneContractAnterior(broker.recuperareUltimaVersiuneContract());
        System.out.println(contract);
    }
}
