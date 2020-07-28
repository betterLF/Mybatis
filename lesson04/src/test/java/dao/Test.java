package dao;

import com.ssm.test.dao.employeeMapper;

import com.ssm.test.model.employee;
import com.ssm.test.model.employeeExample;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtils;

import java.util.List;

/**
 * @author lifei
 * @date 2020/7/28 12:06
 */
public class Test {
    @org.junit.Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        employeeMapper mapper = sqlSession.getMapper(employeeMapper.class);
//        employee employee = mapper.selectByPrimaryKey(2);
        employeeExample employeeExample = new employeeExample();
        com.ssm.test.model.employeeExample.Criteria criteria = employeeExample.createCriteria();
        //查询条件
        criteria.andAgeBetween(20,22);
        criteria.andEidBetween(1,5);
        List<employee> employees = mapper.selectByExample(employeeExample);
        for (employee e:employees){
            System.out.println(e);
        }
    }

}
