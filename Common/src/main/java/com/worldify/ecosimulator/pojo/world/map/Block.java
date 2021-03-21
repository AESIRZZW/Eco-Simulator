package com.worldify.ecosimulator.pojo.world.map;

import lombok.Data;
import java.util.UUID;

/**
 * @Author Zhiwen Zhu
 * @Date 2021/3/21 21:45
 * @Version 1.0
 * @Description The atomic unit of the world in EcoSimulator
 */
@Data
public class Block {

    // The UUID of the block
    private UUID blockID;
    // The coordinates of each block is a ternary vector
    private long[] coordinate = new long[3];

}
