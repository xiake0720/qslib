package com.cct.qslib;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cct.**.mapper")
public class QslibApplication {

    public static void main(String[] args) {
        SpringApplication.run(QslibApplication.class, args);
    }

}
