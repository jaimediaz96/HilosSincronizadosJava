package hilossincronizados;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JAIME EDUARDO DIAZ TOBON
 */
public class HilosVarios extends Thread {
    
    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Ejecutando hilo: " + getName());
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                Logger.getLogger(HilosVarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
