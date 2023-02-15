package hilossincronizados;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JAIME EDUARDO DIAZ TOBON
 */
public class HilosSincronizados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HilosVarios hilo1 = new HilosVarios();
        hilo1.start();
        try {
            hilo1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(HilosSincronizados.class.getName()).log(Level.SEVERE, null, ex);
        }
        HilosVarios hilo2 = new HilosVarios();
        hilo2.start();
        try {
            hilo2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(HilosSincronizados.class.getName()).log(Level.SEVERE, null, ex);
        }
        HilosVarios hilo3 = new HilosVarios();
        hilo3.start();
        try {
            hilo3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(HilosSincronizados.class.getName()).log(Level.SEVERE, null, ex);
        }
        HilosVarios hilo4 = new HilosVarios();
        hilo4.start();
        try {
            hilo4.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(HilosSincronizados.class.getName()).log(Level.SEVERE, null, ex);
        }
        HilosVarios hilo5 = new HilosVarios();
        hilo5.start();
        try {
            hilo5.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(HilosSincronizados.class.getName()).log(Level.SEVERE, null, ex);
        }
        HilosVarios hilo6 = new HilosVarios();
        hilo6.start();
        try {
            hilo6.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(HilosSincronizados.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Hilo del main");
    }
}