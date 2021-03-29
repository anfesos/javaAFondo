package co.com.aprendiendojava.javaafondo.cap04.contratos;

import co.com.aprendiendojava.javaafondo.cap04.dto.DeptDTO;
import co.com.aprendiendojava.javaafondo.cap04.facades.UFactory;

import java.util.Collection;

public class MuestraDepartamentos {

    public static void main(String[] args) {
        Dept d = (Dept) UFactory.getInstacia("DEPT");
        Collection<DeptDTO> coll = d.buscarTodos();

        for(DeptDTO dto:coll){
            System.out.println(dto);
        }
    }
}
