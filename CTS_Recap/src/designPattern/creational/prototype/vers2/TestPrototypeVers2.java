package designPattern.creational.prototype.vers2;

public class TestPrototypeVers2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        TaskBackend task1 = new TaskBackend();
        task1.setId("1");
        System.out.println(task1.toString());

        TaskFrontend task2 = new TaskFrontend();
        task2.setId("2");
        System.out.println(task2.toString());

        Task task3 = PrototypeFactory.getPrototip("backend");
        if(task3 != null) System.out.println(task3);

        Task task4 = PrototypeFactory.getPrototip("frontend");
        if(task4 != null) System.out.println(task4);
    }
}
