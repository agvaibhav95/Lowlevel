package com.vaibhav.lld.design.SchemaDesign.pen;

import com.vaibhav.lld.design.SchemaDesign.pen.constants.INK;
import com.vaibhav.lld.design.SchemaDesign.pen.model.Nib;
import com.vaibhav.lld.design.SchemaDesign.pen.model.Refill;

public interface Refillable {
    public void changeRefill(Refill refill);
    //factory method as gel pen will have only gel refill we have to stop object creation with
    //diff paramters
    //ball pen will have ball refill not gel refill
    // so we can define getRefill here or traditional way where class for refillfactory will provide refill obj
    public Refill getRefill(Nib nib, INK ink, double radius,boolean refillable);
    public boolean isRefillable();
    //as ball pen could be use and throw we can not change refill for them
}
