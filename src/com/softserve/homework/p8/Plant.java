package com.softserve.homework.p8;

import java.io.IOException;

public class Plant {

    private Type type;
    private Color color;
    private int size;

    public Plant(String type, String color, int size) throws ColorException, TypeException, IOException {

        this.type = Type.getTypeInEnum(type);
        this.color = Color.getColorInEnum(color);
        this.size = size;
    }


    @Override
    public String toString() {
        return "Plant{" +
                "type=" + type +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}
