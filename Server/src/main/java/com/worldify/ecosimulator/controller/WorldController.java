package com.worldify.ecosimulator.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.worldify.ecosimulator.util.WorldGenerator;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Zhiwen Zhu
 * @Date 2021/3/22 10:46
 * @Version 1.0
 * @Description
 */

@RestController
@RequestMapping("/world")
public class WorldController {

    @RequestMapping("/map/random")
    public String generateRandomMap(@RequestParam("x") long x, @RequestParam("y") long y, @RequestParam("z") long z) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(WorldGenerator.generateRandomMap(x, y, z));
        } catch (JsonProcessingException e) {
            return e.getMessage();
        }
    }

    @RequestMapping("/ping")
    @ResponseBody
    public String ping() {
        return "pong";
    }

}
