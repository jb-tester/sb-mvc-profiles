package com.example.sbmvcprofiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * *
 * <p>Created by irina on 31.07.2020.</p>
 * <p>Project: sb-mvc-profiles</p>
 * *
 */
@Configuration
public class ExtraConfig {

    @Profile("p1") @Bean
    public MyDataBean data1() {
        return new MyDataBean("p1 data");
    }
    @Profile("p2") @Bean
    public MyDataBean data2() {
        return new MyDataBean("p2 data");
    }
}
