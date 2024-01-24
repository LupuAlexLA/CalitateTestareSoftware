package designPattern.creational.prototype.vers3;

public class WoodBlock extends BuildingBlock {
    private byte[] texture;

    public WoodBlock() throws InterruptedException {
        System.out.println("Loading texture...");
        Thread.sleep(3000);
        texture = new byte[] {10, 20, 30};
    }

    @Override
    public void render() {
        System.out.printf("Rendering wood block at x=%d y=%d z=%d", getX(), getY(), getZ());
        System.out.println();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        WoodBlock copy = (WoodBlock) super.clone();
        // daca fac asa: copy.texture = texture fac shallow copy;
        copy.texture = new byte[texture.length];
        for(int i = 0; i < texture.length; i++) {
            copy.texture[i] = texture[i];
        }
        return copy;
    }
}
