package br.com.springbatchmonitor.domain;

import java.io.Serializable;
import org.springframework.util.ClassUtils;

public class Entity implements Serializable {

    private Long id;
    private volatile Integer version;

    public Long getId() {
        return id;
    }

    public Integer getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return String.format("%s: id=%d, version=%d", ClassUtils.getShortName(getClass()), id, version);
    }
}
