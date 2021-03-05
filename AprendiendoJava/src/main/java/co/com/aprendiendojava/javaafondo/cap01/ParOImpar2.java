package co.com.aprendiendojava.javaafondo.cap01;

import java.util.Scanner;

public class ParOImpar2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un valor entero: ");
		
		int valor = scanner.nextInt();
		
		int resto = valor%2;
		
		String mensaje = (resto == 0) ? " es Par": " es Impar";
		
		System.out.println("El número " + valor + mensaje);
	}
}
