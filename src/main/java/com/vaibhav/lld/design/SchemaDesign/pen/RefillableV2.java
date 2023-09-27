package com.vaibhav.lld.design.SchemaDesign.pen;

import com.vaibhav.lld.design.SchemaDesign.pen.model.Refill;

public interface RefillableV2 {

    public void changeRefill(Refill refill);

    public boolean isRefillable();
    //as ball pen could be use and throw we can not change refill for them
}
