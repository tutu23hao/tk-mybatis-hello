package com.tian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author ：tianLe
 * @date ：Created in 2022/3/24 1:35 下午
 * @description：
 * @modified By：
 * @version:
 */
@SpringBootApplication
@MapperScan(basePackages = "com.tian.mapper")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
