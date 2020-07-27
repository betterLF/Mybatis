package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Employee;
import utils.MybatisUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lifei
 * @date 2020/7/26 18:06
 */
public class SqlTest {
    @Test
    public void testIf(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmpDao mapper = sqlSession.getMapper(EmpDao.class);
        Employee employee=new Employee();
        //employee.setEid(2);
        //employee.setEname("李四");
        //employee.setAge(20);
        employee.setSex("男");
        List<Employee> empListByMore =mapper.getEmpListByMore(employee);
         for (Employee e:empListByMore){
        System.out.println(e);
         }
    }

    @Test
    public void testChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmpDao mapper = sqlSession.getMapper(EmpDao.class);
        Employee employee=new Employee();
        employee.setEid(2);
        employee.setSex("男");
        List<Employee> empListByChoose = mapper.getEmpListByChoose(employee);
        for (Employee e:empListByChoose){
            System.out.println(e);
        }
        mapper.insertEmp(new Employee(null,"aa",20,"3",null));
    }

    @Test
    public void testMore(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmpDao mapper = sqlSession.getMapper(EmpDao.class);
//        String eids="12,13,14";
//        mapper.deleteMoreEmp(eids);
//        List<Integer> eids=new ArrayList<>();
//        eids.add(15);
//        eids.add(16);
//        eids.add(17);
//        mapper.deleteMoreByList(eids);
//        Employee employee1 = new Employee(null, "aa", 20, "男", null);
//        Employee employee2 = new Employee(null, "bb", 21, "男", null);
//        Employee employee3 = new Employee(null, "cc", 22, "女", null);
//        Employee[] employees={employee1,employee2,employee3};
//        mapper.insertMoreByArray(employees);
        Employee employee1 = new Employee(19, "aaa", 18, "男",null);
        Employee employee2 = new Employee(20, "bbb", 23, "男", null);
        Employee employee3 = new Employee(21, "ccc", 20, "女", null);
        Employee[] employees={employee1,employee2,employee3};
        mapper.updateMoreByArray(employees);
    }
}
