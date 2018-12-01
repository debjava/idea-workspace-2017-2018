package com.ddlab.rnd.ms;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@EnableTask
public class SampleTask {

  @Bean
  public CommandLineRunner commandLineRunner() {
    return new HelloWorldCommandLineRunner();
  }

  public static void main(String[] args) {
    SpringApplication.run(SampleTask.class, args);
  }

  public static class HelloWorldCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
      System.out.println("Hello, World!");
      System.out.println("******************************");
      TimeUnit.SECONDS.sleep(5);
      System.out.println("******************************");
    }
  }

  // https://github.com/spring-cloud/spring-cloud-task/tree/master/spring-cloud-task-samples/timestamp

}
