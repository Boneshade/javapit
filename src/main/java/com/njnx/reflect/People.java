package com.njnx.reflect;

/**
 * @Author:scott
 * @Description
 * @Date: 用于反射的学习
 */
public class People {

    public String people(String hello) {
        return People.class.getName() + ":" + hello;
    }


}
