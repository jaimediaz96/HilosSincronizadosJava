package hilossincronizados;

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
        HilosVarios hilo2 = new HilosVarios();
        hilo2.start();
        HilosVarios hilo3 = new HilosVarios();
        hilo3.start();
        HilosVarios hilo4 = new HilosVarios();
        hilo4.start();
        HilosVarios hilo5 = new HilosVarios();
        hilo5.start();
        HilosVarios hilo6 = new HilosVarios();
        hilo6.start();
    }
}