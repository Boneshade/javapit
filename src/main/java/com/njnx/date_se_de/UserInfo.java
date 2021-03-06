package com.njnx.date_se_de;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author 26586
 */
public class UserInfo {

    private Long id;
    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;


    public UserInfo() {

    }

    public UserInfo(Long id, String name, Date birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
