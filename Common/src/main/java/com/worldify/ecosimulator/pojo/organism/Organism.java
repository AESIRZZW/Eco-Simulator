package com.worldify.ecosimulator.pojo.organism;

import lombok.Data;

import java.util.UUID;

/**
 * @Author Zhiwen Zhu
 * @Date 2021/3/21 22:14
 * @Version 1.0
 * @Description
 */
@Data
public abstract class Organism {
    // Which block the organism is currently in
    private UUID blockID;
}
