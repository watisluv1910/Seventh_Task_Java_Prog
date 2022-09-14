package org.seventhTask.firstSubtask;

public class Cup extends Dish {

    private Integer capacity;

    public Cup(String colour, Boolean isCleaned, Integer capacity) {
        super(colour, isCleaned);
        this.capacity = capacity;
    }

    public Integer getCapacity() {
        return capacity;
    }

    @Override
    public void Wash() { super.Wash(); }

    @Override
    public String toString() {
        return "Cup{" +
                "capacity=" + capacity +
                '}';
    }
}
