package org.rapidpm;

import com.google.common.base.Predicates;
import com.google.common.cache.AbstractLoadingCache;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import javafx.scene.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/**
 * Created by Sven Ruppert on 29.09.2014.
 */
public class Demo {

  public static void main(String[] args) {
    DemoNode d = new DemoNode();
    d.txt = "Hallo";

    List<DemoNode> rootNodes = new ArrayList<>();
    rootNodes.add(d);
    final ImmutableSet<DemoNode> objects = ImmutableSet.copyOf(rootNodes);
    System.out.println("objects = " + objects);
    for (final DemoNode object : objects) {
      System.out.println("object.txt = " + object.txt);
    }




//    Iterable<Node> rootNodes = Iterables.transform(windows, toRootNodeFunction());
//    toResultNodesFunction
    Iterable<Set<DemoNode>> resultNodeSets = Iterables.transform(rootNodes, new AbstractLoadingCache<DemoNode, Set<DemoNode>>() {
      @Override
      public Set<DemoNode> get(DemoNode demoNode) throws ExecutionException {
        Set<DemoNode> result = new HashSet<>();
        result.add(demoNode);
        return result;
      }

      @Override
      public Set<DemoNode> getIfPresent(Object o) {
        return null;
      }
    });
    Iterable<DemoNode> resultNodes = Iterables.concat(resultNodeSets);
    final Iterable<DemoNode> filteredNodes = Iterables.filter(resultNodes, Predicates.notNull());
    for (final DemoNode object : filteredNodes) {
      System.out.println("filteredNodes.txt = " + object.txt);
    }


  }

  public static class DemoNode {
    public String txt;

    public DemoNode() {
      System.out.println("DemoNode==txt = " + txt);
    }
  }
}
