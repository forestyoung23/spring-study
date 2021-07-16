package com.forest;

import com.forest.beanlifecycle.BeanPostProcessorTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringStudyApplication.class, args);
    }

}

@Configuration
class BeanConfig {
    @Bean
    public BeanPostProcessorTest beanPostProcessorTest() {
        System.out.println("test BeanPostProcessorTest");
        return new BeanPostProcessorTest();
    }
}
