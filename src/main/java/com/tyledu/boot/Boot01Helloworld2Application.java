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
        System.out.println("hello git3");
        System.out.println("合并测试---hotfix");
        System.out.println("合并测试---master");
        System.out.println("合并测试---hotfix 第二次");
        System.out.println("push test");
    }
}
