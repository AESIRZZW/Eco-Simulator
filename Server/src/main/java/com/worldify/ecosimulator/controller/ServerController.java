package com.worldify.ecosimulator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Zhiwen Zhu
 * @Date 2021/3/22 11:01
 * @Version 1.0
 * @Description
 */

@RestController
public class ServerController {
    @RequestMapping("/ping")
    public String ping() {
        return "pong";
    }
}
