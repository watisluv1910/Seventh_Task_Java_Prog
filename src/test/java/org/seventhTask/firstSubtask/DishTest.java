package org.seventhTask.firstSubtask;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DishTest {

    String colour;
    Integer radius, capacity;

    @Before
    public void setUp() {
        colour = "red";
        radius = 7;
        capacity = 150;
    }

    @Test
    public void testWashing() {
        Cup cup = new Cup(colour, false, capacity);
        cup.Wash();
        Assert.assertTrue("The cup should be washed!", cup.getCleaned());
    }

    @Test
    public void testCup() {
        Cup cup = new Cup(colour, false, capacity);
        Integer result = 150;
        Assert.assertEquals("The capacity should be 150", result, cup.getCapacity());
    }

    @Test
    public void testPlate() {
        Plate plate = new Plate(colour, false, radius);
        Integer result = 7;
        Assert.assertEquals("The radius should be 7", result, plate.getRadius());
    }
}
