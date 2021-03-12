package com.njnx.base;

/**
 * @author xubr 2021/3/6
 * 测试 使用匿名内部类 + 实例化代码块儿 = 使用两个大括号进行初始化
 */
public class Test {

    public static void main(String[] args) {

        binaryToDecimal(10);


    }
    public static void binaryToDecimal(int n){
        int t = 0;  //用来记录位数
        int bin = 0; //用来记录最后的二进制数
        int r = 0;  //用来存储余数
        while(n != 0){
            r = n % 2;
            n = n / 2;
            bin += r * Math.pow(10,t);
            t++;
        }
        System.out.println(bin);
    }

}
