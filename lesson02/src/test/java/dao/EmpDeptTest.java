package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Department;
import pojo.Employee;
import utils.MybatisUtils;

import java.util.List;

/**
 * @author lifei
 * @date 2020/7/24 12:05
 */
public class EmpDeptTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmpDeptMapper mapper = sqlSession.getMapper(EmpDeptMapper.class);
//        List<Employee> allEmp = mapper.getAllEmp();
//        for (Employee e:allEmp){
//            System.out.println(e);
//        }
//        Employee empStep = mapper.getEmpStep(3);
//        System.out.println(empStep);
//        //如果只执行empStep.getEid()，分步查询第二步不会进行，因为配置文件中加入了懒加载
////        System.out.println(empStep.getEid());
//        Department deptEmpsByDid = mapper.getDeptEmpsByDid(2);
//        System.out.println(deptEmpsByDid);

        Department onlyDeptEByDid = mapper.getOnlyDeptEByDid(3);
        System.out.println(onlyDeptEByDid);
    }
}
