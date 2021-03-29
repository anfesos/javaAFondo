package co.com.aprendiendojava.javaafondo.cap01;;

import java.util.Scanner;

public class HolaMundoNombre {
	public static void main(String[] args) {

		//esta calse permite leer datos por teclado
		Scanner scanner = new Scanner(System.in);

		//mensaje para el usuario
		System.out.print("Ingrese Nombre, edad y altura:");

		//Se espera que ingrese la información en consola con el teclado

		//Leemos el nombre
		String nombre = scanner.nextLine();

		//Leemos la edad
		int edad = scanner.nextInt();

		//Leemos la altura
		double altura = scanner.nextDouble();
		
		System.out.println("Nombre: " + nombre
				+ " , edad: " + edad + " , altura: " + altura);
	}
}
