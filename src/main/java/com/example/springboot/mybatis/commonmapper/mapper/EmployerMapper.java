package com.example.springboot.mybatis.commonmapper.mapper;

import com.example.springboot.mybatis.commonmapper.model.Employer;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.type.JdbcType;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * describe:
 *
 * @author Neil.Jia
 * @date 2018/11/05
 */
public interface EmployerMapper extends Mapper<Employer> {

    @SelectProvider(type= EmployerMapper.SqlProvider.class, method = "selectEmployerByName")
    @Results({
        @Result(column="employerId", property="employerid", jdbcType= JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR)
    })
    List<Employer> getEmployerByName(String employerName);


    class SqlProvider {
        /**
         *
         * @param employerName
         * @return
         */
        public String selectEmployerByName(String employerName) {
            SQL sql = new SQL()
                .SELECT("employerId, name")
                .FROM("employer");
            sql.WHERE("name = '"+employerName+"'");
            return sql.toString();
        }
    }


}
