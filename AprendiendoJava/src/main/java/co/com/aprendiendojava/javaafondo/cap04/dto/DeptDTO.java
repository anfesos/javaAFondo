package co.com.aprendiendojava.javaafondo.cap04.dto;

public class DeptDTO {

    private int deptno;
    private String dbname;
    private String loc;

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "DeptDTO{" +
                "deptno=" + deptno +
                ", dbname='" + dbname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
