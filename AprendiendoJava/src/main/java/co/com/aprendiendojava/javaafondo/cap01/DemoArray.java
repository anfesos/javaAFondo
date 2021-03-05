package co.com.aprendiendojava.javaafondo.cap01;

import java.util.Scanner;

public class DemoArray {
    public static void main(String[] args) {
        // defino un array de 10 enteros
        int array[] = new int[10];

        //leemos por teclado
        Scanner scanner = new Scanner(System.in);

        //Leo el primer valor
        System.out.println("Ingrese un valor (0=>fin): ");
        int valor = scanner.nextInt();

        int i=0;

        //Mientras valor sea distinto de certo AND i sea menor que 10
        // != distinto
        // && Operador lógico "and"
        while(valor!=0 && i<10){
            //asigna valor en array[i] y luego incrementa el valor de i
            array[i++] = valor;

            //leo el siguiente valor
            System.out.println("Ingrese el siguiente valor (0=>fin): ");
            valor = scanner.nextInt();
        }

        //Recorro el array mostrando su contenido
        for(int j=0; j<i; j++){
            System.out.println(array[j]);
        }
    }
}
