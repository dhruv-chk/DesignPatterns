package org.patterns.builder;

public interface Builder {
    void buildCPU();
    void buildRam();
    void buildStorage();
    Computer getResult();
}
