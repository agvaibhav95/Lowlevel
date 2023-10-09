package com.vaibhav.lld.design.SchemaDesign.Cache;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class KeyValueCache<K,V> implements Cache<K,V>{
    private int ttl;
    int capacity;
    private Map<K,V> hashmap=new ConcurrentHashMap<>();
    // diff threads will have diff values so data inconsistency
    // we need to add locks

    private EvictionStrategy<K> evictionStrategy;

    public KeyValueCache(int capacity,int ttl,EvictionStrategy<K> evictionStrategy){
        this.capacity=capacity;
        this.ttl=ttl;
        this.evictionStrategy=evictionStrategy;
    }

    @Override
    public void create(K key, V value) {
        // capacity check if(){}
        if(capacity >=20){
            K keyToRemove= evictionStrategy.evict();
            delete(keyToRemove);

            // we can have strategy of eviction also implemented.
        }
         hashmap.put(key,value);
        capacity++;
         return;

    }

    @Override
    public void update(K key, V value) {
         hashmap.put(key,value);
         return;
    }

    @Override
    public void delete(K key) {
        hashmap.remove(key);
        return;
    }

    @Override
    public V read(K key) {
        return hashmap.get(key);
    }
}
