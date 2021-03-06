//package com.lwh.config;
//
//import com.lwh.job.WeatherDataSyncJob;
//import org.quartz.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author zzc
// * @create 2020-06-01 13:17
// */
//@Configuration
//public class QuartzConfig {
//    private static final Integer TIME = 1800;
//
//    @Bean
//    public JobDetail weatherDataSyncJobJobDetail() {
//        return JobBuilder
//                .newJob(WeatherDataSyncJob.class)
//                .withIdentity("weatherDataSyncJobJobDetail")
//                .storeDurably()
//                .build();
//    }
//
//    @Bean
//    public Trigger weatherDataSyncJobTrigger() {
//        SimpleScheduleBuilder schedule = SimpleScheduleBuilder
//                .simpleSchedule()
//                .withIntervalInSeconds(TIME)
//                .repeatForever();
//        return TriggerBuilder
//                .newTrigger()
//                .forJob(weatherDataSyncJobJobDetail())
//                .withIdentity("weatherDataSyncJobTrigger")
//                .withSchedule(schedule)
//                .build();
//    }
//}
