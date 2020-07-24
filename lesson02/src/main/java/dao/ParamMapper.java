package dao;

import org.apache.ibatis.annotations.Param;
import pojo.Employee;

import java.util.Map;

public interface ParamMapper {
    //添加员工信息
    void insertEmp(Employee employee);
    //根据eid获取员工信息
    Employee getEmpByEid(String s, String eid);
    //根据eid和ename查询员工信息
    Employee getEmpByEidAndEname(String eid,String ename);
    //根据map查询员工信息
    Employee getEmpByMap(Map<String,Object> emp);
    Employee getEmpByEidAndEnameByParam(@Param("eid")String eid,@Param("ename")String ename);
}
