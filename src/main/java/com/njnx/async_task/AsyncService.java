package com.njnx.async_task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * @Author:scott
 * @Description:异步任务防止阻塞
 * @Date: 2020-11-15
 */
@Slf4j
@Service
public class AsyncService {


    @Async
    public void asyncProcess01() throws Exception {
        log.info("AsyncService: Start To Process 01->{}",
                Thread.currentThread().getName());
        Thread.sleep(2000);
        log.info("AsyncService :Done To Process 01->{}",
                Thread.currentThread().getName());
    }



    /**Future接口是java标准api的一部分,在java.util.concurrent包中.future接口是java线程future模式的实现,可以进行异步计算**/
    /**Future模式:我有一个任务,提交给了future模式,future替我完成了这个任务,期间我可以自己去做任何想做的事情.一段时间后可以拿着订单来提货,这个期间可以干别的事情**/
    /***AsyncResult 可以同时进行查询,之间互不影响,每个查询返回结果后,直接汇总,这样就大大节约了查询的时间。*/
    @Async
    public Future<String> asyncProcess02() throws Exception{
        log.info("AsyncService: Start To Process 02 -> {}",
                Thread.currentThread().getName());
        Thread.sleep(2000);
        log.info("AsyncService: Done To Process 02 -> {}",
                Thread.currentThread().getName());
        return new AsyncResult<>("xuboran");
    }


    @Async
    public Future<String> asyncProcess03() throws Exception{
        log.info("AsyncService: Start To Process 03 -> {}",
                Thread.currentThread().getName());
        Thread.sleep(2000);
        log.info("AsyncService: Done To Process 03 -> {}",
                Thread.currentThread().getName());
        throw  new RuntimeException("throw exception in asyncProcess03.");
    }




}
