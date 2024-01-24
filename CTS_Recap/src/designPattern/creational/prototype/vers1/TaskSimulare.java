package designPattern.creational.prototype.vers1;

public class TaskSimulare implements ITaskSimulare{
    private String denumire;
    private int durata;
    public TaskSimulare(String denumire, int durata) {
        this.denumire = denumire;
        this.durata = durata;
    }
    @Override
    public String toString() {
        return "TaskSimulare{" +
                "denumire='" + denumire + '\'' +
                ", durata=" + durata +
                '}';
    }
    @Override
    public ITaskSimulare duplica() {
        try {
            return (ITaskSimulare) super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
