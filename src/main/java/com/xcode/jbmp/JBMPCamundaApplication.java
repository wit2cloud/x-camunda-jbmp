package com.xcode.jbmp;

import org.camunda.bpm.engine.impl.RuntimeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JBMPCamundaApplication {
    public static void main(String[] args) {
        //RuntimeServiceImpl
        SpringApplication.run(JBMPCamundaApplication.class, args);
    }
}
