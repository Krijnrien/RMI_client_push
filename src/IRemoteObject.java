import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRemoteObject extends Remote {
    void sendMessage(rmiObject apple) throws RemoteException;
}
