package com.njnx.try_catch_resources;

/**
 * @author 26586
 */
public class AutoClose implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println(">>> close()");
        throw new RuntimeException("Exception in close()");
    }


    public void work() throws MyException {
        System.out.println(">>> work()");
        throw new MyException("Exception in work()");
    }
}
