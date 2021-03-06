package co.com.aprendiendojava.javaafondo.cap02;

import java.util.Scanner;

public class TestFecha4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //El usuario ingresa los datos de la fecha
        System.out.println("Ingrese Fecha (dd/mm/aaaa): ");

        //Leo la fecha (Cadena de caracteres) ingresada
        String sFecha = scanner.next();

        //Creo un objeto de la clase Fecha
        Fecha f = new Fecha(sFecha);

        //Lo muestro
        System.out.println("La fecha ingresada es: " + f);

        //El usuario ingresa una cantidad de dias a sumar
        System.out.println("Ingrese dias a sumar (puede ser negativo)");

        int diasSum = scanner.nextInt();

        //Le sumo esos días a la fecha
        f.addDias(diasSum);

        //Muestro la nueva fecha (Con los días sumados)
        System.out.println("Sumando " + diasSum + " dias, queda: " + f);
    }
}
