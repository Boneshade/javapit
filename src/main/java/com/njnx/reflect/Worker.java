package com.njnx.reflect;

/**
 * @Author:scott
 * @Description
 * @Date:
 */
public class Worker extends People {

    public String worker(String hello) {
        return Worker.class.getName() + ": " + hello;
    }


}
