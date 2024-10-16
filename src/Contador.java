public class Contador extends Thread {
    @Override
    public void run() {
        while (true) {
            Main.incrementarContador();
            if (Main.contador >= 400) {
                break;
            }
        }
    }
}