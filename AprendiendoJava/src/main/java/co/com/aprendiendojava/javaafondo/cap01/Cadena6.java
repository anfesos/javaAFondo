package co.com.aprendiendojava.javaafondo.cap01;

import java.util.Scanner;

public class Cadena6 {

    /*
    1.5.10 Representación numérica en diferentes bases
    Nota: A partir de JAva 7 se pueden representar números binarios anteponiendo el prefijo 0b 0 0B
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor entero: ");
        int v = scanner.nextInt();

        System.out.println("Valor Ingresado: " + v);
        System.out.println("Binario = " + Integer.toBinaryString(v));
        System.out.println("Octal = " + Integer.toOctalString(v));
        System.out.println("Hexadecimal = " + Integer.toHexString(v));

        System.out.print("Ingrese una base númerica: ");
        int b = scanner.nextInt();

        String sBaseN = Integer.toString(v,b);
        System.out.println(v + " en base("+b+") = " + sBaseN);

    }
}
