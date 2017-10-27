import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteObject extends UnicastRemoteObject implements IRemoteObject, Serializable {

    RemoteObject() throws RemoteException {
    }

    public void sendMessage(rmiObject _rmiObject) throws RemoteException {
        System.out.println(_rmiObject.getName() + _rmiObject.getX());
    }
}

