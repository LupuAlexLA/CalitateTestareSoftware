package designPattern.creational.prototype.vers1;

public class TestPrototypeVers1 {
    public static void main(String[] args) {
        ITaskSimulare t = new TaskSimulare("CRUD backend", 2);

        ITaskSimulare t1 = t.duplica();
        ITaskSimulare t2 = t.duplica();
        ITaskSimulare t3 = t.duplica();

        System.out.println(t.toString());
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
    }
}
