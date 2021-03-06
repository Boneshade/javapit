package com.njnx.async_task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author:scott
 * @Description:
 * @Date: 2020-11-15
 */
@Slf4j
@Configuration
public class AsyncTaskConfig implements AsyncConfigurer {

    @Override
    public Executor getAsyncExecutor() {

        ThreadPoolTaskExecutor executor=new ThreadPoolTaskExecutor();
        executor.setThreadNamePrefix("imooc-xuboran-task");
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(8);
        executor.setKeepAliveSeconds(5);
        executor.setQueueCapacity(100);
        //默认拦截模式
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());

        executor.setWaitForTasksToCompleteOnShutdown(true);
//        executor.setAwaitTerminationMillis(60);

        executor.initialize();
        return executor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {

        return new AsyncUncaughtExceptionHandler() {
            @Override
            public void handleUncaughtException(Throwable ex, Method method,
                                                Object... params) {
                // 发送报警邮件, 短信等等
                log.error("Async Task Has Some Error: {}, {}, {}",
                        ex.getMessage(),
                        method.getDeclaringClass().getName() + "." + method.getName(),
                        Arrays.toString(params));
            }
        };
    }
}
