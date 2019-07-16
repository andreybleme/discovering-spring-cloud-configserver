package com.discovering.configserver.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class DatabaseController {

    @Value("${url}")
    private String postgresURL;

    @RequestMapping("/database")
    public String getDatabase() {
        return this.postgresURL;
    }
}
