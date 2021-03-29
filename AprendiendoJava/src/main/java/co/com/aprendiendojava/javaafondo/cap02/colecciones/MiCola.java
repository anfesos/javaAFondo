package co.com.aprendiendojava.javaafondo.cap02.colecciones;

public class MiCola <T> {

    private static final int CAPACIDAD_INICIAL = 5;
    private MiColeccion<T> coll = new MiColeccion<>(CAPACIDAD_INICIAL);

    public void encolar(T elm){
        //Agrega el elemento al final de la colección
        coll.agregar(elm);
    }

    public T desencolar(){
        //retorna y elimina de la colección el primer elemento
        return coll.eliminar(0);
    }
}
