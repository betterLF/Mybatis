package com.ssm.test.dao;

import com.ssm.test.model.employee;
import com.ssm.test.model.employeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface employeeMapper {
    int countByExample(employeeExample example);

    int deleteByExample(employeeExample example);

    int deleteByPrimaryKey(Integer eid);

    int insert(employee record);

    int insertSelective(employee record);

    List<employee> selectByExample(employeeExample example);

    employee selectByPrimaryKey(Integer eid);

    int updateByExampleSelective(@Param("record") employee record, @Param("example") employeeExample example);

    int updateByExample(@Param("record") employee record, @Param("example") employeeExample example);

    int updateByPrimaryKeySelective(employee record);

    int updateByPrimaryKey(employee record);
}