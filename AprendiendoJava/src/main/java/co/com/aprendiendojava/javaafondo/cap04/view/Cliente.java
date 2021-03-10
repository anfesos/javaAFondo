package co.com.aprendiendojava.javaafondo.cap04.view;

import co.com.aprendiendojava.javaafondo.cap04.dto.DeptDTO;
import co.com.aprendiendojava.javaafondo.cap04.dto.EmpDTO;
import co.com.aprendiendojava.javaafondo.cap04.facades.Facade;

import java.util.Collection;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        Facade facade = new Facade();
        Collection<DeptDTO> collDepts = facade.obtenerDepartamentos();

        //Muestro los departamentos
        _mostrarDepartamentos(collDepts);

        // pido al usuario que ingrese un deptno
        Scanner scanner = new Scanner(System.in);
        int deptno = scanner.nextInt();

        Collection<EmpDTO> collEmps=facade.obtenerEmpleados(deptno);

        //Muestro los empleados del deptno especificado
        _mostrarEmpleados(collEmps,deptno);
    }

    private static void _mostrarDepartamentos(Collection<DeptDTO> collDepts) {

        System.out.println("Departamentos: ");
        System.out.println("---------------------->");
        for (DeptDTO dto : collDepts) {
            System.out.println("| " + dto.getDeptno() + "\t");
            System.out.println("| " + dto.getDbname() + "\t");
            System.out.println("| " + dto.getLoc() + "\t|");
        }

        System.out.println("<----------------------");
        System.out.println("Ingrese deptno: ");
    }

    private static void _mostrarEmpleados(Collection<EmpDTO> collEmps, int deptno) {
        System.out.println("Empleados del departamento: "+deptno);
        System.out.println("---------------------->");
        for(EmpDTO dto: collEmps){
            System.out.println("| "+dto.getEmpno()+"\t");
            System.out.println("| "+dto.getEname()+"\t");
            System.out.println("| "+dto.getHiredate()+"\t|");
        }
    }
}
