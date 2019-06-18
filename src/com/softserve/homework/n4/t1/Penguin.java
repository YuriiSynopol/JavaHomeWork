package com.softserve.homework.n4.t1;

public class Penguin extends NonFlyingBird {
    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return super.fly();
    }

    @Override
    public String toString() {
        return "Penguin "+ getFeathers() + " LayEggs "+ getLayEggs()+" " + fly();
    }
}
