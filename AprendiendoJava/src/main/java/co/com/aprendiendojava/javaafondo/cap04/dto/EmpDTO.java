package co.com.aprendiendojava.javaafondo.cap04.dto;

import java.sql.Date;

public class EmpDTO {

    private int empno;
    private String ename;
    private Date hiredate;
    private int deptno;

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "EmpDTO{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", hiredate=" + hiredate +
                ", deptno=" + deptno +
                '}';
    }
}
