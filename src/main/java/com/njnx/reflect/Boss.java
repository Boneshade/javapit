package com.njnx.reflect;

import java.lang.reflect.Method;

/**
 * @Author:scott
 * @Description
 * @Date:
 */
public class Boss extends Worker {

    public String boss(String hello) {
        return Boss.class.getName() + ": " + hello;
    }


    public String numeric(int age) {
        return Boss.class.getName() + ": " + age;
    }
}
