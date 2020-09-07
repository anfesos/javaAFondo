package cap01;

import java.util.Scanner;

public class HolaMundoNombre {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese Nombre, edad y altura:");
		String nombre = scanner.nextLine();
		int edad = scanner.nextInt();
		double altura = scanner.nextDouble();
		
		System.out.println("Nombre: " + nombre
				+ " , edad: " + edad + " , altura: " + altura);
	}
}
