package com.jastrzab.designpatterns.structural.flyweight.forest;

import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {
    public final static Map<String, TreeType> cache = new HashMap<>();

    public static TreeType getTree(String name, String color, String texture) {
        String key = name + color + texture;
        TreeType data = cache.get(key);
        if (data != null) return data;
        // Create new
        data = new TreeType(color, texture);
        cache.put(key, data);
        return data;
    }

}
