package com.zrzyfw.myspringboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class MySpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class, args);
        log.info("\n\n^-^--^-^--^-^--^-^--^-^--^-^--^-^--^-^--启动成功--^-^--^-^--^-^--^-^--^-^--^-^--^-^--^-^\n");
    }

}
