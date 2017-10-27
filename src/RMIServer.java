import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer{
	private static final int portNr = 8086;
	private Registry registry = null;
	private RemoteObject effectenBeurs = null;

	public static void main(String[] args) throws RemoteException
	{
		RMIServer rmiServer = new RMIServer();
	}

	public RMIServer() throws RemoteException
	{
		effectenBeurs = new RemoteObject();
		registry = LocateRegistry.createRegistry(portNr);
		registry.rebind("registryName", effectenBeurs);
	}


}

