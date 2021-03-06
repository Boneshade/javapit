package com.njnx.scheduled_task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author:scott
 * @Description:定时任务
 * @Date: 2020-11-15
 */
@Slf4j
@Component
public class ScheduleTask {


    /**
     * Scheduled:fixedRate上一次开始执行时间点之后多长时间再执行
     * fixedDelayString与fixedDelay 意思相同，只能用字符串形式。唯一不同的是支持占位符
     * fixedDelay:上一次执行完毕时间点后多长时间再执行
     * cron:该参数接受一个cron表达式,cron表达式是一个字符串,字符串以5到6个字符隔开。
     * spring 中默认的线程池中的线程只有一个所有需要自定义线程池
     **/
    @Scheduled(fixedRate = 1000)
    public void task01() throws Exception {

        log.info("Schedule Task process task01 .");
        while (true) {
            Thread.sleep(2000);
            log.info("Schedule Task process something!");
        }
    }

    @Scheduled(fixedRate = 1000)
    public void task02() {
        log.info("Schedule Task process task02.");
    }
}
