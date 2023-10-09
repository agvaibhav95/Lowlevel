package com.vaibhav.lld.design.SchemaDesign.Cache;

public interface Cache<K,V> {
    public void create(K key,V value);
    public void update(K key,V value);
    public void delete(K key);
    public V read(K key);
}
