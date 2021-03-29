package co.com.aprendiendojava.javaafondo.cap05.mvc;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class MatrizModel implements TableModel {

    private Object[][] datos;

    public MatrizModel(Object[][] datos) {
        this.datos = datos;
    }

    @Override
    public int getRowCount() {
        return datos.length-1;
    }

    @Override
    public int getColumnCount() {
        return datos[0].length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return datos[0][columnIndex].toString();
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //La fila 0 corresponde a los header
        return datos[rowIndex+1][columnIndex];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}
