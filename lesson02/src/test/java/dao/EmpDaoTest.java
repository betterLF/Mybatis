package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Employee;
import utils.MybatisUtils;

import java.util.List;

/**
 * @author lifei
 * @date 2020/7/23 15:35
 */
public class EmpDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmpDao mapper = sqlSession.getMapper(EmpDao.class);
////        //根据eid获取员工信息
        System.out.println(mapper.getEmpByEid(2));
        System.out.println("========");
//        //获取全部员工信息
//        List<Employee> empList = mapper.getALLEmp();
//        for (Employee empDao:empList){
//            System.out.println(empDao);
//        }
//        System.out.println("========");
//        //添加员工信息
//        mapper.addEmp(new Employee(null,"admin",23,"女"));
//        //删除员工信息
//        mapper.deleteEmp(1);
//        List<Employee> empList02 = mapper.getALLEmp();
//        for (Employee empDao:empList02){
//            System.out.println(empDao);
//        }
        //测试修改员工信息
//        mapper.updateEmp(new Employee(4,"天四",23,"男"));
    }
}
