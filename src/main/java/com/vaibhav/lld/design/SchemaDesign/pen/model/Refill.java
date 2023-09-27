package com.vaibhav.lld.design.SchemaDesign.pen.model;

import com.vaibhav.lld.design.SchemaDesign.pen.constants.INK;
import com.vaibhav.lld.design.SchemaDesign.pen.constants.RefillType;
import lombok.Getter;

import java.util.Objects;


@Getter
public class Refill {
    private Nib nib;
    private INK ink;
    private RefillType type;
    private boolean isRefillable;

    //why is refillable bcoz there can be a useandThrow pen
    // why not a class for that--> yes we can but that pen will be gel pr ball pen
    //this wont effect anything creating another class
    // but we might end up in tying behaviour to class
    // it can lead to class explosion then

    private Refill(Nib nib, INK ink, RefillType type, boolean isRefillable) {
        this.ink = ink;
        this.nib = nib;
        this.isRefillable = isRefillable;
        this.type = type;
    }
    private Refill(){}

    public static RefillBuilder builder() {
        return new RefillBuilder();
    }

    public static class RefillBuilder {
        private Refill refill;

        RefillBuilder() {
            this.refill=new Refill();
        }

        public Refill build() {
            if (!isValid()) {
                throw new IllegalArgumentException("refill cannot be creted some thing is missing");
            }

            return new Refill(this.refill.nib, this.refill.ink, this.refill.type, this.refill.isRefillable);
        }

        private boolean isValid() {
            if ( Objects.isNull(this.refill.ink) || Objects.isNull(this.refill.nib) || Objects.isNull(this.refill.type)) {
                return false;
            }
            return true;
        }

        public RefillBuilder ink(INK ink) {
            this.refill.ink = ink;
            return this;
        }
        public RefillBuilder type(RefillType type) {
            this.refill.type = type;
            return this;
        }
        public RefillBuilder nib(Nib nib) {
            this.refill.nib = nib;
            return this;
        }
        public RefillBuilder isRefillable(boolean isRefillable) {
            this.refill.isRefillable = isRefillable;
            return this;
        }
    }
}
