package co.com.aprendiendojava.javaafondo.cap04.facades;

import co.com.aprendiendojava.javaafondo.cap04.dao.DeptDAO;
import co.com.aprendiendojava.javaafondo.cap04.dao.EmpDAO;
import co.com.aprendiendojava.javaafondo.cap04.dto.DeptDTO;
import co.com.aprendiendojava.javaafondo.cap04.dto.EmpDTO;

import java.util.Collection;

public class Facade {

    public Collection<EmpDTO> obtenerUltimosEmpleados (int n){
        EmpDAO empDAO = (EmpDAO)UFactory.getInstacia("EMP");
        return empDAO.buscarUltimosEmpleados(n);
    }

    public Collection<DeptDTO> obtenerDepartamentos(){
        DeptDAO deptDAO = (DeptDAO) UFactory.getInstacia("DEPT");
        return deptDAO.buscarTodos();
    };

    public Collection<EmpDTO> obtenerEmpleados(int deptno){
        EmpDAO empDAO = (EmpDAO) UFactory.getInstacia("EMP");
        return empDAO.buscarXDept(deptno);
    };
}
