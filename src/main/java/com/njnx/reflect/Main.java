package com.njnx.reflect;

import java.lang.reflect.Method;

/**
 * @Author:scott
 * @Description
 * @Date:
 */
public class Main {


    /**
     * <h2>方法的参数是基本类型,反射获取 Method 参数类型必须一致<h2/>
     */
    private static void reflectDeclareMethod() throws Exception {

        Class<Boss> clz = Boss.class;
        Method[] methods = clz.getDeclaredMethods();

        Method method = clz.getDeclaredMethod("numeric", Integer.TYPE);
        System.out.println(method.invoke(clz.newInstance(), 19));
    }


    /**
     * <h2>调用方法属于对象的父类,getDeclaredMethod 会提出异常<h2/>
     *(如果想要获取到方法需要递归执行)
     * @param
     */
    private static void reflectAcquireClassMethod() throws Exception {

        Class<Boss> clz = Boss.class;
        //是这行代码导致的异常(调用方法属于对象的父类,getDeclaredMethod 会提出异常)
//        Method method = clz.getDeclaredMethod("worker", String.class);

//        System.out.println(method.invoke(clz.newInstance(), "people"));
        Method superMethod = getMethod(clz, "worker",
                new Class[]{String.class});
        if (superMethod != null) {
            System.out.println(superMethod.invoke(clz.newInstance(), "people"));
        }
    }


    private static Method getMethod(Class<?> target, String methodName, Class<?>[] argTypes) {

        Method method = null;
        try {
            method = target.getDeclaredMethod(methodName, argTypes);
            //可以获取到private方法
            method.setAccessible(true);
        } catch (NoSuchMethodException e) {
            System.out.println("can not get method: " + methodName + " from " + target.getName());
            e.printStackTrace();
        }

        if (method == null && target != Object.class) {

            return getMethod(target.getSuperclass(), methodName, argTypes);
        }
        return method;
    }


    public static void main(String[] args) throws Exception {
        reflectAcquireClassMethod();
    }


}
