package com.jastrzab.designpatterns.structural.flyweight.forest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Tree {
    int x;
    int y;
    TreeType treeType;
}
