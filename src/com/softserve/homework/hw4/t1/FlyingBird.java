package com.softserve.homework.hw4.t1;

public class FlyingBird extends Bird {

    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly()
    {
        return "We can fly!!!";
    }
}
