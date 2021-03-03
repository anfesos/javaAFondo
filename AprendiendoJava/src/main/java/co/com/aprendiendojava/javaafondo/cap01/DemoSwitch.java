package co.com.aprendiendojava.javaafondo.cap01;;

import java.util.Scanner;

public class DemoSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un valor (entero) de 1 a 7 :");
		
		String dia = "";
		
		int valorIngresado = scanner.nextInt();
		
		switch(valorIngresado){
		case 1:
			dia = "Lunes";
			break;
		case 2:
			dia = "Martes";
			break;
		case 3:
			dia = "Miercoles";
			break;
		case 4:
			dia = "Jueves";
			break;
		case 5:
			dia = "Viernes";
			break;
		case 6:
			dia = "Sabado";
			break;
		case 7:
			dia = "Domingo";
			break;
			default:
				System.out.println("Debe ingresar un valor de 1 a 7");
				break;
			
		}
		
		System.out.println("El día elegido es: " + dia);
	}

}
