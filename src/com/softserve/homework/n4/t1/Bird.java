package com.softserve.homework.n4.t1;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    public boolean getFeathers() {
        return feathers;
    }

    public boolean getLayEggs() {
        return layEggs;
    }

    public abstract String fly();


}

