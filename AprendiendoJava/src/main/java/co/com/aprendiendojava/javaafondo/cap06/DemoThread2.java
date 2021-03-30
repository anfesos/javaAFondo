package co.com.aprendiendojava.javaafondo.cap06;

public class DemoThread2 implements Runnable {

    private String nombre;

    public DemoThread2(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {

        try {
            int x = (int) (Math.random() * 5000);
            Thread.sleep(x);
            System.out.println("Soy : " + nombre + " (" + x + ")");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new DemoThread2("Pedro"));
        Thread t2 = new Thread(new DemoThread2("Pablo"));
        Thread t3 = new Thread(new DemoThread2("Juan"));

        t1.start();
        t2.start();
        t3.start();

        //Esperamos por la finalización de los tres hilos

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Final del programa !");
    }
}
