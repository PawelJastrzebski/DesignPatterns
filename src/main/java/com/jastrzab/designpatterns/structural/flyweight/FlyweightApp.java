package com.jastrzab.designpatterns.structural.flyweight;

import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.structural.flyweight.forest.Tree;
import com.jastrzab.designpatterns.structural.flyweight.forest.TreeType;
import com.jastrzab.designpatterns.structural.flyweight.forest.TreeTypeFactory;

import java.util.*;

public class FlyweightApp implements Application {
    @Override
    public String appName() {
        return "Flyweight";
    }

    @Override
    public void startApplication() {
        List<String> treeNames = new ArrayList<>();
        treeNames.add("Oak");
        treeNames.add("Pine");
        treeNames.add("Birch");
        treeNames.add("Maple");
        treeNames.add("Willow");

        List<String> treeColors = new ArrayList<>();
        treeColors.add("Green");
        treeColors.add("Dark Green");
        treeColors.add("White");
        treeColors.add("Red");
        treeColors.add("Gray");

        List<String> treeTextures = new ArrayList<>();
        treeTextures.add("Rough");
        treeTextures.add("Smooth");
        treeTextures.add("Papery");
        treeTextures.add("Fibrous");
        treeTextures.add("Cracked");


        List<Tree> forest = new LinkedList<>();
        Random random = new Random();
        for (int i = 0 ; i < 100_000; i++) {
            String randomName = treeNames.get(random.nextInt(treeNames.size()));
            String randomColor = treeColors.get(random.nextInt(treeColors.size()));
            String randomTexture = treeTextures.get(random.nextInt(treeTextures.size()));

            TreeType type = TreeTypeFactory.getTree(randomName, randomColor, randomTexture);
            int x = random.nextInt(10_000_000);
            int y = random.nextInt(10_000_000);
            forest.add(new Tree(x, y, type));
        }

        if (forest.size() == 100_000) {
            System.out.println("Forest is ready");
        }

        System.out.println("Tree types: " + TreeTypeFactory.cache.size());
    }
}
