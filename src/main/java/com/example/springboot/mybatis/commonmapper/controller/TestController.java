package com.example.springboot.mybatis.commonmapper.controller;

import com.example.springboot.mybatis.commonmapper.model.Company;
import com.example.springboot.mybatis.commonmapper.model.Employer;
import com.example.springboot.mybatis.commonmapper.service.CompanyService;
import com.example.springboot.mybatis.commonmapper.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * describe:
 *
 * @author Neil.Jia
 * @date 2018/11/05
 */
@RestController
@RequestMapping(value="/")
public class TestController {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private EmployerService employerService;

    /**
     *
     * @return
     */
    @GetMapping(value="/company")
    public List<Company> getCompanyList() {
        List<Company> companyList = companyService.selectAll();
        return companyList;
    }

    /**
     *
     * @return
     */
    @GetMapping(value="/employer")
    public List<Employer> getEmployerList() {
        List<Employer> employerList = employerService.selectAll();
        return employerList;
    }

    /**
     *
     * @param name
     * @return
     */
    @GetMapping(value="/employer/{name}")
    public Employer getEmployer(@PathVariable String name) {
        Employer employer = employerService.getEmployerByName(name).get(0);
        return employer;
    }

}
