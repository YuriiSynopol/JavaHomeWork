package com.softserve.homework.hw4.t1;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return "We can't fly";
    }
}
