package co.com.aprendiendojava.javaafondo.cap01;

import java.util.Scanner;

public class DemoArray2 {

    public static void main(String[] args) {

        /*Manejo de arrays
            Otras formas correctas y equivalentes de definir arrays
            String arr[];
            String []arr;
            String[] arr;

            Nota: Recordar de "definir" un array, no es lo mismo que "Crear(instanciar)"
                  Se instancia cuando se usa la palabra new, o se le asigna información inmediatamente
                  Se define cuando solo se indica el tipo y nombre de la variable
        */
        String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves"
                            ,"Viernes", "Sabado","Domingo"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un día de la semana (número): ");

        int valor = scanner.nextInt();

        if( valor <= dias.length){
            //Recordemos que los arrays se numeran desde cero
            System.out.println(dias[valor-1]);
        }else{
            System.out.println("Día incorrecto...");
        }
    }
}
