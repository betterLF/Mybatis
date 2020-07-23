package dao;

import pojo.Employee;

import java.util.List;

public interface EmpDao {
    //根据eid查询一个消息
    Employee getEmpByEid(Integer id);
    //获取所有的员工信息
    List<Employee> getALLEmp();
    //添加员工信息
    void addEmp(Employee employee);
    //修改员工信息
    void updateEmp(Employee employee);
    //删除员工信息
    void deleteEmp(Integer id);
    //如果是Integer，代表受影响的行数，boolean代表是否成功
}
