package com.example.springboot.mybatis.commonmapper.model;

import javax.persistence.Id;
import java.util.Date;

public class Employer {
    @Id
    private Integer employerid;

    private String name;

    private Date birthday;

    private String sex;

    private Integer companyid;

    public Employer(Integer employerid, String name, Date birthday, String sex, Integer companyid) {
        this.employerid = employerid;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.companyid = companyid;
    }

    public Employer() {
        super();
    }

    public Integer getEmployerid() {
        return employerid;
    }

    public void setEmployerid(Integer employerid) {
        this.employerid = employerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }
}
