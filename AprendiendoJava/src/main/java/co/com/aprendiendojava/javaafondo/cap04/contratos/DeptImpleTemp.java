package co.com.aprendiendojava.javaafondo.cap04.contratos;

import co.com.aprendiendojava.javaafondo.cap04.dto.DeptDTO;

import java.util.Collection;
import java.util.Vector;

public class DeptImpleTemp implements Dept{
    @Override
    public Collection<DeptDTO> buscarTodos() {
        DeptDTO d1 = new DeptDTO();
        d1.setDeptno(1);
        d1.setDbname("Ventas");
        d1.setLoc("Capital");

        DeptDTO d2 = new DeptDTO();
        d2.setDeptno(2);
        d2.setDbname("Compras");
        d2.setLoc("Capital");

        DeptDTO d3 = new DeptDTO();
        d3.setDeptno(3);
        d3.setDbname("RRHH");
        d3.setLoc("Buenos Aires");

        Vector<DeptDTO> v = new Vector<>();
        v.add(d1);
        v.add(d2);
        v.add(d3);

        return v;
    }
}
