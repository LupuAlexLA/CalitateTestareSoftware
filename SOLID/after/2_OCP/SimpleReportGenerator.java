package implementare_solid_chat_gpt.after.OCP;

public class SimpleReportGenerator implements ReportGenerator{
    @Override
    public void generateReport(Car car) {
        System.out.println("Generating report for: " + car.getMake() + " " + car.getModel());
    }
}
