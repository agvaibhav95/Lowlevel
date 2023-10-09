package com.vaibhav.lld.design.SchemaDesign.Cache;

public interface EvictionStrategy<K> {
    public K evict();
    public void add(K key);
}
