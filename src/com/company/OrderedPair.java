package com.company;

/**
 * Created by mcarvajal on 01/05/2017.
 */
public class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public OrderedPair(){

    }

    public void setKey(K key){this.key = key;}
    public void setValue(V value){
        this.value = value;
    }
    public K getKey(){return key;}
    public V getValue(){return value;}
}
