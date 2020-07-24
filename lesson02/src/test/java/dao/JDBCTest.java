package dao;

import pojo.Employee;

import java.sql.*;

/**
 * @author lifei
 * @date 2020/7/24 9:23
 */
public class JDBCTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("");
//        Connection connection= DriverManager.getConnection("","","");
//        //第一种
//        PreparedStatement preparedStatement = connection.prepareStatement("insert into mybatis.employee values(null,?,?,?)",1);
//        preparedStatement.setString(1,"root");
//        preparedStatement.setString(2,"23");
//        preparedStatement.setString(3,"男");
//        preparedStatement.executeUpdate();
//        ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
//        generatedKeys.next();
//        int id = generatedKeys.getInt(1);//获取id值

        //第二种
//        Statement statement = connection.createStatement();
//        Employee employee=new Employee(null,"a",1,"b");
//        statement.executeUpdate("insert into mybatis.employee values(null,'"+employee.getEname()+"',"+employee.getAge()+",'"+employee.getSex()+"')");
    }
}
