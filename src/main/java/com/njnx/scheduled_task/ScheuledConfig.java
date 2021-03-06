package com.njnx.scheduled_task;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

/**
 * @Author:scott
 * @Description
 * @Date: 2020-11-15
 */
//@Configuration
public class ScheuledConfig {

    @Bean
    public TaskScheduler taskScheduler() {

        ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
        taskScheduler.setPoolSize(6);
        return taskScheduler;
    }


}
