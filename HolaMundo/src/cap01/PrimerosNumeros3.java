package cap01;

import java.util.Scanner;

public class PrimerosNumeros3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valor = scanner.nextInt();
		
		for(int i= 1; i<= valor; i++){
			System.out.println("Valor iteración: " + i);
		}
	}
}
