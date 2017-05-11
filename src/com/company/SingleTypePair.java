package com.company;

/**
 * Created by mcarvajal on 01/05/2017.
 */

public class SingleTypePair<K extends String> extends OrderedPair {
    private K key;

    public SingleTypePair() {
        super();
    }
    public void setKey(K key){this.key = key;}
    public K getKey(){return key;}
}
