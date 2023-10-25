package asigurare.builder;

public class TestBuilder {
    public static void main(String[] args) {
        ContractAsigurareBuilder builder = new ContractAsigurareBuilder("Popescu Ion");
        ConfigurareContractAsigurari configurator = new ConfigurareContractAsigurari(builder);
        configurator.build();
        ContractAsigurare contract = configurator.getContract();
    }
}
