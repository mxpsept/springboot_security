package com.ssy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author lucky
 * @date 2021/2/22
 * description:
 **/
@SpringBootApplication
public class SecurityApplication extends SpringBootServletInitializer {

    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
        System.out.println(
                "************************************************************\n" +
                        "**                                                        **\n" +
                        "**                系统启动成功！     SUCCESS！               **\n" +
                        "**                                                        **\n" +
                        "************************************************************\n");

    }

    /**
     * 打war包
     * @param application
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SecurityApplication.class);
    }
}


