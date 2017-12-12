package org.spring.wagavinproject.job;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
@Configuration
@EnableBatchProcessing
public class JobConfiguration {

    @Autowired
    protected JobBuilderFactory jobBuilderFactory;

    @Autowired
    protected StepBuilderFactory stepBuilderFactory;

    @Autowired
    protected EntityManagerFactory entityManagerFactory;

    @Autowired
    protected JobRepository jobRepository;

    @Resource(name = JobConstants.FIRST_TASK_LET)
    protected Tasklet tasklet;

    @Bean(JobConstants.FIRST_JOB_ID)
    public Job firstJob(@Qualifier("taskStep") Step nextStep) throws Exception {
        return jobBuilderFactory.get(JobConstants.FIRST_JOB_ID)
                .repository(jobRepository)
                .incrementer(new RunIdIncrementer())
                .flow(nextStep)
                .end()
                .build();
    }

    @Bean
    public Step taskStep() throws Exception {
        return stepBuilderFactory.get(JobConstants.FIRST_JOB_STEP_ID)
                .repository(jobRepository)
                .tasklet(tasklet)
                .build();
    }

}
