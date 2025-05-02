package com.example.recoverycalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RocketTest {

    @Test
    public void rocketTest() {
        Elliptical testChute = new Elliptical(1.0f, 4);
        Rocket testRocket = new Rocket(testChute);

        testRocket.airDensity = 1.0f;
        testRocket.weight = 8.0f;
        testRocket.dragCoefficient = 1.0f;

        assertEquals(2.0f, testRocket.calculate("velocity"));
    }

}