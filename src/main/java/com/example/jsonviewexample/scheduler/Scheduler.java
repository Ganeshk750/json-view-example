package com.example.jsonviewexample.scheduler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Slf4j
//@EnableAsync // For ||lr execution
public class Scheduler {

    @Autowired
    private ThreadPoolTaskScheduler threadPoolTaskScheduler;

//    @Scheduled(fixedDelay = 1000) // it will wait for 1ms of executing previous one
//    public void scheduler() throws InterruptedException{
//        LocalDateTime current = LocalDateTime.now();
//        DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        String formattedDateTime = current.format(formate);
//        log.info(":::SCHEDULE TIME::: "+ formattedDateTime);
//        Thread.sleep(1000); // It will stop execution for 1 ms
//    }

//    @Scheduled(fixedRate = 1000) // it will not wait for 1ms of executing previous one
//    public void scheduler1() throws InterruptedException{
//        LocalDateTime current = LocalDateTime.now();
//        DateTimeFormatter formates = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String formattedDateTime = current.format(formates);
//        log.info(":::SCHEDULE TIMES::: "+ formattedDateTime);
//        Thread.sleep(1000); // It will not affect the current scheduler
//    }

//    @Scheduled(fixedRateString = "PT02S", initialDelay = 1000)
//    public void scheduler2() throws InterruptedException{
//        LocalDateTime current = LocalDateTime.now();
//        DateTimeFormatter formates = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String formattedDateTime = current.format(formates);
//        log.info(":::SCHEDULE TIMES::: "+ formattedDateTime);
//
//    }


    //IF u want to execute ||ly then user @Async
//    @Async
//    @Scheduled(fixedRateString = "PT02S", initialDelay = 1000)
//    public void scheduler3() throws InterruptedException{
//        LocalDateTime current = LocalDateTime.now();
//        DateTimeFormatter formates = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String formattedDateTime = current.format(formates);
//        log.info(":::SCHEDULE TIMES::: "+ formattedDateTime);
//        Thread.sleep(1000);
//
//    }


//    @Scheduled(cron = "*/2 * * * * *") // s m h d m dayofweek// eg: for 2s */2 or every 2m 0 */2
//    public void scheduler4() throws InterruptedException{
//        LocalDateTime current = LocalDateTime.now();
//        DateTimeFormatter formates = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String formattedDateTime = current.format(formates);
//        log.info(":::SCHEDULE TIMES::: "+ formattedDateTime);
//        Thread.sleep(1000);
//
//    }


//    @Scheduled(cron = "0 */2 * * * *") // s m h d m dayofweek// eg: for 2s */2 or every 2m 0 */2
//    public void scheduler5() throws InterruptedException{
//        LocalDateTime current = LocalDateTime.now();
//        DateTimeFormatter formates = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String formattedDateTime = current.format(formates);
//        log.info(":::SCHEDULE TIMES::: "+ formattedDateTime);
//        Thread.sleep(1000);
//
//    }


//    @Scheduled(cron = "0 0 28 * * TUE") //  It Will execute upcoming 28 date where day=Tuesday
//    public void scheduler6() throws InterruptedException{
//        LocalDateTime current = LocalDateTime.now();
//        DateTimeFormatter formates = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String formattedDateTime = current.format(formates);
//        log.info(":::SCHEDULE TIMES::: "+ formattedDateTime);
//        Thread.sleep(1000);
//
//    }


//    //Parametrized Cron expression
//    @Scheduled(cron = "${cron.expression.value}")
//    public void scheduler7() throws InterruptedException{
//        LocalDateTime current = LocalDateTime.now();
//        DateTimeFormatter formates = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String formattedDateTime = current.format(formates);
//        log.info(":::SCHEDULE TIMES::: "+ formattedDateTime);
//        Thread.sleep(1000);
//
//    }


    @Scheduled(cron = "${cron.expression.value}")
    public void scheduler8() throws InterruptedException{
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formates = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = current.format(formates);
        log.info(":::SCHEDULE TIMES::: "+ formattedDateTime);
        Thread.sleep(1000);

    }

//    public int noOfThread(){
//        //set threadPoolSize
//     threadPoolTaskScheduler.setPoolSize(3);
//    }

}
