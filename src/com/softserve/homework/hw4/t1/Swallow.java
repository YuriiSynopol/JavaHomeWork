package com.softserve.homework.hw4.t1;

public class Swallow  extends FlyingBird {
    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {

        return super.fly();
    }

    @Override
    public String toString() {
        return "Swallow Feathers "+ getFeathers() + " LayEggs "+ getLayEggs()+" " + fly();
    }
}
