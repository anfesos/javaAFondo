package co.com.aprendiendojava.javaafondo.cap02.colecciones;

import java.util.Scanner;

public class TestMiColeccion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Creo una coleccion con capacidad inicial = 5
        MiColeccion<String> mc = new MiColeccion<>(5);

        //Leo el primer nombre
        System.out.println("Ingrese Nombre: ");
        String nom = scanner.next();

        while (!nom.equals("FIN")) {
            //Inserto siempre en la posicion cero
            mc.insertar(nom, 0);

            //Leo el siguiente nombre
            nom = scanner.next();
        }

        String aux;

        //recorro la coleccion y tomo cada uno de sus elementos
        for (int i = 0; i < mc.cantidad(); i++) {
            //No es necesario castear porque el metodo obtener
            //retorna un String

            aux = mc.obtener(i);

            System.out.println(aux + " - " + aux.length() + " caracteres");
        }
    }
}
