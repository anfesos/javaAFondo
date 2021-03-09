package co.com.aprendiendojava.javaafondo.cap04;

import co.com.aprendiendojava.javaafondo.cap04.dao.DeptDAO;
import co.com.aprendiendojava.javaafondo.cap04.dto.DeptDTO;

import java.util.Collection;

public class TestDeptDAO {

    public static void main(String[] args) {
        //Instancio un DTO
        DeptDAO deptDAO = new DeptDAO();

        //Le pido la coleccion de todos los departamentos
        Collection<DeptDTO> coll = deptDAO.buscarTodos();

        //Itero la colección y muestro cada departamento (cada dto)
        for(DeptDTO deptDTO:coll){
            System.out.println(deptDTO);
        }
    }
}
