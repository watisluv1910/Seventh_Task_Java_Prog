package org.seventhTask.firstSubtask;

public abstract class Dish {

    private String colour;
    private Boolean isCleaned;

    public Dish(String colour, Boolean isCleaned) {
        this.colour = colour;
        this.isCleaned = isCleaned;
    }

    public Boolean getCleaned() {
        return isCleaned;
    }

    public void Wash() {
        isCleaned = true;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "colour='" + colour + '\'' +
                ", isCleaned=" + isCleaned +
                '}';
    }
}
