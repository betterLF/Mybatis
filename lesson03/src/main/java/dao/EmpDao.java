package dao;

import org.apache.ibatis.annotations.Param;
import pojo.Employee;

import java.util.List;

public interface EmpDao {
    //根据eid,ename,age,sex多条件查询员工消息
    List<Employee> getEmpListByMore(Employee employee);
    //根据eid,ename,age,sex中的其中一个查询一个员工信息
    List<Employee> getEmpListByChoose(Employee employee);
    //添加员工信息，将员工信息1->男，0->女
    void insertEmp(Employee employee);
    //通过eid所组成的字符串实现批量删除
    void deleteMoreEmp(String eids);
    //通过list集合来实现批量删除
    void deleteMoreByList(List<Integer> eids);
    //批量添加
    void insertMoreByArray(@Param("emps") Employee[] employees);
    //批量修改
    void updateMoreByArray(@Param("emps") Employee[] employees);
}
