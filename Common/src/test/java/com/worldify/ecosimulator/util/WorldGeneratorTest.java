package com.worldify.ecosimulator.util;

import com.worldify.ecosimulator.pojo.world.map.Block;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @Author Zhiwen Zhu
 * @Date 2021/3/22 09:44
 * @Version 1.0
 * @Description
 */
public class WorldGeneratorTest {

    @Test
    public void testGenerateRandomMap() {
        System.out.println("Current Heap Size: " + Runtime.getRuntime().totalMemory());
        System.out.println("Max Heap Size: " + Runtime.getRuntime().maxMemory());

        long start = System.currentTimeMillis();
        List<Block> blocks = WorldGenerator.generateRandomMap(64, 64, 8);
        long duration = System.currentTimeMillis() - start;
        System.out.println("The map has been generated and took " + duration + "ms");

        Assert.assertEquals(blocks.size(), (64 * 2 + 1) * (64 * 2 + 1));
    }
}
