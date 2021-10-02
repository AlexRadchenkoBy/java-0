package com.company.door;

public class Door {
    private int height;

    public Door(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public boolean isBig() {
        return height > 2;
    }

    public boolean isBigger(Door door) {
        return height > door.getHeight();
    }
}
