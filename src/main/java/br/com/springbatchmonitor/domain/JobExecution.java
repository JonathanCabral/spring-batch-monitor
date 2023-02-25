package br.com.springbatchmonitor.domain;

import java.time.LocalDateTime;
import java.util.Collection;

public class JobExecution {

//    private JobParameters jobParameters;

    private JobInstance jobInstance;

    private Collection<StepExecution> stepExecutions;

    private BatchStatus status;

    private LocalDateTime startTime;

    private LocalDateTime createTime;

    private LocalDateTime endtime;

    private LocalDateTime lastUpdated;

    /** Attribute used carry information about the status of a job or step execution
     * It could be a custom value, but normally it will be one of these following:
     * UNKNOWN, EXECUTING, COMPLETED, NOOP, FAILED OR STOPPED.
     */
    private String exitStatus;

    public JobInstance getJobInstance() {
        return jobInstance;
    }

    public Collection<StepExecution> getStepExecutions() {
        return stepExecutions;
    }

    public BatchStatus getStatus() {
        return status;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public LocalDateTime getEndtime() {
        return endtime;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public String getExitStatus() {
        return exitStatus;
    }
}
