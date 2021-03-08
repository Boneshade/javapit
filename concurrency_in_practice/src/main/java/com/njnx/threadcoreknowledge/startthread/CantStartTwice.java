package com.njnx.threadcoreknowledge.startthread;

/**
 * @author xubr 2021/3/8
 */
public class CantStartTwice {
    public static void main(String[] args) {


        //此处
        Thread thread = new Thread();
        thread.start();
        thread.start();
    }

}
