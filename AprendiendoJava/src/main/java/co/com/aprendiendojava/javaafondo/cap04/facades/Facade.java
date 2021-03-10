package co.com.aprendiendojava.javaafondo.cap04.facades;

import co.com.aprendiendojava.javaafondo.cap04.dao.DeptDAO;
import co.com.aprendiendojava.javaafondo.cap04.dao.EmpDAO;
import co.com.aprendiendojava.javaafondo.cap04.dto.DeptDTO;
import co.com.aprendiendojava.javaafondo.cap04.dto.EmpDTO;

import java.util.Collection;

public class Facade {

    public Collection<DeptDTO> obtenerDepartamentos(){
        DeptDAO deptDAO = new DeptDAO();
        return deptDAO.buscarTodos();
    };

    public Collection<EmpDTO> obtenerEmpleados(int deptno){
        EmpDAO empDAO = new EmpDAO();
        return empDAO.buscarXDept(deptno);
    };
}
