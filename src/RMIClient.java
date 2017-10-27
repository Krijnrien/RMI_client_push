import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Timer;
import java.util.TimerTask;

public class RMIClient {
    private Registry registry;
    private IEffectenBeurs effectenBeurs;


    public static void main(String[] args) {
        RMIClient rmiClient = new RMIClient();
    }

    public RMIClient() {
        try {
            this.registry = LocateRegistry.getRegistry("localhost", 8086);
            effectenBeurs = (IEffectenBeurs) registry.lookup("registryName");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Timer timer = new Timer();
        //Set a timer to regenerate the stocks every minute
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    effectenBeurs.sendMessage(new rmiObject("test", 5));
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }, 0, 1000);
    }

}
