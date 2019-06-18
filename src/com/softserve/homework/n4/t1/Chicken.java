package com.softserve.homework.n4.t1;

public class Chicken extends NonFlyingBird {

    public Chicken(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return super.fly();
    }
    @Override
    public String toString() {
        return "Chicken "+ getFeathers() + " LayEggs "+ getLayEggs()+" " + fly();
    }
}
