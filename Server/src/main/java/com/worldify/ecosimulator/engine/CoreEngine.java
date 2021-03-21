package com.worldify.ecosimulator.engine;

import com.worldify.ecosimulator.pojo.organism.Organism;
import com.worldify.ecosimulator.pojo.world.map.Block;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @Author Zhiwen Zhu
 * @Date 2021/3/21 23:51
 * @Version 1.0
 * @Description
 */

@Component
public class CoreEngine {

    private List<Block> blocks;
    private List<Organism> organisms;

    @PostConstruct
    private void start() {
        
    }
}
