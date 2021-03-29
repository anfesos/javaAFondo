package co.com.aprendiendojava.javaafondo.cap01;

public class DemoCaracteres3 {

    public static void main(String[] args) {
        char c;
        for(int i='A';i<='z';i++){
            //para asignar un int en un char debemos "Castear"
            c = (char) i;
            System.out.println(c);
        }
    }
}
