package com.example.jenkins.timing;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author willi
 * @Classname scheduled
 * @Description TODO
 * @Date 2021/11/8 9:38
 */
@Component
public class scheduled {
    //3.添加定时任务
    @Scheduled(cron = "0/1 * * * * ?")
    //或直接指定时间间隔，例如：5秒
    //@Scheduled(fixedRate=5000)
    private void configureTasks() {
        System.err.println("执行静态定时任务时间: " + LocalDateTime.now());
    }

}
