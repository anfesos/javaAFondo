package co.com.aprendiendojava.javaafondo.cap06.prodcons;

public class Monitor {

    private char[] buff = null;
    private int tope = 0;

    private boolean lleno = false;
    private boolean vacio = true;

    public Monitor(int capacidad){
        buff = new char[capacidad];
    }

    public synchronized  void poner (char c) throws Exception{
        //Mientras el buffer este lleno me bloqueo para darle la
        //Posibilidad al consumidor de consumir algun caracter
        while(lleno){
            wait();
        }

        //Seccion critica
        buff[++tope] = c;

        vacio = false;
        lleno = tope >=buff.length;

        notifyAll();
    }

    public synchronized char sacar()throws Exception{
        //Mientras el buffer este vacio me bloqueo para darle la
        //Posiblidad al productor de producir algun caracter
        while(vacio){
            wait();
        }

        //Seccion Critica
        char c = buff[--tope];

        lleno = false;
        vacio = tope <= 0;

        notifyAll();

        return c;
    }
}
