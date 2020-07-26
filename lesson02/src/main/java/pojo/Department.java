package pojo;

import java.util.List;

/**
 * @author lifei
 * @date 2020/7/23 15:24
 */
public class Department {
    private Integer did;
    private String dname;
    private List<Employee> employeeList;

    public Department() {
    }

    public Department(Integer did, String dname, List<Employee> employeeList) {
        this.did = did;
        this.dname = dname;
        this.employeeList = employeeList;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }
}
