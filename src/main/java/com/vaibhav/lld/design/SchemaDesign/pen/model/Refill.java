package com.vaibhav.lld.design.SchemaDesign.pen.model;

import com.vaibhav.lld.design.SchemaDesign.pen.constants.INK;
import com.vaibhav.lld.design.SchemaDesign.pen.constants.RefillType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Refill {
    private Nib nib;
    private INK ink;
    private double radius;
    private RefillType type;
    private boolean isRefillable;
}
