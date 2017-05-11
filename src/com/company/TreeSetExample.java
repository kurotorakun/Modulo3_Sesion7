package com.company;

/**
 * Created by mcarvajal on 01/05/2017.
 */
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    private TreeSet tree = new TreeSet();

    public void getReady(){
        tree.add("b");
        tree.add("c");
        tree.add("a");
    }
    public void writeTree(){
        System.out.println("- " + tree + " -");
    }
}
