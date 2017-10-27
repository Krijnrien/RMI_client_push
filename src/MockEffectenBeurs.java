import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MockEffectenBeurs extends UnicastRemoteObject implements IEffectenBeurs, Serializable {

    MockEffectenBeurs() throws RemoteException {
    }

    public void sendMessage(rmiObject _rmiObject) throws RemoteException {
        System.out.println(_rmiObject.getName() + _rmiObject.getX());
    }
}

