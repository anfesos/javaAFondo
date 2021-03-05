package co.com.aprendiendojava.javaafondo.cap01;

import java.util.Scanner;

public class DemoMatriz {

    /*
    Tambien se puede definir una matriz por extensión así:

    int matriz[][] = { {3,2,1}
                      ,{5,3,7}
                      ,{1,9,2}
                      ,{4,5,6}};
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese cantidad de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese cantidad de columnas: ");
        int columnas = scanner.nextInt();

        //Creo una matriz de filas X columnas
        int matriz[][] = new int[filas][columnas];

        int numero;

        for(int i=0; i<filas;i++){
            for(int j=0; j<columnas;j++){
                //genero un número aleatorio entre 0 y 1000
                numero = (int)(Math.random()*1000);
                //asigno el número en la matriz
                matriz[i][j] = numero;
            }
        }

        for(int i=0; i<filas;i++){
            for(int j=0; j<columnas;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
