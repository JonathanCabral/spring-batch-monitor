package br.com.springbatchmonitor.domain;

import java.time.LocalDateTime;

public class StepExecution extends Entity {

    private JobExecution jobExecution;
    private String stepName;
    private BatchStatus status;
    private long readCount;
    private long writeCount;
    private long commitCount;
    private long rollbackCount;
    private long readSkipCount;
    private long processSkipCount;
    private long filterCount;
    private LocalDateTime startTime;
    private LocalDateTime createTime;
    private LocalDateTime endtime;
    private LocalDateTime lastUpdated;
    /** Attribute used carry information about the status of a job or step execution
     * It could be a custom value, but normally it will be one of these following:
     * UNKNOWN, EXECUTING, COMPLETED, NOOP, FAILED OR STOPPED.
     */
    private String exitStatus;

    public JobExecution getJobExecution() {
        return jobExecution;
    }

    public String getStepName() {
        return stepName;
    }

    public BatchStatus getStatus() {
        return status;
    }

    public long getReadCount() {
        return readCount;
    }

    public long getWriteCount() {
        return writeCount;
    }

    public long getCommitCount() {
        return commitCount;
    }

    public long getRollbackCount() {
        return rollbackCount;
    }

    public long getReadSkipCount() {
        return readSkipCount;
    }

    public long getProcessSkipCount() {
        return processSkipCount;
    }

    public long getFilterCount() {
        return filterCount;
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
