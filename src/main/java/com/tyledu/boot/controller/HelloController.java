package com.tyledu.boot.controller;

import com.tyledu.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 唐亚论
 * @version 1.0
 * Create by 2022/11/13 16:25
 */
@RestController
public class HelloController {
    @Autowired
    Person person;
    @RequestMapping("/person")
    public Person person(){
        System.out.println(person.getUserName());
        return person;
    }
}
