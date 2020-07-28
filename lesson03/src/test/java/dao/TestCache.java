package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Employee;
import utils.MybatisUtils;

import java.util.List;

/**
 * @author lifei
 * @date 2020/7/27 11:40
 */
public class TestCache {
    @Test
    public void testFirstCache(){
        /**
         * mybatis中的一级缓存，默认开启,是SqlSession级别的
         * 即同一个SqlSession对于同一个sql语句，执行之后会存储在缓存中，下一次执行相同的sql，直接从缓存中取
         * 一级缓存失效的情况:
             * 不同的SqlSession对应不同的一级缓存
             * 同一个SqlSession但是查询条件不同
             * 同一个SqlSession两次查询期间执行了任何一次增删改操作
             * 同一个SqlSession两次查询期间手动清空了缓存
         */
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmpDao mapper = sqlSession.getMapper(EmpDao.class);
        Employee empByEid = mapper.getEmpByEid(2);
        System.out.println(empByEid);
    }
    @Test
    public void testSecondCache(){
        /**
         * mybatis提供二级缓存的接口以及实现，缓存实现要求pojo实现Serializable接口
         * 二级缓存在SqlSession关闭或提交之后才会生效(是映射级别的)
         * 二级缓存使用的步骤:
           *全局配置文件中开启二级缓存<setting name="cacheEnabled" value="true"></setting>
           *需要使用二级缓存的映射文件处使用cache配置缓存<cache></cache>
           *注意:pojo需要实现Serializable接口
         * 二级缓存需要SqlSession提交或关闭时才能生效
         * select标签的useCache属性:配置这个标签是否使用二级缓存
         * sql标签的flushCache属性:默认sql执行后会将一二级缓存同时清空
         * sqlSession.clearCache():只是用来清除一级缓存
         */
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmpDao mapper1 = sqlSession.getMapper(EmpDao.class);
        EmpDao mapper2 = sqlSession.getMapper(EmpDao.class);
        Employee emp1 = mapper1.getEmpByEid(2);
        sqlSession.commit();
        Employee emp2= mapper2.getEmpByEid(2);
        System.out.println(emp1);
        System.out.println(emp2);

    }
}
