package implementare_solid_chat_gpt.after.SOLID;
// Serviciu de taxare simplu (OCP, LSP)
public class SimpleTaxService implements TaxService {
    @Override
    public double calculateTax(Car car) {
        return car.getType().equals("Electric") ? 100 : 200;
    }
}
