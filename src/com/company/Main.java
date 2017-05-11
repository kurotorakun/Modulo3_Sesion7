package com.company;

public class Main {
    public static void main(String[] args) {
        // FIRST QUESTION
        TreeSetExample p1 = new TreeSetExample();
        p1.getReady(); // Set TreeSet Data
        p1.writeTree(); // Write TreeSet Data
        // SECOND QUESTION
        OrderedPair<String, Integer> p2 = new OrderedPair<String, Integer>();
        p2.setKey("Pregunta");
        p2.setValue(2);
        System.out.println("- " +p2.getKey()+"-"+p2.getValue()+" -");
        // THIRD QUESTION
        SingleTypePair<String> p3 = new SingleTypePair<String>();
        p3.setKey("Pregunta 3");
        System.out.println("- "+ p3.getKey() +" -");
    }
}
