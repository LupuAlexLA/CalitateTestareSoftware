package designPattern.creational.prototype.vers2;

public abstract class Task implements Cloneable{
    private String id;
    protected String tip;
    abstract void printare();
    public String getTip() {
        return tip;
    }
    public void setTip(String tip) {this.tip = tip;}
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        return clone;
    }
    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", tip='" + tip + '\'' +
                '}';
    }
}
