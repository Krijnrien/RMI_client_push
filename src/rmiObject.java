public class rmiObject implements IrmiObject {
    private String name;
    private int x;

    rmiObject(String name, int x) {
        this.name = name;
        this.x = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public int getX() {
        return x;
    }

    public void setX(int _x) {
        this.x = _x;
    }
}