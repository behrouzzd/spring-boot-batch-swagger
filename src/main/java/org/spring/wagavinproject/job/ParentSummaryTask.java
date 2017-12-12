package org.spring.wagavinproject.job;

import org.spring.wagavinproject.data.entity.ParentSummary;
import org.spring.wagavinproject.data.entity.ParentSummaryEntity;
import org.spring.wagavinproject.repository.ParentSummaryEntityRepository;
import org.spring.wagavinproject.repository.ParentSummaryRepository;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
@Component(JobConstants.FIRST_TASK_LET)
public class ParentSummaryTask implements Tasklet {

    @PersistenceContext
    protected EntityManager entityManager;

    @Autowired
    private ParentSummaryRepository summaryRepository;

    @Autowired
    private ParentSummaryEntityRepository parentSummaryEntityRepository;

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {

        // remove old records
        Iterable<ParentSummaryEntity> oldSummary = parentSummaryEntityRepository.findAll();
        oldSummary.forEach(t -> entityManager.remove(t));

        entityManager.flush();
        entityManager.clear();

        // save updated records
        List<ParentSummary> parentSummaries = summaryRepository.findAllSummary();
        parentSummaries.forEach(t ->
                {
                    ParentSummaryEntity parentSummary = new ParentSummaryEntity();
                    parentSummary.setAmountOfChildren(t.getAmountOfChildren());
                    parentSummary.setAmountOfPersons(t.getAmountOfPersons());
                    entityManager.persist(parentSummary);
                }
        );

        return RepeatStatus.FINISHED;
    }

}
