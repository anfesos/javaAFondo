package co.com.aprendiendojava.javaafondo.cap02.colecciones;

public class MiPila <T>{
    //LA capacidad inicial la harcodeamos en esta constante
    private static final int CAPACIDAD_INICIAL = 5;

    //Instancio la colección que mantendra los datos de la pila
    private MiColeccion<T> coll = new MiColeccion<>(CAPACIDAD_INICIAL);

    //eL método apilar recibe un parametro de tipo T
    public void apilar(T elm){
        coll.insertar(elm,0);
    }

    //El método desapilar retorna un elemento de tipo T
    public T desapilar(){
        return coll.eliminar(0);
    }
}
