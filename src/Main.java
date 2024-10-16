public class Main {
    static Integer contador = 0;

    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        Contador c4 = new Contador();

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }

    public static synchronized void incrementarContador() {
        if (contador < 400) {
            contador++;
            System.out.println("Contador: " + contador);
        }
    }
}