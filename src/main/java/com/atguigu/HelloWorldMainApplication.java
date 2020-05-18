package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author niu
 * @create 2020-05-17-21:09
 */

/**
 * SpringBootConfiguration来标注一个spring boot 主程序，说明这是一个springboot主程序应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
