package com.example.recoverycalculator;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class EllipticalTest {

    Elliptical testChute = new Elliptical(1.0f, 4);
    @Test
    public void ellipticalTest() {
        assertEquals(4, testChute.getArea());
    }

}