package com.worldify.ecosimulator.util;

import com.worldify.ecosimulator.pojo.world.World;
import com.worldify.ecosimulator.pojo.world.map.Block;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author Zhiwen Zhu
 * @Date 2021/3/21 22:28
 * @Version 1.0
 * @Description A simplest world generator
 */
public class WorldGenerator {

    public static World generateRandomWorld(long x, long y, long z) {
        List<Block> blocks = generateRandomMap(x, y, z);
        return new World(blocks, null);
    }

    public static List<Block> generateRandomMap(long x, long y, long z) {
        List<Long> xs = Stream.iterate(-x, i -> i + 1).limit(2 * x + 1).collect(Collectors.toList());
        List<Long> ys = Stream.iterate(-y, i -> i + 1).limit(2 * y + 1).collect(Collectors.toList());
        List<Block> blocks = xs.parallelStream().flatMap(i -> ys.parallelStream().map(j ->
                new Block(UUID.randomUUID(), i, j, (long) (-z + Math.random() * 2 * z)))).collect(Collectors.toList());
        return blocks;
    }
}
