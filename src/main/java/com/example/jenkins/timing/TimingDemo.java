package com.example.jenkins.timing;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author willi
 * @Classname TimingDemo
 * @Description 定时任务demo
 * @Date 2021/11/8 9:05
 */
public class TimingDemo {
       public static void main(String[] args) {        // 定义一个任务
            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Run timerTask：" + new Date());
                }
            };
            Timer timer = new Timer();
            timer.schedule(timerTask,1000,3000);

}
}
