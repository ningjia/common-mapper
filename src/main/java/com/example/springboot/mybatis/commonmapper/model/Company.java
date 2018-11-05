package com.example.springboot.mybatis.commonmapper.model;

import javax.persistence.Id;

/**
 * describe:
 *
 * @author Neil.Jia
 * @date 2018/11/05
 */
public class Company {
    private Integer companyid;

    private String name;

    public Company(Integer companyid, String name) {
        this.companyid = companyid;
        this.name = name;
    }

    public Company() {
        super();
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

}
