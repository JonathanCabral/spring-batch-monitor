package br.com.springbatchmonitor.domain;

public enum BatchStatus {
    /**
     * Status of a batch job that successfully completed its execution
     */
    COMPLETED,
    /**
     * Status of a batch job prior to its execution
     */
    STARTING,
    /**
     * Status of a batch job that is running
     */
    STARTED,
    /**
     * Status of a batch job waiting for a step to complete before stopping the batch job
     */
    STOPPING,
    /**
     * Status of a batch job that has been stopped be request
     */
    STOPPED,
    /**
     * Status of a batch job that has failed during its execution
     */
    FAILED,
    /**
     * Status of a batch job that did not stop properly and can not be restarted
     */
    ABANDONED,
    /**
     * Status of a batch job that is in an uncertain state
     */
    UNKNOWN;

    /**
     * @return true if the status is STARTING, STARTED OR STOPPING
     */
    public boolean isRunning() {
        return this == STARTING || this == STARTED || this == STOPPING;
    }

    /**
     * @return true if the status is FAILED or greater
     */
    public boolean isUnsuccessful() {
        return this == FAILED || this.isGreaterThan(FAILED);
    }

    private boolean isGreaterThan(BatchStatus other) {
        return this.compareTo(other) < 0;
    }
}
