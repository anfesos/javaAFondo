package co.com.aprendiendojava.javaafondo.cap02;

import java.util.Scanner;

public class TestFecha3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //El usuario ingresa los datos de la fecha
        System.out.print("Ingrese Fecha1 (dia, mes, año): ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int anio = scanner.nextInt();

        //Se crea un objeto de la clase fecha
        Fecha fecha = new Fecha(dia,mes,anio);

        //El usuario ingresa los datos de una segunda fecha
        System.out.print("Ingrese Fecha2 (dia, mes, año): ");
        dia = scanner.nextInt();
        mes = scanner.nextInt();
        anio = scanner.nextInt();

        //Se crea un objeto de la clase fecha
        Fecha fecha2 = new Fecha(dia,mes,anio);

        System.out.println("Fecha 1 = " + fecha);
        System.out.println("Fecha 2 = " + fecha2);

        if(fecha.equals(fecha2)){
            System.out.println("Son iguales !");
        }else{
            System.out.println("Son distintas...");
        }
    }
}
