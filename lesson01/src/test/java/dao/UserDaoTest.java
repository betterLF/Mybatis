package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import utils.MybatisUtils;

import java.util.List;

/**
 * @author lifei
 * @date 2020/7/22 18:07
 */
public class UserDaoTest {
    @Test
    public void test(){
        //第一步:获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql
        //方式一:getMapper
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList =mapper.getUserList();
        //方式二:
//        List<User> userList = sqlSession.selectList("dao.UserDao.getUserList");
        for (User user:userList){
            System.out.println(user);
        }
        sqlSession.close();
    }
}
