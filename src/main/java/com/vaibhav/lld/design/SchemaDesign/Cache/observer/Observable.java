package com.vaibhav.lld.design.SchemaDesign.Cache.observer;

import com.vaibhav.lld.design.SchemaDesign.Cache.EvictionStrategy;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable<K> {

    private List<EvictionStrategy> evictionStrategyList=new ArrayList<>();
    public void addEvictionPolicy(EvictionStrategy evictionStrategy){
        this.evictionStrategyList.add(evictionStrategy);
    }

    public void remove(EvictionStrategy evictionStrategy){
        this.evictionStrategyList.remove(evictionStrategy);
    }
    public  void notify(K key){
        for(EvictionStrategy evictionStrategy:evictionStrategyList){
           // evictionStrategy.add();
        }
    }
}
