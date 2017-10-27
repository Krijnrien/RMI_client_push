import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IEffectenBeurs extends Remote {
    void sendMessage(rmiObject apple) throws RemoteException;
}
