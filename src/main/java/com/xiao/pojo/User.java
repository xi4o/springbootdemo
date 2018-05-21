package com.xiao.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

public class User {

    private String name;
    //忽略这个属性
    //@JsonIgnore
    //你是不是傻尽快发大水
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String password;
    private Integer age;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss a",locale = "zh",timezone = "")
    private Date birthday;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String desc;

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Integer getAge() {
        return age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getBirthday() {

        return birthday;
    }

    public String getDesc() {
        return desc;
    }
}
