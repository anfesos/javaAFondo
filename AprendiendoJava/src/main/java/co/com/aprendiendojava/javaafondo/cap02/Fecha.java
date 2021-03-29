package co.com.aprendiendojava.javaafondo.cap02;

public class Fecha {
    /*
    NOTA: Por transitividad todas las clases heredan de la clase base object
     */
    private int dia;
    private int mes;
    private int anio;

    //Contructor

    public Fecha(){

    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    //Sobreescribimos el constructor fecha
    public Fecha(String fecha){
        int pos1=fecha.indexOf('/');
        int pos2=fecha.lastIndexOf('/');

        String sDia= fecha.substring(0,pos1);
        dia = Integer.parseInt(sDia);

        String sMes = fecha.substring(pos1+1,pos2);
        mes = Integer.parseInt(sMes);

        String sAnio = fecha.substring(pos2+1);
        anio = Integer.parseInt(sAnio);
    }

    //Retorna la fecha expresada en días
    private int fechaToDias(){
        return anio*360+mes*30+dia;
    }

    //Asigna la fecha expresada en dias a los atributos
    private void diasToFecha(int i){
        //dividimos por 360 y obtenemos el año
        anio = (int)i/360;

        //del restpo de la división anterior
        //podremos obtener el mes y el día
        int resto = i%360;

        //El mes es el resto divido 30
        mes = (int) resto/30;

        //El resto de la división anterior son los dias
        dia = resto % 30;

        //Ajuste por si el día quedo en cero
        if(dia == 0){
            dia=30;
            mes--;
        }

        //Ajuste por si el mes quedo en cero
        if(mes==0){
            mes=12;
            anio--;
        }

    }

    public void addDias(int d){
        // convierto la fecha dias y le sumo d

        int sum=fechaToDias()+d;

        //La fecha resultante (sum La separo en dia, mes y año)
        diasToFecha(sum);
    }

    //Sobreescribimos el método toString

    public String toString() {
        return dia+"/"+mes+"/"+anio;
    }

    //Sobreescribimos el método equals
    public boolean equals(Object object){
        Fecha otra = (Fecha) object;
        return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
    }

    /*Metodos getter and setters
        Tambien son llamados métodos de acceso o accessor methods
         */
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
