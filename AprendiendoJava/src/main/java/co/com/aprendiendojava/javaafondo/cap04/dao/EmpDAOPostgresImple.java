package co.com.aprendiendojava.javaafondo.cap04.dao;

public class EmpDAOPostgresImple extends EmpDAO{
    @Override
    protected String queryBuscarUltimosEmpleados() {
        String sql = "";
        sql+="SELECT empno,ename,hiredate,deptno ";
        sql+="FROM emp ";
        sql+="ORDER BY hiredate DESC ";
        sql+="LIMIT ? ";

        return sql;
    }
}
