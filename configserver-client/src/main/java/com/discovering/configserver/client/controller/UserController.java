package com.discovering.configserver.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class UserRestController {

    @Value("${url:postgres://default:default123@default.com:5432/defaultdatabase}")
    private String postgresURL;

    @RequestMapping("/user")
    public String getUser() {
        return this.postgresURL;
    }
}
