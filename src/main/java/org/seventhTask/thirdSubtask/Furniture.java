package org.seventhTask.thirdSubtask;

public abstract class Furniture {

    private Integer price, height, width, weight;

    public Furniture(Integer price, Integer height, Integer width, Integer weight) {
        this.price = price;
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "price=" + price +
                ", height=" + height +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }
}
