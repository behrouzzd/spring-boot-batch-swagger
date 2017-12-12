package org.spring.wagavinproject.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
@Component
public class JobScheduler {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    @Qualifier(JobConstants.FIRST_JOB_ID)
    private Job job;

    @Scheduled(fixedRate = 900000)
    public void runFirstJob() throws Exception{
        JobParameters param = new JobParametersBuilder().addString("JobID",
                String.valueOf(System.currentTimeMillis())).toJobParameters();
        JobExecution execution =  jobLauncher.run(job, param);
        System.out.println("Job Execution Status: " + execution.getStatus());
    }


}
