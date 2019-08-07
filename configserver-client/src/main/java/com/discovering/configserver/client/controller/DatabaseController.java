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
    
    @Value("${url.encrypted}")
    private String securePostgresURL;

    @RequestMapping("/database")
    public String getDatabase() {
        return "Unsafe: " + this.postgresURL + " - Safe: " + securePostgresURL;
    }
}
