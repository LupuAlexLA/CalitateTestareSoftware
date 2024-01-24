package designPattern.creational.prototype.vers2;

public class TaskBackend extends Task{
    public TaskBackend() {
        this.tip = "backend";
    }

    @Override
    void printare() {
        System.out.println("Task de tip " + this.tip);
    }
}
