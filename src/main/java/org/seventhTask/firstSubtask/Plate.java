package org.seventhTask.firstSubtask;

public class Plate extends Dish {

    private Integer radius;

    public Plate(String colour, Boolean isCleaned, Integer radius) {
        super(colour, isCleaned);
        this.radius = radius;
    }

    public Integer getRadius() {
        return radius;
    }

    @Override
    public void Wash() {
        super.Wash();
    }

    @Override
    public String toString() {
        return "Plate{" +
                "radius=" + radius +
                '}';
    }
}
