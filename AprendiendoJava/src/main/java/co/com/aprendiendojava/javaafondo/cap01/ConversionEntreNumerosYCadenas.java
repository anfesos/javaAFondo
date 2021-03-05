package co.com.aprendiendojava.javaafondo.cap01;

public class ConversionEntreNumerosYCadenas {

    /*
    1.5.9 Conversión entre números y cadenas

    Se debe utilizar las clases "wrappers"(Envoltorios)
    Estas clases permiten entre otras cosas:
    - Convertir entre cadenas y números
    - obtener expresiones numéricas en diferentes bases
    - etc

    tipo    -> Wrapper
    byte    -> Byte
    short   -> Short
    char    -> Character
    int     -> Integer
    long    -> Long
    float   -> Float
    double  -> Double
    boolean -> Boolean
     */

    public static void main(String[] args) {
        //Algunos ejemplos
        //Operaciones con el tipo int
        int i = 43;

        //Convierto de int a String
        String sInt = Integer.toString(i);

        //Convierto de String a Int
        int i2 = Integer.parseInt(sInt);

    }
}
