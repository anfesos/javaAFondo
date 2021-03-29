package co.com.aprendiendojava.javaafondo.cap04.dao;

import co.com.aprendiendojava.javaafondo.cap03.demo.UConnection;
import co.com.aprendiendojava.javaafondo.cap04.dto.EmpDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Vector;

public abstract class EmpDAO {

    //Cada implementación debe sobreescribir este metodo
    // y retornar el sql propietario
    protected abstract String queryBuscarUltimosEmpleados();

    //Este metodo ya no es necesario que sea abstracto porque puede obtener
    //el query invocando al metodo abstracto queryBuscarUltimosEmpleados
    public  Collection<EmpDTO> buscarUltimosEmpleados(int n){
        Connection con=null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try{

            con = UConnection.getConnection();
            //Sentencia SQL propietaria de Postgres, el metodo abstracto me da el query a ejecutar
            String sql = queryBuscarUltimosEmpleados();

            pstm = con.prepareStatement(sql);
            pstm.setInt(1,n);
            rs = pstm.executeQuery();

            Vector<EmpDTO> ret = new Vector<>();
            EmpDTO dto = null;

            while(rs.next()){
                dto = new EmpDTO();
                dto.setEmpno(rs.getInt("empno"));
                dto.setEname(rs.getString("ename"));
                dto.setHiredate(rs.getDate("hiredate"));
                dto.setDeptno(rs.getInt("deptno"));
                ret.add(dto);
            }

            return ret;
        }catch (Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    //Este método es común a todas las bases de datos por lo tanto
    //podemos resolverlo aquí y no necesita ser declarado abstracto
    public Collection<EmpDTO> buscarXDept(int deptno){
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try{
            con = UConnection.getConnection();
            String sql = "";
            sql+="SELECT empno, ename, hiredate, deptno ";
            sql+="FROM emp ";
            sql+="WHERE deptno = ? ";

            pstm = con.prepareStatement(sql);
            pstm.setInt(1,deptno);
            rs = pstm.executeQuery();

            Vector<EmpDTO> ret = new Vector<>();
            EmpDTO dto = null;

            while(rs.next()){
                dto = new EmpDTO();
                dto.setEmpno(rs.getInt("empno"));
                dto.setEname(rs.getString("ename"));
                dto.setHiredate(rs.getDate("hiredate"));
                dto.setDeptno(rs.getInt("deptno"));
                ret.add(dto);
            }

            return ret;
        }catch (Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}
