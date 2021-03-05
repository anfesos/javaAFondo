package co.com.aprendiendojava.javaafondo.cap01;

import java.util.Scanner;

public class ParOImpar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un valor entero: ");
		
		int valor = scanner.nextInt();

		//Obtenemos el resto de dividir valor por 2
		int resto = valor%2;
		
		if(resto == 0){
			System.out.println("El número " + valor + " es Par.");
		}else{
			System.out.println("El número " + valor + " es Impar.");
		}
	}

}
