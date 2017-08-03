package com.tufuzk.materialdemo;

/**
 * Created by root on 17-8-3.
 */

public class Fruit {
    private String fruitName;
    private int fruitImageId;

    public Fruit(String fruitName, int fruitImageId) {
        this.fruitName = fruitName;
        this.fruitImageId = fruitImageId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public int getFruitImageId() {
        return fruitImageId;
    }
}
