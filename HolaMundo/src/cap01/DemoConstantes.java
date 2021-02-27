package cap01;

import java.util.Scanner;

public class DemoConstantes {
	
	// Definici�n de constantes
	public static final int LUNES = 1;
	public static final int MARTES = 2;
	public static final int MIERCOLES = 3;
	public static final int JUEVES = 4;
	public static final int VIERNES = 5;
	public static final int SABADO = 6;
	public static final int DOMINGO = 7;
	
	public static void main(String[] args) {
		System.out.println("Ingrese un d�a de la semana(n�mero): ");
		Scanner scanner = new Scanner(System.in);
		int valor = scanner.nextInt();
		String dia = "";
		
		switch(valor){
		case LUNES:
			dia = "Lunes";
			break;
		case MARTES:
			dia = "Martes";
			break;
		case MIERCOLES:
			dia = "Miercoles";
			break;
		case JUEVES:
			dia = "Jueves";
			break;
		case VIERNES:
			dia = "Viernes";
			break;
		case SABADO:
			dia = "Sabado";
			break;
		case DOMINGO:
			dia = "Domingo";
			break;
		default:
			System.out.println("D�a incorrecto... Ingrese un valor entre 1 y 7.");
			break;
		}
		
		System.out.println(dia);
		
	}

}
