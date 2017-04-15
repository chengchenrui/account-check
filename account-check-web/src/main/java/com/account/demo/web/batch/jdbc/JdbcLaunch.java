package com.account.demo.web.batch.jdbc;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chengchenrui
 * @version Id: JdbcLaunch.java, v 0.1 2017.3.8 11:38 chengchenrui Exp $$
 */
public class JdbcLaunch {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("jdbcJob");

        try {
            // JOB实行
            JobExecution result = launcher.run(job,
                new JobParametersBuilder().addString("id", "3").toJobParameters());
            // 运行结果输出
            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
