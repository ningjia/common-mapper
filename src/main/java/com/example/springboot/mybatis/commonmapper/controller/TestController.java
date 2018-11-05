package com.example.springboot.mybatis.commonmapper.controller;

import com.example.springboot.mybatis.commonmapper.model.Company;
import com.example.springboot.mybatis.commonmapper.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    /**
     *
     * @return
     */
    @GetMapping(value="/company")
//    public String getProvinceList() {
//        return "12321";
//    }
    public List<Company> getProvinceList() {
        List<Company> companyList = companyService.selectAll();
        return companyList;
    }

}
