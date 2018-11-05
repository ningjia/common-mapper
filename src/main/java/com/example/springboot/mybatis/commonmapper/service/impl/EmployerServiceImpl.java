package com.example.springboot.mybatis.commonmapper.service.impl;

import com.example.springboot.mybatis.commonmapper.mapper.EmployerMapper;
import com.example.springboot.mybatis.commonmapper.model.Company;
import com.example.springboot.mybatis.commonmapper.model.Employer;
import com.example.springboot.mybatis.commonmapper.service.CompanyService;
import com.example.springboot.mybatis.commonmapper.service.EmployerService;
import com.example.springboot.mybatis.commonmapper.service.util.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * describe:
 *
 * @author Neil.Jia
 * @date 2018/11/05
 */
@Service
public class EmployerServiceImpl extends BaseServiceImpl<Employer> implements EmployerService {

    @Autowired
    EmployerMapper employerMapper;

    @Override
    public List<Employer> getEmployerByName(String employerName) {
        return employerMapper.getEmployerByName(employerName);
    }
}
