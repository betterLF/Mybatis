package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Employee;
import utils.MybatisUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lifei
 * @date 2020/7/24 9:15
 */
public class ParamTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ParamMapper mapper = sqlSession.getMapper(ParamMapper.class);
//        mapper.insertEmp(new Employee(null,"aaaa",24,"男"));
//        Employee employee = new Employee(null, "adm", 22, "男");
//        mapper.insertEmp(employee);
//        System.out.println(employee.getEid());//获取主键值
//        Employee emp = mapper.getEmpByEid("11");
//        System.out.println(emp);
//        Employee emp = mapper.getEmpByEidAndEname("2", "李四");
//        System.out.println(emp);
        Map<String,Object> map=new HashMap<>();
        map.put("eid",2);
        map.put("ename","李四");
        Employee empByMap = mapper.getEmpByMap(map);
        System.out.println(empByMap);
//        Employee emp = mapper.getEmpByEidAndEnameByParam("2", "李四");
//        System.out.println(emp);
    }
}
