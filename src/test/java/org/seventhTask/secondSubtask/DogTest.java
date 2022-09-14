package org.seventhTask.secondSubtask;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DogTest {

    Integer age, height, weight;

    @Before
    public void setUp() {
        age = 7;
        height = 45;
        weight = 35;
    }

    @Test
    public void testDog() {
        Dog dog = new Alabai(age, height, weight);
        dog.givePow();
        Integer result = 28;
        Assert.assertEquals("Age human age should be 4 * dog age", result, dog.translateToHuman());
    }

    @Test
    public void testAlabai() {
        Alabai alabai = new Alabai(age, height, weight);
        alabai.graze();
        Assert.assertTrue("The dog should be tired after grazing", alabai.isTired());
    }

    @Test
    public void testBeagle() {
        Beagle beagle = new Beagle(age, height, weight);
        beagle.chase();
        Assert.assertTrue("The dog should be tired after chasing", beagle.isTired());
    }

    @Test
    public void testRest() {
        Beagle beagle = new Beagle(age, height, weight);
        beagle.chase();
        beagle.rest();
        Assert.assertFalse("The dog should not be tired", beagle.isTired());
    }
}
