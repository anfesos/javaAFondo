package co.com.aprendiendojava.javaafondo.cap05.mvc;

import javax.swing.*;
import javax.swing.event.ListDataListener;

public class ArrayModel implements ListModel {

    private Object[] datos;

    public ArrayModel(Object[] datos) {
        this.datos = datos;
    }

    public Object getElementAt(int index) {
        return datos[index];
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }

    public int getSize(){
        return datos.length;
    }


}
