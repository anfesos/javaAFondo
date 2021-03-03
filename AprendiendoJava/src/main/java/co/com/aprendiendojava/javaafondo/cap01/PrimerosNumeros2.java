package co.com.aprendiendojava.javaafondo.cap01;

import java.util.Scanner;

public class PrimerosNumeros2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int valor = scanner.nextInt();
		int i = 1;
		
		do{
			System.out.println("Valor iteración: " + i);
			i++;
		}
		while(i<=valor);

	}

}
