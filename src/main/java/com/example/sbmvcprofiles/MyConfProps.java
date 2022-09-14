package com.example.sbmvcprofiles;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * *
 * <p>Created by irina on 17.08.2020.</p>
 * <p>Project: sb-mvc-profiles</p>
 * *
 */
@ConfigurationProperties("my.props")
public class MyConfProps {
    
    String port;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
