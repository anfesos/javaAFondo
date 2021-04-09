package co.com.aprendiendojava.javaafondo.cap06;

public class DemoThread3 {

    public static void main(String[] args) {
        MiThred t1 = new MiThred("Pablo");
        MiThred t2 = new MiThred("Pedro");

        t1.start();
        t2.start();
    }

    private static class MiThred extends Thread{

        String nom;

        public MiThred(String nom){
            this.nom = nom;
        }

        public void run(){
            for(int i = 0;i<5;i++){
                System.out.println(nom + " - " + i);
                //Con yield se cede el procesador al próximo thread que espera en cola
                yield();
            }
        }
    }
}
