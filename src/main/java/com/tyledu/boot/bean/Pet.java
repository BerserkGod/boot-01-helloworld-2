package com.tyledu.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author 唐亚论
 * @version 1.0
 * Create by 2022/11/13 16:09
 */

@ToString
@Data
public class Pet {
    private String name;
    private Double weight;
}

