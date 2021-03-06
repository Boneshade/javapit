package com.njnx.threadcoreknowledge.createthreads;

/**
 * @author xubr 2021/3/6
 */
@SuppressWarnings("all")
public class BothRunnableThread {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我来自Runnable");
            }
        })

                //实例化代码块在每次生成对象的时候都会执行(实例化代码块会先于构造方法执行)
                //此处是jvm实例化BothRunnableThread时执行,且直接将thread类中的run方法给覆盖
        {
            @Override
            public void run() {
                System.out.println("我来自Thread");
            }
        }.start();
    }


}
