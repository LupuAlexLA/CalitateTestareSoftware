package designPattern.creational.prototype.vers3;

public class TestPrototypeVers3 {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        BuildingBlock block1 = new WoodBlock();
        block1.setX(0);
        block1.setY(0);
        block1.setZ(0);
        block1.render();

        BuildingBlock block2 = (BuildingBlock) block1.clone();
        block1.setX(1);
        block1.setY(1);
        block1.setZ(1);
        block1.render();
    }
}
