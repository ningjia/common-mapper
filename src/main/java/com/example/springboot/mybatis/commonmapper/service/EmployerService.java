package com.example.springboot.mybatis.commonmapper.service;

import com.example.springboot.mybatis.commonmapper.model.Company;
import com.example.springboot.mybatis.commonmapper.model.Employer;
import com.example.springboot.mybatis.commonmapper.service.util.BaseService;

import java.util.List;

public interface EmployerService extends BaseService<Employer> {

    List<Employer> getEmployerByName(String employerName);

}
