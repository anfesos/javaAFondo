package co.com.aprendiendojava.javaafondo.cap04.dao;

public class EmpDAOOracleImple extends EmpDAO {
    @Override
    protected String queryBuscarUltimosEmpleados() {
        String sql = "";
        sql+="SELECT empno,ename,hiredate,deptno, ROWNUM AS rn ";
        sql+="FROM (SELECT empno,ename,hiredate,deptno  ";
        sql+="      FROM emp ";
        sql+="      ORDER BY hiredate DESC) ";
        sql+="WHERE rn <= ? ";

        return sql;
    }
}
