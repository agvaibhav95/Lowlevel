package com.vaibhav.lld.design.SchemaDesign.pen;

import com.vaibhav.lld.design.SchemaDesign.Cache.Cache;
import com.vaibhav.lld.design.SchemaDesign.Cache.KeyValueCache;
import com.vaibhav.lld.design.SchemaDesign.Cache.LRUEvictionStrategy;
import lombok.Builder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class CacheTest {

    private Cache<String, String> cache;
    @Before
    public void setup(){
        cache=new KeyValueCache<>(10,1,new LRUEvictionStrategy<String>());
    }
    @Test
    public void testCache(){
    cache.create("test0","vaibhav");
        Assert.assertTrue("true","vaibhav".equals(cache.read("test0")));
    }
}
