package designPattern.creational.prototype.vers2;

public class TaskFrontend extends Task{
    public TaskFrontend() {
        this.tip = "frontend";
    }

    @Override
    void printare() {
        System.out.println("Task de tip " + this.tip);
    }
}
