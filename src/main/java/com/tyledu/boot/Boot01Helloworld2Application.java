package com.tyledu.boot;

import com.tyledu.boot.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Boot01Helloworld2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Boot01Helloworld2Application.class, args);
        System.out.println(run.getApplicationName());
    }

}
