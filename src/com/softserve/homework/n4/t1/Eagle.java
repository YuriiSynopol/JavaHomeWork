package com.softserve.homework.n4.t1;

public class Eagle extends FlyingBird {

    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return super.fly();
    }
    @Override
    public String toString() {
        return "Eagle "+ getFeathers() + " LayEggs "+ getLayEggs()+" " + fly();
    }
}
