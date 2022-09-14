package org.seventhTask.thirdSubtask;

public class Chair extends Furniture {

    public Chair(Integer price, Integer height, Integer width, Integer weight) {
        super(price, height, width, weight);
    }

    public boolean isComfortable() {
        return (getHeight() > 100) && (getWidth() > 40);
    }
}
