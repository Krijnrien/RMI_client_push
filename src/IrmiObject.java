import java.io.Serializable;

public interface IrmiObject extends Serializable {
    String getName();
    void setName(String _name);

    int getX();
    void setX(int _x);
}
