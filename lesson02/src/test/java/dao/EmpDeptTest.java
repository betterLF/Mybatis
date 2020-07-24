package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
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
        List<Employee> allEmp = mapper.getAllEmp();
        for (Employee e:allEmp){
            System.out.println(e);
        }

    }
}
