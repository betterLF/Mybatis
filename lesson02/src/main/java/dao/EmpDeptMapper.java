package dao;

import pojo.Department;
import pojo.Employee;

import java.util.List;

public interface EmpDeptMapper {
    List<Employee> getAllEmp();
    Employee getEmpStep(Integer eid);
    Department getDeptEmpsByDid(Integer did);
    Department getOnlyDeptEByDid(Integer did);
    List<Employee> getEmpListByDid(Integer did);


}
