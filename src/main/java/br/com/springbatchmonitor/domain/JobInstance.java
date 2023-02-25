package br.com.springbatchmonitor.domain;

public class JobInstance extends Entity {

    private String jobName;

    public String getJobName() {
        return jobName;
    }

    @Override
    public String toString() {
        return super.toString() + ", Job=[" + jobName + "]";
    }
}
